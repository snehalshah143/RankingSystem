package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndicatorData {

    @JsonProperty("date")
    private String date;
    @JsonProperty("symbol")

    private String symbol;

    @JsonProperty("high")
    private double high;
    @JsonProperty("low")
    private double low;
    @JsonProperty("close")
    private double close;
    @JsonProperty("open")
    private double open;

    @JsonProperty("rsi14")
    private double rsi14;
    @JsonProperty("rsi3")
    private double rsi3;
    @JsonProperty("ema21_of_rsi14")
    private double ema21_of_rsi14;
    @JsonProperty("macd-22-10-7")
    private double macd_22_10_7;
    @JsonProperty("macd-signal-22-10-7")

    private double macd_signal_22_10_7;
    @JsonProperty("hist-22-10-7")
    private double hist_22_10_7;
    @JsonProperty("macd-11-5-3")
    private double macd_11_5_3;
    @JsonProperty("macd-signal-11-5-3")
    private double macd_signal_11_5_3;
    @JsonProperty("obv")
    private double obv;
    @JsonProperty("ema21_of_obv")
    private double ema_21_of_obv;
    @JsonProperty("mfi")
private double mfi;
    @JsonProperty("kst")

    private double kst;
    @JsonProperty("kst-1ago")
    private double kst_1Ago;
    @JsonProperty("kst-2ago")
    private double kst_2Ago;
    @JsonProperty("kst-signal")
    private double kst_signal;
    @JsonProperty("cloudtop")
private double cloud_top;
    @JsonProperty("ema8")
    private double ema8;
    @JsonProperty("ema13")
    private double ema13;
    @JsonProperty("ema21")
    private double ema21;
    @JsonProperty("ema34")
    private double ema34;
    @JsonProperty("ema55")
    private double ema55;
    @JsonProperty("ema200")
    private double ema200;
    @JsonProperty("hull21")
    private double hull21;
    @JsonProperty("hull55")
    private double hull55;
    @JsonProperty("hull89")
    private double hull89;
    @JsonProperty("supertrend10-3")

    private double superTrend_10_3;
    @JsonProperty("di-positive")
    private double di_positive;
    @JsonProperty("di-negative")
    private double di_negative;
    @JsonProperty("adx-14")
    private double adx14;

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

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getRsi14() {
        return rsi14;
    }

    public void setRsi14(double rsi14) {
        this.rsi14 = rsi14;
    }

    public double getRsi3() {
        return rsi3;
    }

    public void setRsi3(double rsi3) {
        this.rsi3 = rsi3;
    }

    public double getEma21_of_rsi14() {
        return ema21_of_rsi14;
    }

    public void setEma21_of_rsi14(double ema21_of_rsi14) {
        this.ema21_of_rsi14 = ema21_of_rsi14;
    }

    public double getMacd_22_10_7() {
        return macd_22_10_7;
    }

    public void setMacd_22_10_7(double macd_22_10_7) {
        this.macd_22_10_7 = macd_22_10_7;
    }

    public double getMacd_signal_22_10_7() {
        return macd_signal_22_10_7;
    }

    public void setMacd_signal_22_10_7(double macd_signal_22_10_7) {
        this.macd_signal_22_10_7 = macd_signal_22_10_7;
    }

    public double getHist_22_10_7() {
        return hist_22_10_7;
    }

    public void setHist_22_10_7(double hist_22_10_7) {
        this.hist_22_10_7 = hist_22_10_7;
    }

    public double getMacd_11_5_3() {
        return macd_11_5_3;
    }

    public void setMacd_11_5_3(double macd_11_5_3) {
        this.macd_11_5_3 = macd_11_5_3;
    }

    public double getMacd_signal_11_5_3() {
        return macd_signal_11_5_3;
    }

    public void setMacd_signal_11_5_3(double macd_signal_11_5_3) {
        this.macd_signal_11_5_3 = macd_signal_11_5_3;
    }

    public double getObv() {
        return obv;
    }

    public void setObv(double obv) {
        this.obv = obv;
    }

    public double getEma_21_of_obv() {
        return ema_21_of_obv;
    }

    public void setEma_21_of_obv(double ema_21_of_obv) {
        this.ema_21_of_obv = ema_21_of_obv;
    }

    public double getMfi() {
        return mfi;
    }

    public void setMfi(double mfi) {
        this.mfi = mfi;
    }

    public double getKst() {
        return kst;
    }

    public void setKst(double kst) {
        this.kst = kst;
    }

    public double getKst_1Ago() {
        return kst_1Ago;
    }

    public void setKst_1Ago(double kst_1Ago) {
        this.kst_1Ago = kst_1Ago;
    }

    public double getKst_2Ago() {
        return kst_2Ago;
    }

    public void setKst_2Ago(double kst_2Ago) {
        this.kst_2Ago = kst_2Ago;
    }

    public double getKst_signal() {
        return kst_signal;
    }

    public void setKst_signal(double kst_signal) {
        this.kst_signal = kst_signal;
    }

    public double getCloud_top() {
        return cloud_top;
    }

    public void setCloud_top(double cloud_top) {
        this.cloud_top = cloud_top;
    }

    public double getEma8() {
        return ema8;
    }

    public void setEma8(double ema8) {
        this.ema8 = ema8;
    }

    public double getEma13() {
        return ema13;
    }

    public void setEma13(double ema13) {
        this.ema13 = ema13;
    }

    public double getEma21() {
        return ema21;
    }

    public void setEma21(double ema21) {
        this.ema21 = ema21;
    }

    public double getEma34() {
        return ema34;
    }

    public void setEma34(double ema34) {
        this.ema34 = ema34;
    }

    public double getEma55() {
        return ema55;
    }

    public void setEma55(double ema55) {
        this.ema55 = ema55;
    }

    public double getEma200() {
        return ema200;
    }

    public void setEma200(double ema200) {
        this.ema200 = ema200;
    }

    public double getHull21() {
        return hull21;
    }

    public void setHull21(double hull21) {
        this.hull21 = hull21;
    }

    public double getHull55() {
        return hull55;
    }

    public void setHull55(double hull55) {
        this.hull55 = hull55;
    }

    public double getHull89() {
        return hull89;
    }

    public void setHull89(double hull89) {
        this.hull89 = hull89;
    }

    public double getSuperTrend_10_3() {
        return superTrend_10_3;
    }

    public void setSuperTrend_10_3(double superTrend_10_3) {
        this.superTrend_10_3 = superTrend_10_3;
    }

    public double getDi_positive() {
        return di_positive;
    }

    public void setDi_positive(double di_positive) {
        this.di_positive = di_positive;
    }

    public double getDi_negative() {
        return di_negative;
    }

    public void setDi_negative(double di_negative) {
        this.di_negative = di_negative;
    }

    public double getAdx14() {
        return adx14;
    }

    public void setAdx14(double adx14) {
        this.adx14 = adx14;
    }
}
