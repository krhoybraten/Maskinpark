package no.sikt.maskinpark;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("1 = Legg til ny laptop");
            System.out.println("2 = Legg til ny desktop");
            System.out.println("3 = Legg til ny server");
            System.out.println("4 = Vis oversikt over maskiner");
            System.out.println("Q = Avslutt");
            System.out.println("-".repeat(30));
            String menyvalg = in.next();

            if (menyvalg.equals("q")) {
                System.out.println("Farvel ...");
                System.exit(0);
            } else if (menyvalg.equals("1")) {

            } else if (menyvalg.equals("2")) {

            } else if (menyvalg.equals("3")) {

            } else if (menyvalg.equals("4"))
        }