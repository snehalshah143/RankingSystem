package org.example.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvIgnore;

@JsonPropertyOrder({"symbol","allRank","allPoints","M_Rank","M_allPoints","W_Rank","W_allPoints","D_Rank","D_allPoints","MIN75_Rank","MIN75_allPoints"})
public class StockRankOutput implements Comparable<StockRankOutput>{
    @CsvBindByName(column = "#####", required = true)
    @CsvBindByPosition(position = 0)

    private String dummy;
    @CsvBindByName(column = "symbol", required = true)
    @CsvBindByPosition(position = 1)
    private String symbol;
    @CsvBindByName(column = "allRank", required = true)
    @CsvBindByPosition(position = 2)
    private Integer allRank;
    @CsvBindByName(column = "allPoints", required = true)
    @CsvBindByPosition(position = 3)
    private Integer allPoints;
    @CsvBindByName(column = "M_Rank", required = true)
    @CsvBindByPosition(position = 4)
    private Integer M_Rank;
    @CsvBindByName(column = "M_allPoints", required = true)
    @CsvBindByPosition(position = 5)
    private Integer M_allPoints;
    @CsvBindByName(column = "W_Rank", required = true)
    @CsvBindByPosition(position = 6)
    private Integer W_Rank;
    @CsvBindByName(column = "W_allPoints", required = true)
    @CsvBindByPosition(position = 7)
    private Integer W_allPoints;
    @CsvBindByName(column = "D_Rank", required = true)
    @CsvBindByPosition(position = 8)
    private Integer D_Rank;
    @CsvBindByName(column = "D_allPoints", required = true)
    @CsvBindByPosition(position = 9)
    private Integer D_allPoints;
    @CsvBindByName(column = "MIN75_Rank", required = true)
    @CsvBindByPosition(position = 10)
    private Integer MIN75_Rank;
    @CsvBindByName(column = "MIN75_allPoints", required = true)
    @CsvBindByPosition(position = 11)
    private Integer MIN75_allPoints;
    @CsvBindByName(column = "HL_BreakoutPoints", required = true)
    @CsvBindByPosition(position = 12)

    private Integer HL_BreakoutPoints;
    @CsvBindByName(column = "M_IndicatorPoints", required = true)
    @CsvBindByPosition(position = 13)
    private Integer M_IndicatorPoints;
    @CsvBindByName(column = "W_IndicatorPoints", required = true)
    @CsvBindByPosition(position = 14)
    private Integer W_IndicatorPoints;
    @CsvBindByName(column = "D_IndicatorPoints", required = true)
    @CsvBindByPosition(position = 15)
    private Integer D_IndicatorPoints;
    @CsvBindByName(column = "MIN75_IndicatorPoints", required = true)
    @CsvBindByPosition(position = 16)
    private Integer MIN75_IndicatorPoints;
    @CsvIgnore
    @CsvBindByName(column = "D_rsiPoints", required = false)
    @CsvBindByPosition(position = 17)
    private Integer D_rsiPoints;
    @CsvIgnore
    @CsvBindByName(column = "D_macdPoints", required = false)
    @CsvBindByPosition(position = 18)
    private Integer D_macdPoints;
    @CsvIgnore
    @CsvBindByName(column = "D_adxPoints", required = false)
    @CsvBindByPosition(position = 19)
    private Integer D_adxPoints;
    @CsvIgnore
    @CsvBindByName(column = "D_kstPoints", required = false)
    @CsvBindByPosition(position = 20)
    private Integer D_kstPoints;
    @CsvIgnore
    @CsvBindByName(column = "D_emaPoints", required = false)
    @CsvBindByPosition(position = 21)
    private Integer D_emaPoints;
    @CsvIgnore
    @CsvBindByName(column = "D_volumePoints", required = false)
    @CsvBindByPosition(position = 22)
    private Integer D_volumePoints;

