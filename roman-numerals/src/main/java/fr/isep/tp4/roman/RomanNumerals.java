package fr.isep.tp4.roman;

public class RomanNumerals {
    public static String convert(int number) {
        String[] roman = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return roman[number];
    }
}
