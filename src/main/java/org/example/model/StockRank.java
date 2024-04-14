package org.example.model;

import org.example.model.CandleTimeFrame;
import org.example.model.IndicatorRank;

import java.util.HashMap;
import java.util.Map;

public class StockRank {

    private String symbol;

    private Integer overAllPoints;

    private Map<CandleTimeFrame, IndicatorRank> indicatorRankForTimeFrame=new HashMap<>();
    private Integer breakoutPoints;


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }


    public Integer getBreakoutPoints() {
        return breakoutPoints;
    }

    public void setBreakoutPoints(Integer breakoutPoints) {
        this.breakoutPoints = breakoutPoints;
    }

    public Integer getOverAllPoints() {
        return overAllPoints;
    }

    public void setOverAllPoints(Integer overAllPoints) {
        this.overAllPoints = overAllPoints;
    }

    public Map<CandleTimeFrame, IndicatorRank> getIndicatorRankForTimeFrame() {
        return indicatorRankForTimeFrame;
    }

    public void setIndicatorRankForTimeFrame(Map<CandleTimeFrame, IndicatorRank> indicatorRankForTimeFrame) {
        this.indicatorRankForTimeFrame = indicatorRankForTimeFrame;
    }

    @Override
    public String toString() {
        return "StockRank{" +
                "symbol='" + symbol + '\'' +
                ", overAllPoints=" + overAllPoints +
                ", indicatorRankForTimeFrame=" + indicatorRankForTimeFrame +
                ", breakoutPoints=" + breakoutPoints +
                '}';
    }
}
