package org.example.model;

public class IndicatorRank {

    private Integer indicatorOverAllPoints;
    private Integer rsiPoints;

    private Integer macdPoints;

    private Integer adxPoints;

    private Integer kstPoints;

    private Integer emaPoints;

    private Integer volumePoints;

    public Integer getVolumePoints() {
        return volumePoints;
    }

    public void setVolumePoints(Integer volumePoints) {
        this.volumePoints = volumePoints;
    }

    public Integer getIndicatorOverAllPoints() {
        return indicatorOverAllPoints;
    }

    public void setIndicatorOverAllPoints(Integer indicatorOverAllPoints) {
        this.indicatorOverAllPoints = indicatorOverAllPoints;
    }

    public Integer getRsiPoints() {
        return rsiPoints;
    }

    public void setRsiPoints(Integer rsiPoints) {
        this.rsiPoints = rsiPoints;
    }

    public Integer getMacdPoints() {
        return macdPoints;
    }

    public void setMacdPoints(Integer macdPoints) {
        this.macdPoints = macdPoints;
    }



    public Integer getAdxPoints() {
        return adxPoints;
    }

    public void setAdxPoints(Integer adxPoints) {
        this.adxPoints = adxPoints;
    }

    public Integer getKstPoints() {
        return kstPoints;
    }

    public void setKstPoints(Integer kstPoints) {
        this.kstPoints = kstPoints;
    }

    public Integer getEmaPoints() {
        return emaPoints;
    }

    public void setEmaPoints(Integer emaPoints) {
        this.emaPoints = emaPoints;
    }

    @Override
    public String toString() {
        return "IndicatorRank{" +
                "indicatorOverAllPoints=" + indicatorOverAllPoints +
                ", rsiPoints=" + rsiPoints +
                ", macdPoints=" + macdPoints +
                ", adxPoints=" + adxPoints +
                ", kstPoints=" + kstPoints +
                ", emaPoints=" + emaPoints +
                ", volumePoints=" + volumePoints +
                '}';
    }
}
