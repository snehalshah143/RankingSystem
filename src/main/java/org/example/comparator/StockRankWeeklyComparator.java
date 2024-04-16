package org.example.comparator;

import org.example.model.StockRankOutput;

import java.util.Comparator;

public class StockRankWeeklyComparator implements Comparator<StockRankOutput> {
    @Override
    public int compare(StockRankOutput o1, StockRankOutput o2) {
        if(o1.getW_allPoints()  == o2.getW_allPoints()){
            return 0;
        }
        return o1.getW_allPoints()  < o2.getW_allPoints() ? 1 : -1 ;
    }
}
