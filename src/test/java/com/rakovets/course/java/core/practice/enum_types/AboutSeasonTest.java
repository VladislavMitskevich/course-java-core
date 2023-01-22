package com.rakovets.course.java.core.practice.enum_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AboutSeasonTest {
    static AboutSeason aboutSeason;

    @BeforeAll
    static void init() {
        aboutSeason = new AboutSeason();
    }

    @Test
    void printTemperatureOfSeasonTest01() {
        String text01 = aboutSeason.printTemperatureOfSeason();

        Assertions.assertEquals("Name season - SUMMER, temperature: 25.2;some description - Warm time of the year\n" +
                "Name season - AUTUMN, temperature: 16.3;some description - Cold time of the year\n" +
                "Name season - WINTER, temperature: -5.0;some description - Cold time of the year\n" +
                "Name season - SPRING, temperature: 17.8;some description - Cold time of the year\n", text01);
    }

    @Test
    void printSeasonLoveTest01() {
        String text01 = aboutSeason.printSeasonLove(Season.AUTUMN);

        Assertions.assertEquals("I love autumn \n", text01);
    }

    @Test
    void printSeasonLoveTest02() {
        String text01 = aboutSeason.printSeasonLove(Season.SPRING);

        Assertions.assertEquals("I love spring \n", text01);
    }

    @Test
    void printSeasonLoveTest03() {
        String text01 = aboutSeason.printSeasonLove(Season.SUMMER);

        Assertions.assertEquals("I love summer \n", text01);
    }

    @Test
    void printSeasonLoveTest04() {
        String text01 = aboutSeason.printSeasonLove(Season.WINTER);

        Assertions.assertEquals("I love winter \n", text01);
    }

    @Test
    void printAboutFavoriteSeasonTest01() {
        String string = aboutSeason.printAboutFavoriteSeason(Season.SUMMER);

        Assertions.assertEquals("my favourite season is summer. Summer is the season when the sun\n" +
                " shines brightly, the sky is rarely cloudy and the water in the sea becomes warm\n" +
                " enough to swim. Even if it becomes too hot, you can always go for a walk in the shady woods.\n", string);
    }

    @Test
    void printAboutFavoriteSeasonTest02() {
        String string = aboutSeason.printAboutFavoriteSeason(Season.SPRING);

        Assertions.assertEquals("I love spring. It is a wonderful season. Spring comes and nature awakens\n" +
                " from its winter sleep. The days become longer and the nights become shorter.\n" +
                "The ground is covered with fresh green grass and the first spring flowers. How lovely\n" +
                " the white snowdrops are! There are new leaves and blossoms on the trees. The birds begin\n" +
                " to sing and build their nests. The air is fresh and the sun shines brightly. The days are\n" +
                " warm and everything is full of life and joy. Everybody feels younger and stronger.\n", string);
    }
}
