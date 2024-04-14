package org.example.helper;

import org.example.model.CandleTimeFrame;
import org.example.model.IndicatorData;
import org.example.model.StockOHLCData;

public class EMAPointsHelper {

    public static  Integer calculatePoints(StockOHLCData stockOHLCData, IndicatorData indicatorData, CandleTimeFrame candleTimeFrame){

        Integer points=0;

        points=points+calculateEMAPoints(indicatorData,candleTimeFrame);
        points=points+calculateEMACROSSPoints(indicatorData);
        points=points+calculateEMAEnvelopPoints(indicatorData);
        return points;
    }

    private static Integer calculateEMAEnvelopPoints(IndicatorData indicatorData) {
        Integer points=0;
        double close=indicatorData.getClose();
        double ema8=indicatorData.getEma8();
        double ema13=indicatorData.getEma13();
        double ema21=indicatorData.getEma21();
        double ema34=indicatorData.getEma34();
        double ema55=indicatorData.getEma55();
        double ema200=indicatorData.getEma200();

        double ema21MINUS55Distance= ((ema21 - ema55)/close)*100;
        double ema13MINUS34Distance= ((ema13 - ema34)/close)*100;
        if(ema21MINUS55Distance > 0) {
            if(ema21MINUS55Distance > 75){
                points =points + 10;
            }else if(ema21MINUS55Distance > 50){
                points =points + 7;
            }else if(ema21MINUS55Distance > 30){
                points =points + 5;
            }else if(ema21MINUS55Distance > 25){
                points =points + 3;
            }else if(ema21MINUS55Distance > 15){
                points =points + 2;
            }else if(ema21MINUS55Distance > 5){
                points =points + 1;
            }
        }else{
            if(ema21MINUS55Distance < -75){
                points =points - 10;
            }else if(ema21MINUS55Distance < -50){
                points =points - 7;
            }else if(ema21MINUS55Distance < -30){
                points =points - 5;
            }else if(ema21MINUS55Distance <  -25){
                points =points - 3;
            }else if(ema21MINUS55Distance < -15){
                points =points - 2;
            }else if(ema21MINUS55Distance < -5){
                points =points - 1;
            }
        }


        if(-ema13MINUS34Distance > 0) {
            if(-ema13MINUS34Distance > 75){
                points =points + 10;
            }else if(-ema13MINUS34Distance > 50){
                points =points + 7;
            }else if(-ema13MINUS34Distance > 30){
                points =points + 5;
            }else if(-ema13MINUS34Distance > 25){
                points =points + 3;
            }else if(-ema13MINUS34Distance > 15){
                points =points + 2;
            }else if(-ema13MINUS34Distance > 5){
                points =points + 1;
            }
        }else{
            if(-ema13MINUS34Distance < -75){
                points =points - 10;
            }else if(-ema13MINUS34Distance < -50){
                points =points - 7;
            }else if(-ema13MINUS34Distance < -30){
                points =points - 5;
            }else if(-ema13MINUS34Distance <  -25){
                points =points - 3;
            }else if(-ema13MINUS34Distance < -15){
                points =points - 2;
            }else if(-ema13MINUS34Distance < -5){
                points =points - 1;
            }
        }



        return points;
    }

    private static Integer calculateEMACROSSPoints(IndicatorData indicatorData) {
        Integer points=0;
        double close=indicatorData.getClose();
        double ema8=indicatorData.getEma8();
        double ema13=indicatorData.getEma13();
        double ema21=indicatorData.getEma21();
        double ema34=indicatorData.getEma34();
        double ema55=indicatorData.getEma55();
        double ema200=indicatorData.getEma200();

        points= ema8 >ema13  ? points + 1 : points - 1;
        points= ema13 >ema21  ? points + 2 : points - 2;
        points= ema21 >ema34  ? points + 3 : points - 3;
        points= ema34 >ema55  ? points + 4 : points - 4;
        points= ema21 >ema55  ? points + 5 : points - 5;
        points= ema55 >ema200  ? points + 10 : points - 10;

if(ema13 >ema21 && ema21 > ema55){
    points=points+10;
}else if(ema13 < ema21 && ema21 < ema55){
    points=points-10;
}
        return points;
    }

    private static Integer calculateEMAPoints(IndicatorData indicatorData,CandleTimeFrame candleTimeFrame) {

        Integer points=0;
double close=indicatorData.getClose();
        double ema8=indicatorData.getEma8();
        double ema13=indicatorData.getEma13();
        double ema21=indicatorData.getEma21();
        double ema34=indicatorData.getEma34();
        double ema55=indicatorData.getEma55();
        double ema200=indicatorData.getEma200();
        double hull21=indicatorData.getHull21();
        double hull55=indicatorData.getHull55();
        double hull89=indicatorData.getHull89();
        double cloudtop=indicatorData.getCloud_top();
        points=close > ema8  ? points + 1 : points - 1;
        points=close > ema13 ? points + 2 : points - 2;
        points=close > ema21 ? points + 3 : points - 3;
        points=close > ema34 ? points + 4 : points - 4;
        points=close > ema55 ? points + 5 : points - 5;
        points=close > ema200 ? points + 6 : points - 6;
        points=close > ema200 ? points + 6 : points - 6;

        if(candleTimeFrame.equals(CandleTimeFrame.MONTHLY)){
            points=close > hull21  ? points + 3 : points - 3;
        }

        if(candleTimeFrame.equals(CandleTimeFrame.WEEKLY)){
            points=close > hull21  ? points + 2 : points - 2;
            points=close > cloudtop ?points +5 : points - 5;
        }

        if(candleTimeFrame.equals(CandleTimeFrame.DAILY)){
            points=close > hull55  ? points + 1 : points - 1;
        }

        if(candleTimeFrame.equals(CandleTimeFrame.SEVENTY_FIVE_MINUTE)){
            points=close > hull89  ? points + 1 : points - 1;
        }

        return points;
    }

}
