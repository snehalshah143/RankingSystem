package org.example.helper;

import org.example.model.CandleTimeFrame;
import org.example.model.IndicatorData;
import org.example.model.StockOHLCData;

public class KstPointsHelper {

    public static  Integer calculatePoints(StockOHLCData stockOHLCData, IndicatorData indicatorData, CandleTimeFrame candleTimeFrame){

        Integer points=0;

        points=points+calculateKSTPoints(indicatorData);

        return points;
    }

    private static Integer calculateKSTPoints(IndicatorData indicatorData) {
        Integer points=0;
        double kst=indicatorData.getKst();
        double kstSignal=indicatorData.getKst_signal();
        double kst1Ago=indicatorData.getKst_1Ago();
        double kst2Ago=indicatorData.getKst_2Ago();
        if(kst > kstSignal){
            points=points+2;
        } else {
            points=points-2;
        }

        if(kst < kst1Ago && kst1Ago < kst2Ago){
            points=points-1;
        }

        return points;
    }
}
