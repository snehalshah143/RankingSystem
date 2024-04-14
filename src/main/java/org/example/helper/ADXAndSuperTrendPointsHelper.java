package org.example.helper;

import org.example.model.CandleTimeFrame;
import org.example.model.IndicatorData;
import org.example.model.StockOHLCData;

public class ADXAndSuperTrendPointsHelper {

    public static  Integer calculatePoints(StockOHLCData stockOHLCData, IndicatorData indicatorData, CandleTimeFrame candleTimeFrame){

        Integer points=0;

        points=points+calculateADXPoints(indicatorData,candleTimeFrame);
        points=points+calculateSupertrendPoints(indicatorData,candleTimeFrame);
        return points;
    }

    private static Integer calculateSupertrendPoints(IndicatorData indicatorData, CandleTimeFrame candleTimeFrame) {

        Integer points=0;
        double supertrend=indicatorData.getSuperTrend_10_3();
        double close=indicatorData.getClose();
        if(close > supertrend){
            points=close > supertrend ? points + 3 :points - 3;
        }

        return  points;
    }

    private static Integer calculateADXPoints(IndicatorData indicatorData, CandleTimeFrame candleTimeFrame) {
        Integer points=0;
        double dipositive=indicatorData.getDi_positive();
        double dinegative=indicatorData.getDi_negative();
        double adx=indicatorData.getAdx14();



            if(dipositive > dinegative){
                points=points+5;
                points=adx > dinegative ? points+3:points-1;

                if(dipositive > 50 ){
                    points=points+7;
                } else if(dipositive > 40 ){
                    points=points+5;
                }else if(dipositive > 30 ){
                    points=points+3;
                }else if(dipositive > 25 ){
                    points=points+2;
                }else if(dipositive > 25 ){
                    points=points+1;
                }

                if(adx > 50 ){
                    points=points+10;
                } else if(adx > 40 ){
                    points=points+7;
                }else if(adx > 30 ){
                    points=points+5;
                }else if(adx > 25 ){
                    points=points+3;
                }else if(adx > 20 ){
                    points=points+2;
                }else if(adx < 15 ){
                    points=points-1;
                }
            }else{
                points=points-5;
                points=adx > dipositive ? points-3:points-1;

                if(dinegative > 50 ){
                    points=points-7;
                } else if(dinegative > 40 ){
                    points=points-5;
                }else if(dinegative > 30 ){
                    points=points-3;
                }else if(dinegative > 25 ){
                    points=points-2;
                }else if(dinegative > 25 ){
                    points=points-1;
                }

                if(adx > 50 ){
                    points=points-10;
                } else if(adx > 40 ){
                    points=points-7;
                }else if(adx > 30 ){
                    points=points-5;
                }else if(adx > 25 ){
                    points=points-3;
                }else if(adx > 20 ){
                    points=points-2;
                }else if(adx < 15 ){
                    points=points-1;
                }

            }



        return points;

    }

}
