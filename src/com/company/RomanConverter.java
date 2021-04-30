package com.company;

import java.util.Locale;

public class RomanConverter {

    public static boolean isThisIsRomanChars(String[] words) throws Exception {
        //Делаем проверку римские это цифры или арабские или те и те, в данном случае выдаем ошибку
        if (words.length != 3) {
            throw new Exception("Ошибка");
        }

        boolean varBool1 = isThisConvertableToArabic(words[0]);
        boolean varBool2 = isThisConvertableToArabic(words[2]);

        return varBool1 && varBool2;
    }

    private static boolean isThisConvertableToArabic(String cccchar) {
        try {
            Integer.parseInt(cccchar);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public static String transformRomanToArabic(String word) throws Exception {

        word = word.toUpperCase(Locale.ROOT);

        switch (word) {
            case "I":
                return "1";
            case "II":
                return "2";
            case "III":
                return "3";
            case "IV":
                return "4";
            case "V":
                return "5";
            case "VI":
                return "6";
            case "VII":
                return "7";
            case "VIII":
                return "8";
            case "IX":
                return "9";
            case "X":
                return "10";
            default:
                throw new Exception("Ошибка");
        }
    }

    public static String transformArabicToRoman(int result) {

        if (result >= 100) {
            return "C";
        } else if (result > 90) {
            return "XC" + fromOneToTenArabicConvertToRoman(result - 90);
        } else if (result < 90 && result > 80) {
            return "LXXX" + fromOneToTenArabicConvertToRoman(result - 80);
        } else if (result < 80 && result > 70) {
            return "LXX" + fromOneToTenArabicConvertToRoman(result - 70);
        } else if (result < 70 && result > 60) {
            return "LX" + fromOneToTenArabicConvertToRoman(result - 60);
        } else if (result < 60 && result > 50) {
            return "L" + fromOneToTenArabicConvertToRoman(result - 50);
        } else if (result < 50 && result > 40) {
            return "XL" + fromOneToTenArabicConvertToRoman(result - 40);
        } else if (result < 40 && result > 30) {
            return "XXX" + fromOneToTenArabicConvertToRoman(result - 30);
        } else if (result < 30 && result > 20) {
            return "XX" + fromOneToTenArabicConvertToRoman(result - 20);
        } else if (result < 20 && result >= 10) {
            return "X" + fromOneToTenArabicConvertToRoman(result - 10);
        } else {
            return fromOneToTenArabicConvertToRoman(result);
        }

    }

    private static String fromOneToTenArabicConvertToRoman(int numberToConvert) {
        switch (numberToConvert) {
            case 0:
                return "";
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            default:
                return "Ошибка";

        }
    }

}
