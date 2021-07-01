package com.challenge.indigital.utils;

import com.challenge.indigital.dto.Statistic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class MathCustomUtil {

    /**
     *
     * @param values: for standard deviation
     * @param numberOfDecimals :0 if you don't want to round
     * @return The average and standar deviation,
     * at least two values are required to calculate the standard deviation
     */
    public static Statistic getStandardDeviation(List<Integer> values, int numberOfDecimals){
        if(values.size() < 2) return new Statistic(0D, 0D);

        DoubleSummaryStatistics stats = values.stream()
                .mapToDouble((x) -> x)
                .summaryStatistics();

        Double sumOfSquares = values.stream()
                .mapToDouble((x) -> x)
                .map(age -> age - stats.getAverage())
                .map(res -> res * res)
                .sum();
        Double standardDeviation = Math.sqrt(sumOfSquares / (stats.getCount() - 1));

        if(numberOfDecimals > 0)
            return new Statistic(stats.getAverage(), MathCustomUtil.round(standardDeviation, numberOfDecimals));
        else
            return new Statistic(stats.getAverage(), standardDeviation);
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
