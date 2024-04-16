package org.example.comparator;

import org.example.model.StockRankOutput;

import java.util.Comparator;

public class StockRankMonthlyComparator implements Comparator<StockRankOutput> {
    @Override
    public int compare(StockRankOutput o1, StockRankOutput o2) {
        if(o1.getM_allPoints()  == o2.getM_allPoints()){
            return 0;
        }
        return o1.getM_allPoints()  < o2.getM_allPoints() ? 1 : -1 ;
    }
}
