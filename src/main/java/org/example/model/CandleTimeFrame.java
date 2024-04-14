package org.example.model;

public enum CandleTimeFrame {

    SEVENTY_FIVE_MINUTE("SEVENTY_FIVE_MINUTE"),
    DAILY("DAILY"),
    WEEKLY("WEEKLY"),
    MONTHLY("MONTHLY"),
    ;

    private final  String value;
    private CandleTimeFrame(String value){
        this.value=value;

    }
    public String value(){return this.value;}

    public CandleTimeFrame fromValue(String value){
        CandleTimeFrame[] candleTimeFrames=values();

        for(int i = 0; i < candleTimeFrames.length; ++i) {
            CandleTimeFrame c = candleTimeFrames[i];
            if (c.value.equals(value)) {
                return c;
            }
        }

        throw new IllegalArgumentException(value);
    }

}
