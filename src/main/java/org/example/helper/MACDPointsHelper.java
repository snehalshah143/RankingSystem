package org.example.helper;

import org.example.model.CandleTimeFrame;
import org.example.model.IndicatorData;
import org.example.model.StockOHLCData;

public class MACDPointsHelper {

    public static  Integer calculatePoints(StockOHLCData stockOHLCData, IndicatorData indicatorData, CandleTimeFrame candleTimeFrame){

        Integer points=0;

        points=points+calculateMacd22107Points(indicatorData);
        points=points+calculateMacd1153Points(indicatorData);

        return points;
    }




    private static Integer calculateMacd22107Points(IndicatorData indicatorData){
        Integer points=0;
        double macd=indicatorData.getMacd_22_10_7();
        double macdsignal=indicatorData.getMacd_signal_22_10_7();
        double hist=indicatorData.getHist_22_10_7();

        if(macd > 0 ){
            points=points+1;
        } else if (macd > macdsignal) {
            points=points+2;
        }else if (macd > 10) {
            points=points+3;
        }else if (macd > 25) {
            points=points+4;
        }else if (macd > 50) {
            points=points+5;
        }else if (macd > 100) {
            points=points+6;
        }else if(macd < 0 ){
            points=points-1;
        } else if (macd < macdsignal) {
            points=points-2;
        }else if (macd < -10) {
            points=points-3;
        }else if (macd < -25) {
            points=points-4;
        }else if (macd < -50) {
            points=points-5;
        }else if (macd < -100) {
            points=points-6;
        }
        return points;
    }

    private static Integer calculateMacd1153Points(IndicatorData indicatorData){
        Integer points=0;
        double macd=indicatorData.getMacd_11_5_3();
        double macdsignal=indicatorData.getMacd_signal_11_5_3();

        if(macd > 0 ){
            points=points+1;
        } else if (macd > macdsignal) {
            points=points+2;
        }else if (macd > 10) {
            points=points+3;
        }else if (macd > 20) {
            points=points+4;
        }else if (macd > 30) {
            points=points+5;
        }else if (macd > 40) {
            points=points+6;
        }else if(macd < 0 ){
            points=points-1;
        } else if (macd < macdsignal) {
            points=points-2;
        }else if (macd < -10) {
            points=points-3;
        }else if (macd < -20) {
            points=points-4;
        }else if (macd < -30) {
            points=points-5;
        }else if (macd < -40) {
            points=points-6;
        }
        return points;
    }
}