    @CsvIgnore
    @CsvBindByName(column = "W_rsiPoints", required = false)
    @CsvBindByPosition(position = 23)
    private Integer W_rsiPoints;
    @CsvIgnore
    @CsvBindByName(column = "W_macdPoints", required = false)
    @CsvBindByPosition(position = 24)
    private Integer W_macdPoints;
    @CsvIgnore
    @CsvBindByName(column = "W_adxPoints", required = false)
    @CsvBindByPosition(position = 25)
    private Integer W_adxPoints;
    @CsvIgnore
    @CsvBindByName(column = "W_kstPoints", required = false)
    @CsvBindByPosition(position = 26)
    private Integer W_kstPoints;
    @CsvIgnore
    @CsvBindByName(column = "W_emaPoints", required = false)
    @CsvBindByPosition(position = 27)
    private Integer W_emaPoints;
    @CsvIgnore
    @CsvBindByName(column = "W_volumePoints", required = false)
    @CsvBindByPosition(position = 28)
    private Integer W_volumePoints;
    @CsvIgnore
    @CsvBindByName(column = "M_rsiPoints", required = false)
    @CsvBindByPosition(position = 29)
    private Integer M_rsiPoints;
    @CsvIgnore
    @CsvBindByName(column = "M_macdPoints", required = false)
    @CsvBindByPosition(position = 30)
    private Integer M_macdPoints;
    @CsvIgnore
    @CsvBindByName(column = "M_adxPoints", required = false)
    @CsvBindByPosition(position = 31)
    private Integer M_adxPoints;
    @CsvIgnore
    @CsvBindByName(column = "M_kstPoints", required = false)
    @CsvBindByPosition(position = 32)
    private Integer M_kstPoints;
    @CsvIgnore
    @CsvBindByName(column = "M_emaPoints", required = false)
    @CsvBindByPosition(position = 33)
    private Integer M_emaPoints;
    @CsvIgnore
    @CsvBindByName(column = "M_volumePoints", required = false)
    @CsvBindByPosition(position = 34)
    private Integer M_volumePoints;
    @CsvIgnore
    @CsvBindByName(column = "MIN75_rsiPoints", required = false)
    @CsvBindByPosition(position = 35)
    private Integer MIN75_rsiPoints;
    @CsvBindByName(column = "MIN75_macdPoints", required = false)
    @CsvBindByPosition(position = 36)
    private Integer MIN75_macdPoints;
    @CsvIgnore
    @CsvBindByName(column = "MIN75_adxPoints", required = false)
    @CsvBindByPosition(position = 37)
    private Integer MIN75_adxPoints;
    @CsvIgnore
    @CsvBindByName(column = "MIN75_kstPoints", required = false)
    @CsvBindByPosition(position = 38)
    private Integer MIN75_kstPoints;
    @CsvIgnore
    @CsvBindByName(column = "MIN75_emaPoints", required = false)
    @CsvBindByPosition(position = 39)
    private Integer MIN75_emaPoints;
    @CsvIgnore
    @CsvBindByName(column = "MIN75_volumePoints", required = false)
    @CsvBindByPosition(position = 40)
    private Integer MIN75_volumePoints;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getAllPoints() {
        return allPoints;
    }

    public void setAllPoints(Integer allPoints) {
        this.allPoints = allPoints;
    }

    public Integer getD_IndicatorPoints() {
        return D_IndicatorPoints;
    }

    public void setD_IndicatorPoints(Integer d_IndicatorPoints) {
        D_IndicatorPoints = d_IndicatorPoints;
    }

    public Integer getW_IndicatorPoints() {
        return W_IndicatorPoints;
    }

    public void setW_IndicatorPoints(Integer w_IndicatorPoints) {
        W_IndicatorPoints = w_IndicatorPoints;
    }

    public Integer getM_IndicatorPoints() {
        return M_IndicatorPoints;
    }

    public void setM_IndicatorPoints(Integer m_IndicatorPoints) {
        M_IndicatorPoints = m_IndicatorPoints;
    }

    public Integer getHL_BreakoutPoints() {
        return HL_BreakoutPoints;
    }

    public void setHL_BreakoutPoints(Integer HL_BreakoutPoints) {
        this.HL_BreakoutPoints = HL_BreakoutPoints;
    }

    public Integer getD_rsiPoints() {
        return D_rsiPoints;
    }

    public void setD_rsiPoints(Integer d_rsiPoints) {
        D_rsiPoints = d_rsiPoints;
    }

    public Integer getD_macdPoints() {
        return D_macdPoints;
    }

    public void setD_macdPoints(Integer d_macdPoints) {
        D_macdPoints = d_macdPoints;
    }

    public Integer getD_adxPoints() {
        return D_adxPoints;
    }

    public void setD_adxPoints(Integer d_adxPoints) {
        D_adxPoints = d_adxPoints;
    }

    public Integer getD_kstPoints() {
        return D_kstPoints;
    }

