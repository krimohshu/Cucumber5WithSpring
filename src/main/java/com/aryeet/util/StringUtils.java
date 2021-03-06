package com.aryeet.util;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

public class StringUtils {

    public static String getTVsizeBasedOnInpu(String inputValue) {
        // StringBuilder sb = new StringBuilder("");
        String finalTVSizeString = "";


        List<String> tvSizes = Arrays.asList(inputValue.split(","));
        for (String tvSizeEnum : tvSizes) {
            switch (tvSizeEnum) {
                case "screen_size_20_28":
                    StringJoiner joiner1 = new StringJoiner(",");
                    joiner1.add("20-inches").
                            add("21-inches").
                            add("22-inches").
                            add("23-inches").
                            add("24-inches").
                            add("25-inches").
                            add("26-inches").
                            add("27-inches").
                            add("28-inches");
                    finalTVSizeString = finalTVSizeString.equals("") ? joiner1.toString() : finalTVSizeString + "," + joiner1.toString();


                    //  finalTVSizeString = finalTVSizeString + joiner1.toString();
                    break;

                case "screen_size_32_34":
                    StringJoiner joiner2 = new StringJoiner(",");
                    joiner2.add("32-inches").
                            add("33-inches").
                            add("34-inches");
                    finalTVSizeString = finalTVSizeString.equals("") ? joiner2.toString() : finalTVSizeString + "," + joiner2.toString();

                    // finalTVSizeString = finalTVSizeString + joiner2.toString();
                    break;

                case "screen_size_39_45":
                    StringJoiner joiner3 = new StringJoiner(",");

                    joiner3.add("39-inches").
                            add("40-inches").
                            add("41-inches").
                            add("42-inches").
                            add("43-inches").
                            add("44-inches").
                            add("45-inches");

                    finalTVSizeString = finalTVSizeString.equals("") ? joiner3.toString() : finalTVSizeString + "," + joiner3.toString();
                    // finalTVSizeString = finalTVSizeString + joiner3.toString();
                    break;

                case "screen_size_48_51":
                    StringJoiner joiner4 = new StringJoiner(",");
                    //  finalTVSizeString = finalTVSizeString + joiner4.toString();
                    finalTVSizeString = finalTVSizeString.equals("") ? joiner4.toString() : finalTVSizeString + ","  + joiner4.toString();

                    break;

                case "screen_size_55_60":
                    StringJoiner joiner5 = new StringJoiner(",");

                    joiner5.add("55-inches").
                            add("56-inches").
                            add("57-inches").
                            add("58-inches").
                            add("59-inches").
                            add("60-inches");
                    finalTVSizeString = finalTVSizeString + joiner5.toString();
                    break;
                case "screen_size_65_150":
                    StringJoiner joiner6 = new StringJoiner(",");
                    joiner6.add("65-inches");
                    //  finalTVSizeString = finalTVSizeString + joiner6.toString();
                    finalTVSizeString = finalTVSizeString.equals("") ? joiner6.toString() : finalTVSizeString + "," + joiner6.toString();
                    break;
                default:
                    System.out.println("TV size is invalid");

            }
        }

        return finalTVSizeString;
    }

    public static String getTVTypeBasedOnInput(String inputValue) {
        // StringBuilder sb = new StringBuilder("");
        String finalTVTypeString = "";

        List<String> tvType = Arrays.asList(inputValue.split(","));
        for (String tvTypeEnum : tvType) {
            switch (tvTypeEnum) {
                case "screen_type_oled":
                    StringJoiner joiner1 = new StringJoiner(",");
                    joiner1.add("OLED");

                    finalTVTypeString = finalTVTypeString.equals("") ? joiner1.toString() : finalTVTypeString + ","  + joiner1.toString();
                    break;

                case "screen_type_lcd":
                    StringJoiner joiner2 = new StringJoiner(",");
                    joiner2.add("LCD");

                    finalTVTypeString = finalTVTypeString.equals("") ? joiner2.toString() : finalTVTypeString + "," +  joiner2.toString();
                    break;

                case "screen_type_curved":
                    StringJoiner joiner3 = new StringJoiner(",");
                    joiner3.add("LCD curved");

                    finalTVTypeString = finalTVTypeString.equals("") ? joiner3.toString() : finalTVTypeString + ","  + joiner3.toString();
                    break;

                case "screen_type_qled":
                    StringJoiner joiner4 = new StringJoiner(",");
                    joiner4.add("QLED");

                    finalTVTypeString = finalTVTypeString.equals("") ? joiner4.toString() : finalTVTypeString  + "," + joiner4.toString();

                    break;

                default:
                    System.out.println("TV type is invalid");

            }
        }

        return finalTVTypeString;
    }
   /* public String getTVTypeBasedOnInput(String inputValue){

        finalTVTypeString

        return finalTVTypeString;
    }*/
}
