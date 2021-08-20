package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double temporarySum = 0;
        int counter = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            counter++;
            temporarySum += temperature.getValue();
        }
        double averageTemperature = temporarySum/(double)counter;
        return averageTemperature;

    }

    public double calculateMedianTemperature() {
        List<Double> sortedTemperatures = new LinkedList<>();
        int counter = 0;
        int counterSum = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            counter++;
            counterSum += counter;
            sortedTemperatures.add(temperature.getValue());
        }

        Collections.sort(sortedTemperatures);

        if (counterSum % 2 != 0) {
            int medianIndex = (counterSum / counter) - 1;
            double medianTemperature = sortedTemperatures.get(medianIndex);
            return medianTemperature;
        }
        else {
            double medianIndex1 = (counterSum/(double)counter)-1.5;
            double medianIndex2 = (counterSum/(double)counter)-0.5;
            double medianTemperature = (sortedTemperatures.get((int)medianIndex1)+sortedTemperatures.get((int)medianIndex2))/2;
            return medianTemperature;
        }
    }
}
