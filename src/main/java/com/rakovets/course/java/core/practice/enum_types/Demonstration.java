package com.rakovets.course.java.core.practice.enum_types;

public class Demonstration {
    public static void main(String[] args) {
        AboutSeason aboutSeason = new AboutSeason();
        System.out.println(aboutSeason.printAboutFavoriteSeason(Season.SPRING));
        System.out.println(aboutSeason.printSeasonLove(Season.AUTUMN));
        System.out.println(aboutSeason.printTemperatureOfSeason());

    }

}
