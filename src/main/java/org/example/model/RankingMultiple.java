package org.example.model;

public class RankingMultiple {

    private Integer M_Multiple;
    private Integer W_Multiple;

    private Integer D_Multiple;
    private Integer MIN75_Multiple;

    public RankingMultiple(Integer m_Multiple, Integer w_Multiple, Integer d_Multiple, Integer MIN75_Multiple) {
        this.M_Multiple = m_Multiple;
        this.W_Multiple = w_Multiple;
        this.D_Multiple = d_Multiple;
        this.MIN75_Multiple = MIN75_Multiple;
    }

    public Integer getM_Multiple() {
        return M_Multiple;
    }

    public void setM_Multiple(Integer m_Multiple) {
        M_Multiple = m_Multiple;
    }

    public Integer getW_Multiple() {
        return W_Multiple;
    }

    public void setW_Multiple(Integer w_Multiple) {
        W_Multiple = w_Multiple;
    }

    public Integer getD_Multiple() {
        return D_Multiple;
    }

    public void setD_Multiple(Integer d_Multiple) {
        D_Multiple = d_Multiple;
    }

    public Integer getMIN75_Multiple() {
        return MIN75_Multiple;
    }

    public void setMIN75_Multiple(Integer MIN75_Multiple) {
        this.MIN75_Multiple = MIN75_Multiple;
    }
}
