package org.example;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.example.core.PointsCalculator;
import org.example.core.ReportGenerator;
import org.example.helper.StockRankOutputHelper;
import org.example.model.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ranking {
    public static void main(String[] args) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {

        Ranking ranking=new Ranking();
String dailyIndicatorFileName="C:\\Users\\snehal.shah\\algofinserve\\New folder\\RankingSystem\\src\\main\\resources\\Daily-Indicator-Data.csv";
        String weeklyIndicatorFileName="C:\\Users\\snehal.shah\\algofinserve\\New folder\\RankingSystem\\src\\main\\resources\\Weekly-Indicator-Data.csv";
        String monthlyIndicatorFileName="C:\\Users\\snehal.shah\\algofinserve\\New folder\\RankingSystem\\src\\main\\resources\\Monthly-Indicator-Data.csv";
        String min75IndicatorFileName="C:\\Users\\snehal.shah\\algofinserve\\New folder\\RankingSystem\\src\\main\\resources\\MIN75-Indicator-Data.csv";


        String ohlcFileName="C:\\Users\\snehal.shah\\algofinserve\\New folder\\RankingSystem\\src\\main\\resources\\HIGH-LOW-DATA.csv";

        String stockRankReport="C:\\Users\\snehal.shah\\algofinserve\\New folder\\RankingSystem\\src\\main\\resources\\output\\STOCK_RANK_REPORT.csv";

        List<StockOHLCData> ohlcData= ranking.csvToHLData(ohlcFileName);
        List<IndicatorData> indicatorD= ranking.csvToIndicatorData(dailyIndicatorFileName);
        Map<String,IndicatorData> indicatorDailyDataForSymbolMap=indicatorD.stream().collect(Collectors.toMap(p->p.getSymbol(),p->p));

        List<IndicatorData> indicatorW= ranking.csvToIndicatorData(weeklyIndicatorFileName);
        Map<String,IndicatorData> indicatorWeeklyDataForSymbolMap=indicatorW.stream().collect(Collectors.toMap(p->p.getSymbol(),p->p));

        List<IndicatorData> indicatorM= ranking.csvToIndicatorData(monthlyIndicatorFileName);
        Map<String,IndicatorData> indicatorMonthlyDataForSymbolMap=indicatorM.stream().collect(Collectors.toMap(p->p.getSymbol(),p->p));

        List<IndicatorData> indicatorMIN75= ranking.csvToIndicatorData(min75IndicatorFileName);
        Map<String,IndicatorData> indicatorMIN75DataForSymbolMap=indicatorMIN75.stream().collect(Collectors.toMap(p->p.getSymbol(),p->p));


        Map<String, StockData> stocksDataForSymbolMap= populateStockDataForSymbolMap(ohlcData, indicatorDailyDataForSymbolMap,
                indicatorWeeklyDataForSymbolMap, indicatorMonthlyDataForSymbolMap,
                indicatorMIN75DataForSymbolMap);
Map<String, StockRank> stockRankForSymbol= populateAndGetStockRank(stocksDataForSymbolMap);

/*for(StockRank stockRank:stockRankForSymbol.values()){
    System.out.println(stockRank.toString());
}*/
List<StockRankOutput> stockRankOutputList= StockRankOutputHelper.getStockRankOutputList(stocksDataForSymbolMap);
generateStockRankReport(stockRankReport,stockRankOutputList);


    }

    private static void generateStockRankReport(String stockRankReport, List<StockRankOutput> stockRankOutputList) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException {
        ReportGenerator reportGenerator=new ReportGenerator();
        reportGenerator.generateStockRankReport1(stockRankReport,stockRankOutputList);
    }

    private static Map<String, StockRank> populateAndGetStockRank(Map<String, StockData> stocksDataForSymbolMap){
        PointsCalculator pointsCalculator=new PointsCalculator();
        Map<String, StockRank> stockRankForSymbol=new HashMap<>();
        for(StockData stockData:stocksDataForSymbolMap.values()){
            stockRankForSymbol.put(stockData.getSymbol(), pointsCalculator.getStockRankForSymbol(stockData));
        }
        return stockRankForSymbol;
    }

    private static Map<String,StockData> populateStockDataForSymbolMap(List<StockOHLCData> ohlcData, Map<String, IndicatorData> indicatorDailyDataForSymbolMap,
                                                                       Map<String, IndicatorData> indicatorWeeklyDataForSymbolMap,
                                                                       Map<String, IndicatorData> indicatorMonthlyDataForSymbolMap,
                                                                       Map<String, IndicatorData> indicatorMIN75DataForSymbolMap) {
        Map<String,StockData> stockDataMap=new HashMap<>();
        for(StockOHLCData o: ohlcData){

            if(!stockDataMap.containsKey(o.getSymbol())) {

                StockData stockData = new StockData();
                stockData.setSymbol(o.getSymbol());
                stockData.setStockOHLCData(o);
                if (stockData.getIndicatorData() == null) {
                    Map<CandleTimeFrame, IndicatorData> indicatorDataMap = new HashMap<>();
                    indicatorDataMap.put(CandleTimeFrame.DAILY, indicatorDailyDataForSymbolMap.get(o.getSymbol()));
                    indicatorDataMap.put(CandleTimeFrame.WEEKLY, indicatorWeeklyDataForSymbolMap.get(o.getSymbol()));
                    indicatorDataMap.put(CandleTimeFrame.MONTHLY, indicatorMonthlyDataForSymbolMap.get(o.getSymbol()));
                    indicatorDataMap.put(CandleTimeFrame.SEVENTY_FIVE_MINUTE, indicatorMIN75DataForSymbolMap.get(o.getSymbol()));
                    stockData.setIndicatorData(indicatorDataMap);
                } else {
                    Map<CandleTimeFrame, IndicatorData> indicatorDataMap =stockData.getIndicatorData();
                    indicatorDataMap.put(CandleTimeFrame.DAILY, indicatorDailyDataForSymbolMap.get(o.getSymbol()));
                    indicatorDataMap.put(CandleTimeFrame.WEEKLY, indicatorWeeklyDataForSymbolMap.get(o.getSymbol()));
                    indicatorDataMap.put(CandleTimeFrame.MONTHLY, indicatorMonthlyDataForSymbolMap.get(o.getSymbol()));
                    indicatorDataMap.put(CandleTimeFrame.SEVENTY_FIVE_MINUTE, indicatorMIN75DataForSymbolMap.get(o.getSymbol()));

                }
                stockDataMap.put(o.getSymbol(),stockData);
            }

        }
        return stockDataMap;
    }

    public List<IndicatorData> csvToIndicatorData(String fileName) throws IOException {
    CsvMapper mapper = new CsvMapper();
    CsvSchema schema = CsvSchema.emptySchema().withHeader();
    File file = new File(fileName);
    MappingIterator<IndicatorData> it = mapper.readerFor(IndicatorData.class).with(schema).readValues(file);
    List<IndicatorData> dataList = it.readAll();
    return dataList;
}

    public List<StockOHLCData> csvToHLData(String fileName) throws IOException {
        CsvMapper mapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();
        File file = new File(fileName);
        MappingIterator<StockOHLCData> it = mapper.readerFor(StockOHLCData.class).with(schema).readValues(file);
        List<StockOHLCData> dataList = it.readAll();
        return dataList;
    }

}