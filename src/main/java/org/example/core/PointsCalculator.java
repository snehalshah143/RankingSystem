package org.example.core;

import org.example.helper.*;
import org.example.model.*;

import java.util.HashMap;
import java.util.Map;

public class PointsCalculator {

public static Map<CandleTimeFrame,Integer> multipleierMap=new HashMap<>();

public PointsCalculator(RankingMultiple rankingMultiple){
    multipleierMap.put(CandleTimeFrame.MONTHLY,rankingMultiple.getM_Multiple());
    multipleierMap.put(CandleTimeFrame.WEEKLY,rankingMultiple.getW_Multiple());
    multipleierMap.put(CandleTimeFrame.DAILY,rankingMultiple.getD_Multiple());
    multipleierMap.put(CandleTimeFrame.SEVENTY_FIVE_MINUTE,rankingMultiple.getMIN75_Multiple());
}

    public StockRank getStockRankForSymbol(StockData stockData){
        Integer overALlPoints=0;
        StockRank stockRank = new StockRank();
        stockRank.setSymbol(stockData.getSymbol());

        //Calculate Indicator Rank For Daily
        IndicatorRank indicatorRankDaily = populateAndGetIndicatorRankForTimeFrame(stockData, stockRank,CandleTimeFrame.DAILY);
        overALlPoints=overALlPoints+indicatorRankDaily.getIndicatorOverAllPoints();

        //Calculate Indicator Rank For WEEKLY
        IndicatorRank indicatorRankWeekly = populateAndGetIndicatorRankForTimeFrame(stockData, stockRank,CandleTimeFrame.WEEKLY);
        overALlPoints=overALlPoints+indicatorRankWeekly.getIndicatorOverAllPoints();

        //Calculate Indicator Rank For MONTHLY
        IndicatorRank indicatorRankMonthly = populateAndGetIndicatorRankForTimeFrame(stockData, stockRank,CandleTimeFrame.MONTHLY);
        overALlPoints=overALlPoints+indicatorRankMonthly.getIndicatorOverAllPoints();

        //Calculate Indicator Rank For SEVENTY_FIVE
        IndicatorRank indicatorRankMIN75 = populateAndGetIndicatorRankForTimeFrame(stockData, stockRank,CandleTimeFrame.SEVENTY_FIVE_MINUTE);
        overALlPoints=overALlPoints+indicatorRankMIN75.getIndicatorOverAllPoints();


        Integer hlBreakoutPoints=HLBreakoutPointsHelper.calculatePoints(stockData.getStockOHLCData());
        stockRank.setBreakoutPoints(hlBreakoutPoints);

        overALlPoints=overALlPoints+hlBreakoutPoints;


        stockRank.setOverAllPoints(overALlPoints);
        stockData.setStockRank(stockRank);
        return stockRank;
    }

    private IndicatorRank populateAndGetIndicatorRankForTimeFrame
            (StockData stockData, StockRank stockRank,CandleTimeFrame candleTimeFrame) {
        IndicatorRank indicatorRank=getIndicatorRank(stockData,candleTimeFrame);

        stockRank.getIndicatorRankForTimeFrame().put(candleTimeFrame,indicatorRank);
        return indicatorRank;
    }


    private IndicatorRank getIndicatorRank(StockData stockData,CandleTimeFrame candleTimeFrame){
        IndicatorRank indicatorRank=new IndicatorRank();
        Integer overAllIndicatorPoints=0;
        Integer  adxPoints=ADXAndSuperTrendPointsHelper.calculatePoints(stockData.getStockOHLCData(), stockData.getIndicatorData().get(candleTimeFrame),candleTimeFrame );
        indicatorRank.setAdxPoints(adxPoints);
        overAllIndicatorPoints=overAllIndicatorPoints+adxPoints;
        Integer  emaPoints=EMAPointsHelper.calculatePoints(stockData.getStockOHLCData(), stockData.getIndicatorData().get(candleTimeFrame),candleTimeFrame );
        indicatorRank.setEmaPoints(emaPoints);
        overAllIndicatorPoints=overAllIndicatorPoints+emaPoints;
        Integer  macdPoints=MACDPointsHelper.calculatePoints(stockData.getStockOHLCData(), stockData.getIndicatorData().get(candleTimeFrame),candleTimeFrame );
        indicatorRank.setMacdPoints(macdPoints);
        overAllIndicatorPoints=overAllIndicatorPoints+macdPoints;
        Integer  rsiPoints= RSIPointsHelper.calculatePoints(stockData.getStockOHLCData(), stockData.getIndicatorData().get(candleTimeFrame),candleTimeFrame );
        indicatorRank.setRsiPoints(rsiPoints);
        overAllIndicatorPoints=overAllIndicatorPoints+rsiPoints;
        Integer  volumePoints= VolumePointsHelper.calculatePoints(stockData.getStockOHLCData(), stockData.getIndicatorData().get(candleTimeFrame),candleTimeFrame );
        indicatorRank.setVolumePoints(volumePoints);
        overAllIndicatorPoints=overAllIndicatorPoints+volumePoints;
        Integer  kstPoints= KstPointsHelper.calculatePoints(stockData.getStockOHLCData(), stockData.getIndicatorData().get(candleTimeFrame),candleTimeFrame );
        indicatorRank.setKstPoints(kstPoints);
        overAllIndicatorPoints=overAllIndicatorPoints+kstPoints;

        //Multiplier
        overAllIndicatorPoints=overAllIndicatorPoints * multipleierMap.get(candleTimeFrame);
        indicatorRank.setIndicatorOverAllPoints(overAllIndicatorPoints);
        return indicatorRank;
    }


}
