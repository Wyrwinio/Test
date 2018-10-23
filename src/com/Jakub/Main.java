package com.Jakub;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int wybor;
        do{
            System.out.println();
        System.out.println("Witamy w programie obliczającym ciąg fibonacciego: Wybierz jedną z opcji: ");
        System.out.println("1. Losowy ciąg");
        System.out.println("2. Ciąg n-elementowy");
        Scanner scr = new Scanner(System.in);
        Wyliczanie w = new Wyliczanie();
        wybor = scr.nextInt();
        switch (wybor){
            case 1:
                int od,doo;
                Random  rnd = new Random();
                System.out.println("Z jakiego przedziału ma losować? ");
                System.out.println("Od: ");
                od= scr.nextInt();
                System.out.println("Do: ");
                doo= scr.nextInt();
                if(doo < od){
                    System.out.println("błędny przedział");
                }
                else{
                    w.wyliczciag(rnd.nextInt((doo - od +1)) + od);
                }
                break;
            case 2:

                System.out.println("Ilu elementowy ciąg fibonacciego wygenerować? ");
                int x;
                x = scr.nextInt();
                 if(x < 0) {
                     System.out.println("Podałeś liczbę mniejszą od 0");
                     }
                     else {
                     w.wyliczciag(x);
                 }
                break;
                default:

        }




    }
    while(wybor != 3);
    }
}
