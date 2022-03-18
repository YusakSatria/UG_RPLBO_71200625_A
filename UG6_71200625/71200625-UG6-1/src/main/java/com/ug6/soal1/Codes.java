package com.ug6.soal1;

import java.util.ArrayList;
import java.util.Arrays;

public class Codes
{
    public static ArrayList<String> COMPANYCODES;
    public static ArrayList<String> ANDROIDCODES;

    public static String generatePhoneCode(final String companyCode) {
        final int max = 20;
        final int min = 1;
        final double random = (max - min + 1) * Math.random() + min;
        final int randomCode = (int)random;
        return randomCode + companyCode + "X";
    }

    public static String generatePhoneCode(final String companyCode, final String androidCode) {
        final int max = 20;
        final int min = 1;
        final double random = (max - min + 1) * Math.random() + min;
        final int randomCode = (int)random;
        return  randomCode + companyCode + androidCode.charAt(0) + androidCode.charAt(androidCode.length() - 1);
    }

    static {
        Codes.COMPANYCODES = new ArrayList<String>(Arrays.asList("XM", "SG", "AP", "RM", "OP", "VV"));
        Codes.ANDROIDCODES = new ArrayList<String>(Arrays.asList("Lollipop", "Marshmallow", "Nougat", "Oreo", "Pie", "10 Q", "Red Velvet Cake", "Snow Cone", "Tiramisu"));
    }
}
