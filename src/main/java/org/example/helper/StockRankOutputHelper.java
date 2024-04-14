package org.example.helper;

import org.example.model.*;

import java.util.*;

public class StockRankOutputHelper {

    public static List<StockRankOutput> getStockRankOutputList(Map<String, StockData> stockDataMap){

        List<StockRankOutput> stockRankOutputList=new ArrayList<>();

        for(StockData stockData: stockDataMap.values()){
            StockRank stockRank=stockData.getStockRank();
            IndicatorRank M_ir=stockRank.getIndicatorRankForTimeFrame().get(CandleTimeFrame.MONTHLY);
            IndicatorRank W_ir=stockRank.getIndicatorRankForTimeFrame().get(CandleTimeFrame.WEEKLY);
            IndicatorRank D_ir=stockRank.getIndicatorRankForTimeFrame().get(CandleTimeFrame.DAILY);
            IndicatorRank MIN75_ir=stockRank.getIndicatorRankForTimeFrame().get(CandleTimeFrame.SEVENTY_FIVE_MINUTE);
            StockRankOutput stockRankOutput=new StockRankOutput();
            stockRankOutput.setSymbol(stockData.getSymbol());

            stockRankOutput.setAllRank(1);
            stockRankOutput.setM_Rank(1);
            stockRankOutput.setW_Rank(1);
            stockRankOutput.setD_Rank(1);
            stockRankOutput.setMIN75_Rank(1);

            stockRankOutput.setAllPoints(stockRank.getOverAllPoints());
            stockRankOutput.setHL_BreakoutPoints(stockRank.getBreakoutPoints());
            stockRankOutput.setM_IndicatorPoints(M_ir.getIndicatorOverAllPoints());
            stockRankOutput.setW_IndicatorPoints(W_ir.getIndicatorOverAllPoints());
            stockRankOutput.setD_IndicatorPoints(D_ir.getIndicatorOverAllPoints());
            stockRankOutput.setM_IndicatorPoints(MIN75_ir.getIndicatorOverAllPoints());

            stockRankOutput.setD_adxPoints(D_ir.getAdxPoints());
            stockRankOutput.setD_emaPoints(D_ir.getEmaPoints());
            stockRankOutput.setD_kstPoints(D_ir.getKstPoints());
            stockRankOutput.setD_macdPoints(D_ir.getMacdPoints());
            stockRankOutput.setD_rsiPoints(D_ir.getRsiPoints());
            stockRankOutput.setD_volumePoints(D_ir.getVolumePoints());

            stockRankOutput.setM_adxPoints(M_ir.getAdxPoints());
            stockRankOutput.setM_emaPoints(M_ir.getEmaPoints());
            stockRankOutput.setM_kstPoints(M_ir.getKstPoints());
            stockRankOutput.setM_macdPoints(M_ir.getMacdPoints());
            stockRankOutput.setM_rsiPoints(M_ir.getRsiPoints());
            stockRankOutput.setM_volumePoints(M_ir.getVolumePoints());

            stockRankOutput.setW_adxPoints(W_ir.getAdxPoints());
            stockRankOutput.setW_emaPoints(W_ir.getEmaPoints());
            stockRankOutput.setW_kstPoints(W_ir.getKstPoints());
            stockRankOutput.setW_macdPoints(W_ir.getMacdPoints());
            stockRankOutput.setW_rsiPoints(W_ir.getRsiPoints());
            stockRankOutput.setW_volumePoints(W_ir.getVolumePoints());

            stockRankOutput.setMIN75_adxPoints(MIN75_ir.getAdxPoints());
            stockRankOutput.setMIN75_emaPoints(MIN75_ir.getEmaPoints());
            stockRankOutput.setMIN75_kstPoints(MIN75_ir.getKstPoints());
            stockRankOutput.setMIN75_macdPoints(MIN75_ir.getMacdPoints());
            stockRankOutput.setMIN75_rsiPoints(MIN75_ir.getRsiPoints());
            stockRankOutput.setMIN75_volumePoints(MIN75_ir.getVolumePoints());

            stockRankOutputList.add(stockRankOutput);
        }
        Collections.sort(stockRankOutputList);
        stockRankOutputList=addOverAllRanking(stockRankOutputList);
        return stockRankOutputList;

    }

    private static List<StockRankOutput> addOverAllRanking(List<StockRankOutput> stockRankOutputList){
        List<StockRankOutput> rankingList=new LinkedList<>();
        int i=1;
        for (StockRankOutput stockRankOutput:stockRankOutputList){
            stockRankOutput.setAllRank(i++);
            rankingList.add(stockRankOutput);
        }
        return rankingList;
    }
}
