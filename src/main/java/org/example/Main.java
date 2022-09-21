package org.example;


import java.io.FileNotFoundException;
import java.io.IOException;
/*
Napraviti fajl domaci22.xslx i u prve dve kolone upisati svoje ime pa prezime,
u drugom redu upisati nasumicno ime i prezime. Napisati metodu u javi koja ce ispisati ta 2 imena i prezimena.
Napisati metodu koja ce upisivati u xslx fajl u prvu i drugu kolonu ime i prezime.
Treba da dodate jos 8 nasumicno generisanih imena i prezimena koriscenjem biblioteke Java Faker.
Opet ih ispisati koristeci metodu za ispisivanje.
Metodu za ispisivanje napraviti da radi tako da kada dobijete prazane vrednosti u redu da prestane petlja.
Za kolone mozete fiksirati samo 2 kolone A i B.
Upisivanje ne mora da bude dinamicki, moze samo da upisuje od treceg reda (drugi index) do 10og reda.
 */
public class Main {
    public static void main(String[] args) {

        ReadExcel.readExcel("domaci22.xlsx");

        try {
            WriteExcel.writeExcel("domaci22.xlsx");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("File invalid for writing!");
        }



    }
}