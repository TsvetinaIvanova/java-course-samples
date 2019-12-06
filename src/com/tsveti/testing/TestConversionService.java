package com.tsveti.testing;

import com.tsveti.javacourse.ConversionService;

public class TestConversionService {
    public static void main(String[] args){
        double[][] results = ConversionService.allKgToPounds(14.0, 29.0,
                6.5, 7.7);
        for (double[] result : results) {
            System.out.println(result[0] + "->" + result[1]);
        }
    }
}
