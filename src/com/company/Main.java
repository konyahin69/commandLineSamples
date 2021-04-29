package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

        Scanner console = new Scanner(System.in);
        String varExpression = console.nextLine();

        String[] words;
        words = varExpression.split(" ");


        boolean thisIsRomanChars = RomanConverter.isThisIsRomanChars(words);

        if (thisIsRomanChars) {
            words[0] = RomanConverter.transformRomanToArabic(words[0]);
            words[2] = RomanConverter.transformRomanToArabic(words[2]);
        }

        //После того как сделали преобразование, выполняем вычисление
        int result = calculateWords(words);

        //Если цифры были римские, делаем обратное преобразование и выводим результат
        if (thisIsRomanChars) {

            String resultString = RomanConverter.transformArabicToRoman(result);

            System.out.println(resultString);
        } else {
            System.out.println(result);
        }


    }


    private static int calculateWords(String[] words) throws Exception {
        //После того как сделали преобразование, выполняем вычисление

        int numberOne = Integer.parseInt(words[0]);
        int numberSecond = Integer.parseInt(words[2]);

        if ((numberOne < 1 || numberOne > 10) || (numberSecond < 1 || numberSecond > 10)) {
            throw new Exception("Ошибка");
        }


        switch (words[1]) {
            case "+":
                return numberOne + numberSecond;
            case "-":
                return numberOne - numberSecond;
            case "*":
                return numberOne * numberSecond;
            case "/":
                return numberOne / numberSecond;
            default:
                throw new Exception("Ошибка");
        }
    }


}