package org.example.comparator;

import org.example.model.StockRankOutput;

import java.util.Comparator;

public class StockRankMIN75Comparator implements Comparator<StockRankOutput> {
    @Override
    public int compare(StockRankOutput o1, StockRankOutput o2) {
        if(o1.getMIN75_allPoints()  < o2.getMIN75_allPoints()){
            return 0;
        }
        return o1.getMIN75_allPoints()  < o2.getMIN75_allPoints() ? 1 : -1 ;
    }
}
