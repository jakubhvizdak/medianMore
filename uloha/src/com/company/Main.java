package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner Cisla =  new Scanner(System.in);
    System.out.println("Zadaj pocet cisel: ");
    int pocet = Cisla.nextInt();
    String CisloMore = "Zadaj " + pocet + " cisel: ";
    System.out.println(CisloMore);
    int[] pole = new int[pocet];
    for (int i = 0; i < pocet; i++) {
        pole[i] = Cisla.nextInt();
    }
    for (int i = 0; i < pocet; i++) {
        System.out.println(pole[i]);
    }
        Arrays.sort(pole);
        int median;
            median = pole[pole.length/2];
            int vysledok;
    for (int i = 0; 1 < pocet; i++)  {
        vysledok = median - pole[i];
        System.out.println("Odchylka cisla " + pole[i] + " od medianu je: " + vysledok);


    }

    }
}