    public void setD_kstPoints(Integer d_kstPoints) {
        D_kstPoints = d_kstPoints;
    }

    public Integer getD_emaPoints() {
        return D_emaPoints;
    }

    public void setD_emaPoints(Integer d_emaPoints) {
        D_emaPoints = d_emaPoints;
    }

    public Integer getD_volumePoints() {
        return D_volumePoints;
    }

    public void setD_volumePoints(Integer d_volumePoints) {
        D_volumePoints = d_volumePoints;
    }

    public Integer getW_rsiPoints() {
        return W_rsiPoints;
    }

    public void setW_rsiPoints(Integer w_rsiPoints) {
        W_rsiPoints = w_rsiPoints;
    }

    public Integer getW_macdPoints() {
        return W_macdPoints;
    }

    public void setW_macdPoints(Integer w_macdPoints) {
        W_macdPoints = w_macdPoints;
    }

    public Integer getW_adxPoints() {
        return W_adxPoints;
    }

    public void setW_adxPoints(Integer w_adxPoints) {
        W_adxPoints = w_adxPoints;
    }

    public Integer getW_kstPoints() {
        return W_kstPoints;
    }

    public void setW_kstPoints(Integer w_kstPoints) {
        W_kstPoints = w_kstPoints;
    }

    public Integer getW_emaPoints() {
        return W_emaPoints;
    }

    public void setW_emaPoints(Integer w_emaPoints) {
        W_emaPoints = w_emaPoints;
    }

    public Integer getW_volumePoints() {
        return W_volumePoints;
    }

    public void setW_volumePoints(Integer w_volumePoints) {
        W_volumePoints = w_volumePoints;
    }

    public Integer getM_rsiPoints() {
        return M_rsiPoints;
    }

    public void setM_rsiPoints(Integer m_rsiPoints) {
        M_rsiPoints = m_rsiPoints;
    }

    public Integer getM_macdPoints() {
        return M_macdPoints;
    }

    public void setM_macdPoints(Integer m_macdPoints) {
        M_macdPoints = m_macdPoints;
    }

    public Integer getM_adxPoints() {
        return M_adxPoints;
    }

    public void setM_adxPoints(Integer m_adxPoints) {
        M_adxPoints = m_adxPoints;
    }

    public Integer getM_kstPoints() {
        return M_kstPoints;
    }

    public void setM_kstPoints(Integer m_kstPoints) {
        M_kstPoints = m_kstPoints;
    }

    public Integer getM_emaPoints() {
        return M_emaPoints;
    }

    public void setM_emaPoints(Integer m_emaPoints) {
        M_emaPoints = m_emaPoints;
    }

    public Integer getM_volumePoints() {
        return M_volumePoints;
    }

    public void setM_volumePoints(Integer m_volumePoints) {
        M_volumePoints = m_volumePoints;
    }

    public Integer getMIN75_rsiPoints() {
        return MIN75_rsiPoints;
    }

    public void setMIN75_rsiPoints(Integer MIN75_rsiPoints) {
        this.MIN75_rsiPoints = MIN75_rsiPoints;
    }

    public Integer getMIN75_macdPoints() {
        return MIN75_macdPoints;
    }

    public void setMIN75_macdPoints(Integer MIN75_macdPoints) {
        this.MIN75_macdPoints = MIN75_macdPoints;
    }

    public Integer getMIN75_adxPoints() {
        return MIN75_adxPoints;
    }

    public void setMIN75_adxPoints(Integer MIN75_adxPoints) {
        this.MIN75_adxPoints = MIN75_adxPoints;
    }

    public Integer getMIN75_kstPoints() {
        return MIN75_kstPoints;
    }

    public void setMIN75_kstPoints(Integer MIN75_kstPoints) {
        this.MIN75_kstPoints = MIN75_kstPoints;
    }

    public Integer getMIN75_emaPoints() {
        return MIN75_emaPoints;
    }

    public void setMIN75_emaPoints(Integer MIN75_emaPoints) {
        this.MIN75_emaPoints = MIN75_emaPoints;
    }

    public Integer getMIN75_volumePoints() {
        return MIN75_volumePoints;
    }

    public void setMIN75_volumePoints(Integer MIN75_volumePoints) {
        this.MIN75_volumePoints = MIN75_volumePoints;
    }

    public Integer getAllRank() {
        return allRank;
    }

