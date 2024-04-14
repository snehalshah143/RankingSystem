package org.example.helper;

import org.example.model.CandleTimeFrame;
import org.example.model.IndicatorData;
import org.example.model.StockOHLCData;

public class RSIPointsHelper {

    public static  Integer calculatePoints(StockOHLCData stockOHLCData, IndicatorData indicatorData, CandleTimeFrame candleTimeFrame){

        Integer points=0;
        points=points+calculateRSI14Points(indicatorData);
        points=points+calculateRSI3Points(indicatorData);
        points=points+calculateRSI14EMAPoints(indicatorData);
        return points;
    }

    private static Integer calculateRSI14Points(IndicatorData indicatorData){
        Integer points=0;
        double rsiVal=indicatorData.getRsi14();
        if(rsiVal > 75 ){
            points=points+5;
        } else if (rsiVal > 65) {
            points=points+4;
        }else if (rsiVal > 60) {
            points=points+3;
        }else if (rsiVal > 55) {
            points=points+2;
        }else if (rsiVal > 50) {
            points=points+1;
        }else if (rsiVal > 45) {
            points=points-1;
        }else if (rsiVal > 40) {
            points=points-2;
        }else if (rsiVal > 35) {
            points=points-3;
        }else if (rsiVal > 30) {
            points=points-4;
        }else if (rsiVal > 25) {
            points=points-5;
        }
        return points;
    }

    private static Integer calculateRSI3Points(IndicatorData indicatorData){

        Integer points=0;
        double rsiVal=indicatorData.getRsi3();
        if(rsiVal > 70 ){
            points=points+2;
        } else if (rsiVal > 50) {
            points=points+1;
        }else if (rsiVal > 30) {
            points=points-1;
        }else if (rsiVal > 10) {
            points=points-2;
        }
        return points;
    }

    private static Integer calculateRSI14EMAPoints(IndicatorData indicatorData){

        Integer points=0;
        double rsiVal=indicatorData.getRsi14();
        double rsiEmaVal=indicatorData.getEma21_of_rsi14();
        if(rsiVal > rsiEmaVal ){
            points=points+2;
        } else{
            points=points-1;
        }
        return points;
    }
}
