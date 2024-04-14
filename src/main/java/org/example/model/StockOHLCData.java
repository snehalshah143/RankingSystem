package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockOHLCData {

    @JsonProperty("date")
    private String date;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("1m-high")
    private double high_1M;
    @JsonProperty("2m-high")
    private double high_2M;
    @JsonProperty("3m-high")
    private double high_3M;
    @JsonProperty("6m-high")
    private double high_6M;
    @JsonProperty("1y-high")
    private double high_1Y;
    @JsonProperty("2y-high")
    private double high_2Y;
    @JsonProperty("3y-high")
    private double high_3Y;
    @JsonProperty("5y-high")
    private double high_5Y;
    @JsonProperty("10y-high")
    private double high_10Y;
    @JsonProperty("1m-low")

    private double low_1M;
    @JsonProperty("2m-low")
    private double low_2M;
    @JsonProperty("3m-low")
    private double low_3M;
    @JsonProperty("6m-low")
    private double low_6M;
    @JsonProperty("1y-low")
    private double low_1Y;
    @JsonProperty("2y-low")
    private double low_2Y;
    @JsonProperty("3y-low")
    private double low_3Y;
    @JsonProperty("5y-low")
    private double low_5Y;
    @JsonProperty("10y-low")
    private double low_10Y;
    @JsonProperty("1w-high")
    private double high_1W;
    @JsonProperty("2w-high")
    private double high_2W;
    @JsonProperty("1w-low")
    private double low_1W;
    @JsonProperty("2w-low")
    private double low_2W;
    @JsonProperty("d-high")
    private double high_D;
    @JsonProperty("d-low")
    private double low_D;
    @JsonProperty("d-open")
    private double open_D;
    @JsonProperty("d-close")
    private double close_D;
    @JsonProperty("d-1ago-high")
    private double high_1D;
    @JsonProperty("d-1ago-low")
    private double low_1D;
    @JsonProperty("d-2ago-high")
    private double high_2D;
    @JsonProperty("d-2ago-low")
    private double low_2D;
    @JsonProperty("w-low")
    private double low_W;
    @JsonProperty("w-high")
    private double high_W;

    @JsonProperty("w-open")
    private double open_W;
    @JsonProperty("w-close")
    private double close_W;
    @JsonProperty("75min-high")
    private double high_75MIN;
    @JsonProperty("75min-low")
    private double low_75MIN;
    @JsonProperty("75min-close")
    private double close_75MIN;
    @JsonProperty("75min-open")
    private double open_75MIN;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getHigh_1M() {
        return high_1M;
    }

    public void setHigh_1M(double high_1M) {
        this.high_1M = high_1M;
    }

    public double getHigh_2M() {
        return high_2M;
    }

    public void setHigh_2M(double high_2M) {
        this.high_2M = high_2M;
    }

    public double getHigh_3M() {
        return high_3M;
    }

    public void setHigh_3M(double high_3M) {
        this.high_3M = high_3M;
    }

    public double getHigh_6M() {
        return high_6M;
    }

    public void setHigh_6M(double high_6M) {
        this.high_6M = high_6M;
    }

    public double getHigh_1Y() {
        return high_1Y;
    }

    public void setHigh_1Y(double high_1Y) {
        this.high_1Y = high_1Y;
    }

    public double getHigh_2Y() {
        return high_2Y;
    }

    public void setHigh_2Y(double high_2Y) {
        this.high_2Y = high_2Y;
    }

    public double getHigh_3Y() {
        return high_3Y;
    }

    public void setHigh_3Y(double high_3Y) {
        this.high_3Y = high_3Y;
    }

    public double getHigh_5Y() {
        return high_5Y;
    }

    public void setHigh_5Y(double high_5Y) {
        this.high_5Y = high_5Y;
    }

    public double getHigh_10Y() {
        return high_10Y;
    }

    public void setHigh_10Y(double high_10Y) {
        this.high_10Y = high_10Y;
    }

    public double getLow_1M() {
        return low_1M;
    }

    public void setLow_1M(double low_1M) {
        this.low_1M = low_1M;
    }

    public double getLow_2M() {
        return low_2M;
    }

    public void setLow_2M(double low_2M) {
        this.low_2M = low_2M;
    }

    public double getLow_3M() {
        return low_3M;
    }

    public void setLow_3M(double low_3M) {
        this.low_3M = low_3M;
    }

    public double getLow_6M() {
        return low_6M;
    }

    public void setLow_6M(double low_6M) {
        this.low_6M = low_6M;
    }

    public double getLow_1Y() {
        return low_1Y;
    }

    public void setLow_1Y(double low_1Y) {
        this.low_1Y = low_1Y;
    }

    public double getLow_2Y() {
        return low_2Y;
    }

    public void setLow_2Y(double low_2Y) {
        this.low_2Y = low_2Y;
    }

    public double getLow_3Y() {
        return low_3Y;
    }

    public void setLow_3Y(double low_3Y) {
        this.low_3Y = low_3Y;
    }

    public double getLow_5Y() {
        return low_5Y;
    }

    public void setLow_5Y(double low_5Y) {
        this.low_5Y = low_5Y;
    }

    public double getLow_10Y() {
        return low_10Y;
    }

    public void setLow_10Y(double low_10Y) {
        this.low_10Y = low_10Y;
    }

    public double getHigh_1W() {
        return high_1W;
    }

    public void setHigh_1W(double high_1W) {
        this.high_1W = high_1W;
    }

    public double getHigh_2W() {
        return high_2W;
    }

    public void setHigh_2W(double high_2W) {
        this.high_2W = high_2W;
    }

    public double getLow_1W() {
        return low_1W;
    }

    public void setLow_1W(double low_1W) {
        this.low_1W = low_1W;
    }

    public double getLow_2W() {
        return low_2W;
    }

    public void setLow_2W(double low_2W) {
        this.low_2W = low_2W;
    }

    public double getHigh_D() {
        return high_D;
    }

    public void setHigh_D(double high_D) {
        this.high_D = high_D;
    }

    public double getLow_D() {
        return low_D;
    }

    public void setLow_D(double low_D) {
        this.low_D = low_D;
    }

    public double getOpen_D() {
        return open_D;
    }

    public void setOpen_D(double open_D) {
        this.open_D = open_D;
    }

    public double getClose_D() {
        return close_D;
    }

    public void setClose_D(double close_D) {
        this.close_D = close_D;
    }

    public double getHigh_1D() {
        return high_1D;
    }

    public void setHigh_1D(double high_1D) {
        this.high_1D = high_1D;
    }

    public double getLow_1D() {
        return low_1D;
    }

    public void setLow_1D(double low_1D) {
        this.low_1D = low_1D;
    }

    public double getHigh_2D() {
        return high_2D;
    }

    public void setHigh_2D(double high_2D) {
        this.high_2D = high_2D;
    }

    public double getLow_2D() {
        return low_2D;
    }

    public void setLow_2D(double low_2D) {
        this.low_2D = low_2D;
    }

    public double getLow_W() {
        return low_W;
    }

    public void setLow_W(double low_W) {
        this.low_W = low_W;
    }

    public double getHigh_W() {
        return high_W;
    }

    public void setHigh_W(double high_W) {
        this.high_W = high_W;
    }

    public double getOpen_W() {
        return open_W;
    }

    public void setOpen_W(double open_W) {
        this.open_W = open_W;
    }

    public double getClose_W() {
        return close_W;
    }

    public void setClose_W(double close_W) {
        this.close_W = close_W;
    }

    public double getHigh_75MIN() {
        return high_75MIN;
    }

    public void setHigh_75MIN(double high_75MIN) {
        this.high_75MIN = high_75MIN;
    }

    public double getLow_75MIN() {
        return low_75MIN;
    }

    public void setLow_75MIN(double low_75MIN) {
        this.low_75MIN = low_75MIN;
    }

    public double getClose_75MIN() {
        return close_75MIN;
    }

    public void setClose_75MIN(double close_75MIN) {
        this.close_75MIN = close_75MIN;
    }

    public double getOpen_75MIN() {
        return open_75MIN;
    }

    public void setOpen_75MIN(double open_75MIN) {
        this.open_75MIN = open_75MIN;
    }
}
