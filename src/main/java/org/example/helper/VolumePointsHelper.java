package org.example.helper;

import org.example.model.CandleTimeFrame;
import org.example.model.IndicatorData;
import org.example.model.StockOHLCData;

public class VolumePointsHelper {

    public static  Integer calculatePoints(StockOHLCData stockOHLCData, IndicatorData indicatorData, CandleTimeFrame candleTimeFrame){

        Integer points=0;

        points=points+calculateOBVPoints(indicatorData);
        points=points+calculateMFIPoints(indicatorData);
        return points;
    }

    private static Integer calculateOBVPoints(IndicatorData indicatorData) {

        Integer points=0;
        double obv=indicatorData.getObv();
        double obvEma=indicatorData.getEma_21_of_obv();

        if(obv >obvEma){
            points=points+2;
        }else {
            points=points-1;
        }
return points;
    }

    private static Integer calculateMFIPoints(IndicatorData indicatorData) {

        Integer points=0;
        double mfi=indicatorData.getMfi();


        if(mfi >80){
            points=points+4;
        }else if(mfi >70){
            points=points+3;
        }else if(mfi >60){
            points=points+2;
        }else if(mfi >50){
            points=points+1;
        }else if(mfi >40){
            points=points-1;
        }else if(mfi >30){
            points=points-2;
        }else if(mfi >20){
            points=points-3;
        }else if(mfi >10){
            points=points-4;
        }
        return points;
    }
}