    public void setAllRank(Integer allRank) {
        this.allRank = allRank;
    }

    public Integer getD_Rank() {
        return D_Rank;
    }

    public void setD_Rank(Integer d_Rank) {
        D_Rank = d_Rank;
    }

    public Integer getW_Rank() {
        return W_Rank;
    }

    public void setW_Rank(Integer w_Rank) {
        W_Rank = w_Rank;
    }

    public Integer getM_Rank() {
        return M_Rank;
    }

    public void setM_Rank(Integer m_Rank) {
        M_Rank = m_Rank;
    }

    public Integer getMIN75_Rank() {
        return MIN75_Rank;
    }

    public void setMIN75_Rank(Integer MIN75_Rank) {
        this.MIN75_Rank = MIN75_Rank;
    }

    public Integer getD_allPoints() {
        return D_allPoints;
    }

    public void setD_allPoints(Integer d_allPoints) {
        D_allPoints = d_allPoints;
    }

    public Integer getW_allPoints() {
        return W_allPoints;
    }

    public void setW_allPoints(Integer w_allPoints) {
        W_allPoints = w_allPoints;
    }

    public Integer getM_allPoints() {
        return M_allPoints;
    }

    public void setM_allPoints(Integer m_allPoints) {
        M_allPoints = m_allPoints;
    }

    public Integer getMIN75_allPoints() {
        return MIN75_allPoints;
    }

    public void setMIN75_allPoints(Integer MIN75_allPoints) {
        this.MIN75_allPoints = MIN75_allPoints;
    }

    public Integer getMIN75_IndicatorPoints() {
        return MIN75_IndicatorPoints;
    }

    public void setMIN75_IndicatorPoints(Integer MIN75_IndicatorPoints) {
        this.MIN75_IndicatorPoints = MIN75_IndicatorPoints;
    }

    @Override
    public String toString() {
        return "StockRankOutput{" +
                "symbol='" + symbol + '\'' +
                ", allRank=" + allRank +
                ", allPoints=" + allPoints +
                ", M_Rank=" + M_Rank +
                ", M_allPoints=" + M_allPoints +
                ", W_Rank=" + W_Rank +
                ", W_allPoints=" + W_allPoints +
                ", D_Rank=" + D_Rank +
                ", D_allPoints=" + D_allPoints +
                ", MIN75_Rank=" + MIN75_Rank +
                ", MIN75_allPoints=" + MIN75_allPoints +
                ", HL_BreakoutPoints=" + HL_BreakoutPoints +
                ", M_IndicatorPoints=" + M_IndicatorPoints +
                ", W_IndicatorPoints=" + W_IndicatorPoints +
                ", D_IndicatorPoints=" + D_IndicatorPoints +
                ", MIN75_IndicatorPoints=" + MIN75_IndicatorPoints +
                ", D_rsiPoints=" + D_rsiPoints +
                ", D_macdPoints=" + D_macdPoints +
                ", D_adxPoints=" + D_adxPoints +
                ", D_kstPoints=" + D_kstPoints +
                ", D_emaPoints=" + D_emaPoints +
                ", D_volumePoints=" + D_volumePoints +
                ", W_rsiPoints=" + W_rsiPoints +
                ", W_macdPoints=" + W_macdPoints +
                ", W_adxPoints=" + W_adxPoints +
                ", W_kstPoints=" + W_kstPoints +
                ", W_emaPoints=" + W_emaPoints +
                ", W_volumePoints=" + W_volumePoints +
                ", M_rsiPoints=" + M_rsiPoints +
                ", M_macdPoints=" + M_macdPoints +
                ", M_adxPoints=" + M_adxPoints +
                ", M_kstPoints=" + M_kstPoints +
                ", M_emaPoints=" + M_emaPoints +
                ", M_volumePoints=" + M_volumePoints +
                ", MIN75_rsiPoints=" + MIN75_rsiPoints +
                ", MIN75_macdPoints=" + MIN75_macdPoints +
                ", MIN75_adxPoints=" + MIN75_adxPoints +
                ", MIN75_kstPoints=" + MIN75_kstPoints +
                ", MIN75_emaPoints=" + MIN75_emaPoints +
                ", MIN75_volumePoints=" + MIN75_volumePoints +
                '}';
    }

    @Override
    public int compareTo(StockRankOutput o) {
        return this.allPoints < o.allPoints ? 1 : -1;
    }
}
