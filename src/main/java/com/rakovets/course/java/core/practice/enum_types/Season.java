package com.rakovets.course.java.core.practice.enum_types;

public enum Season {
    SUMMER(25.2) {
        @Override
        public String getDescription() {
            return "Warm time of the year";
        }
    },
    AUTUMN(16.3),
    WINTER(-5),
    SPRING(17.8);

    private double temperature;

    public String getDescription() {
        return "Cold time of the year";
    }

    Season(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
}
