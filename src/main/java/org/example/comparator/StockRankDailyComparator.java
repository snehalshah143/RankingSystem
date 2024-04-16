package org.example.comparator;

import org.example.model.StockRankOutput;

import java.util.Comparator;

public class StockRankDailyComparator implements Comparator<StockRankOutput> {
    @Override
    public int compare(StockRankOutput o1, StockRankOutput o2) {

        if(o1.getD_allPoints()  == o2.getD_allPoints()){
            return 0;
        }
        return o1.getD_allPoints()  < o2.getD_allPoints() ? 1 : -1 ;
    }
}
