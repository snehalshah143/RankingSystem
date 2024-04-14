package org.example.helper;

import org.example.model.CandleTimeFrame;
import org.example.model.IndicatorData;
import org.example.model.StockOHLCData;

public class HLBreakoutPointsHelper {

    public static  Integer calculatePoints(StockOHLCData stockOHLCData){

        Integer points=0;

        points=points+calculateMonthlyHLBreakoutPoints(stockOHLCData);

        return points;
    }

    private static Integer calculateMonthlyHLBreakoutPoints(StockOHLCData stockOHLCData) {

        Integer points=0;
        double close=stockOHLCData.getClose_D();

        points=close > stockOHLCData.getHigh_1M() ? points + 5 : points;
        points=close > stockOHLCData.getHigh_2M() ? points + 6 : points;
        points=close > stockOHLCData.getHigh_3M() ? points + 7 : points;
        points=close > stockOHLCData.getHigh_6M() ? points + 8 : points;
        points=close > stockOHLCData.getHigh_1Y() ? points + 9 : points;
        points=close > stockOHLCData.getHigh_2Y() ? points + 10 : points;
        points=close > stockOHLCData.getHigh_3Y() ? points + 11 : points;
        points=close > stockOHLCData.getHigh_5Y() ? points + 12 : points;
        points=close > stockOHLCData.getHigh_10Y() ? points + 15 : points;

        points=close > stockOHLCData.getHigh_1D() ? points + 1 : points;
        points=close > stockOHLCData.getHigh_2D() ? points + 2 : points;
        points=close > stockOHLCData.getHigh_1W() ? points + 3 : points;
        points=close > stockOHLCData.getHigh_2W() ? points + 4 : points;

        points=close < stockOHLCData.getLow_1M() ? points - 5 : points;
        points=close < stockOHLCData.getLow_2M() ? points - 6 : points;
        points=close < stockOHLCData.getLow_3M() ? points - 7 : points;
        points=close < stockOHLCData.getLow_6M() ? points - 8 : points;
        points=close < stockOHLCData.getLow_1Y() ? points - 9 : points;
        points=close < stockOHLCData.getLow_2Y() ? points - 10 : points;
        points=close < stockOHLCData.getLow_3Y() ? points - 11 : points;
        points=close < stockOHLCData.getLow_5Y() ? points - 12 : points;
        points=close < stockOHLCData.getLow_10Y() ? points - 15 : points;

        points=close < stockOHLCData.getLow_1D() ? points - 1 : points;
        points=close < stockOHLCData.getLow_2D() ? points - 2 : points;
        points=close < stockOHLCData.getLow_1W() ? points - 3 : points;
        points=close < stockOHLCData.getLow_2W() ? points - 4 : points;


        return  points;
    }
}
