package org.example.model;

import java.util.Map;

public class StockData {

    private String symbol;
    private Map<CandleTimeFrame,IndicatorData> indicatorData;
    private StockOHLCData stockOHLCData;
    private StockRank stockRank;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Map<CandleTimeFrame, IndicatorData> getIndicatorData() {
        return indicatorData;
    }

    public void setIndicatorData(Map<CandleTimeFrame, IndicatorData> indicatorData) {
        this.indicatorData = indicatorData;
    }

    public StockOHLCData getStockOHLCData() {
        return stockOHLCData;
    }

    public void setStockOHLCData(StockOHLCData stockOHLCData) {
        this.stockOHLCData = stockOHLCData;
    }

    public StockRank getStockRank() {
        return stockRank;
    }

    public void setStockRank(StockRank stockRank) {
        this.stockRank = stockRank;
    }
}
