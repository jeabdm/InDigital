package com.challenge.indigital.utils;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathCustomUtilTest {

    private List<Integer> values;

    @BeforeAll
    public void init() {
        values = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    }

    @Test
    void validStandardDeviation() {
        assertEquals(9.024041962077378, MathCustomUtil.getStandardDeviation(values, 0).getStandardDeviation());
    }

    @Test
    void standardDeviationEmptyList() {
        List<Integer> values = new ArrayList<>();
        assertEquals(0, MathCustomUtil.getStandardDeviation(values, 0).getStandardDeviation());
    }

    @Test
    void validStandardDeviationRounded() {
        assertEquals(9.02404, MathCustomUtil.getStandardDeviation(values, 5).getStandardDeviation());
    }
}