package com.rakovets.course.java.core.practice.enum_types;

public class AboutSeason {
    private String seasonLove;
    private String aboutFavoriteSeason;

    public String printTemperatureOfSeason() {
        StringBuilder builder = new StringBuilder();
        for (Season season : Season.values()) {
            builder.append("Name season - ");
            builder.append(season);
            builder.append(", temperature: ");
            builder.append(season.getTemperature() + ";");
            builder.append("some description - ");
            builder.append(season.getDescription() + "\n");
        }
        return String.valueOf(builder);
    }

    public String printSeasonLove(Season season) {
        switch (season) {
            case SUMMER:
                seasonLove = "I love summer \n";
                break;
            case AUTUMN:
                seasonLove = "I love autumn \n";
                break;
            case WINTER:
                seasonLove = "I love winter \n";
                break;
            case SPRING:
                seasonLove = "I love spring \n";
                break;
            default:
                seasonLove = "wrong season \n";
                break;
        }
        return seasonLove;
    }

    public String printAboutFavoriteSeason(Season season) {
        switch (season) {
            case SUMMER:
                aboutFavoriteSeason = "my favourite season is summer. Summer is the season when the sun\n" +
                        " shines brightly, the sky is rarely cloudy and the water in the sea becomes warm\n" +
                        " enough to swim. Even if it becomes too hot, you can always go for a walk in the shady woods.\n";
                break;
            case AUTUMN:
                aboutFavoriteSeason = "I like autumn very much. The autumn months are: September, October, November.\n" +
                        "In September summer yields to autumn. The days become shorter and the nights become longer.\n" +
                        " The sun rays are not so bright and warm. The fruit trees that not long ago bloomed\n" +
                        " with flowers are heavy with juicy apples and pears. Harvest time is a rush season\n" +
                        " for farmers. They gather sunflowers and maize, potatoes and cabbage, turnip and cucumbers,\n" +
                        " carrots and tomatoes. Early autumn is the period of flaming colours, when the landscape is\n" +
                        " gold and brown. In the daytime the silver gossamer is flying in the air. It’s a sign\n" +
                        " of the beautiful “Indian Summer”. But unfortunately this period of fine weather is very\n" +
                        " short and deep autumn follows it.\n" +
                        "October is the best month for planting trees. People also prepare for winter.\n" +
                        "  It is a season when the trees are fantastic — yellow, red, green and brown.\n" +
                        " The trees are loosing their leaves. Now the ground is like a carpet of many colours.\n" +
                        " It gets dark earlier and often heavy clouds cover the sky bringing rain.\n" +
                        " Birds don’t sing their songs. They begin to leave for warm countries.\n";
                break;
            case WINTER:
                aboutFavoriteSeason = "My favourite season is winter. Winter is a beautiful season.\n" +
                        " Some people like summer or autumn, but I am fond of winter. Winter months are December,\n" +
                        " January and February. But in Tatarstan the winter begins in November and ends in March\n" +
                        " or April.\n" +
                        "I always look forward to this season. In winter the ground and trees are white with snow\n" +
                        " which crunches under your feet. The rime sparkles on the branches and the icicles like\n" +
                        " precious diamonds hang down from the roofs of the houses.\n";
                break;
            case SPRING:
                aboutFavoriteSeason = "I love spring. It is a wonderful season. Spring comes and nature awakens\n" +
                        " from its winter sleep. The days become longer and the nights become shorter.\n" +
                        "The ground is covered with fresh green grass and the first spring flowers. How lovely\n" +
                        " the white snowdrops are! There are new leaves and blossoms on the trees. The birds begin\n" +
                        " to sing and build their nests. The air is fresh and the sun shines brightly. The days are\n" +
                        " warm and everything is full of life and joy. Everybody feels younger and stronger.\n";
        }
        return aboutFavoriteSeason;
    }
}
