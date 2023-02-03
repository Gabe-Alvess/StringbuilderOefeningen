package be.intecbrussel;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Github");
        System.out.println("---- Oefening 1 ----");
        // Maak een applicatie die kan controleren of een bepaald woord een palindroom is.

        String word = "meetsysteem";
        String wordReverse = "";

        StringBuilder str = new StringBuilder(word);
        wordReverse = str.reverse().toString();

        if (word.equals(wordReverse)) {
            System.out.println(word + " = " + wordReverse + ".");
            System.out.println(word + " is wel een palindroom!");
        } else {
            System.out.println(word + " != " + wordReverse + ".");
            System.out.println(word + " is geen palindroom!");
        }

        System.out.println("---- Oefening 2 ----");
        // Maak een applicatie die volgende tekst The Quick BroWn FoX!
        // Omzet naar enkel kleine letters.

        String text = "The Quick BroWn FoX!";
        StringBuilder lowercase = new StringBuilder(text.toLowerCase());
        System.out.println(lowercase);

        System.out.println("---- StringBuilder - oefenreeks 1 ----");

        System.out.println("Oefening - 1");
        // 1. Maak een stringBuilder aan en voeg een string toe. Print de stringBuilder naar de console.
        StringBuilder string = new StringBuilder("Hello World!");
        System.out.println(string);

        System.out.println("Oefening - 2");
        // 2. Gebruik de .length() eigenschap om de lengte van een string of stringBuilder te bepalen.
        StringBuilder str1 = new StringBuilder("Hello World");
        System.out.println(str1.length());

        System.out.println("Oefening - 3");
        // 3. Gebruik de .substring() methode om een deel van een string of stringBuilder
        // te selecteren en print dit naar de console.
        StringBuilder str2 = new StringBuilder("Hello World");
        System.out.println(str2.substring(6, 11));

        System.out.println("Oefening - 4");
        // 4. Gebruik de .delete() methode om een deel van een stringBuilder te verwijderen.
        StringBuilder str3 = new StringBuilder("Hello World Wold");
        System.out.println(str3.delete(12,17));
    }
}
