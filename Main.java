package com.ademakkus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     int enKucuk;
     int enBuyuk;
     int toplam=0;
     double ortalama;

     int diziElemanSayisi;
     int eleman;
        Scanner sc=new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz : ");
        diziElemanSayisi=sc.nextInt();
        int[] sayilar=new int[diziElemanSayisi];

        //diziElemanSayisi=diziElemanSayisi;
        for (int i=0;i<diziElemanSayisi;i++) {
            System.out.print("Dizinin "+i+" . elemanı :");
            eleman=sc.nextInt();
            //System.out.println("Dizinin " + i + " . elemanı :"+eleman);
            sayilar[i]=eleman;
            toplam=toplam+sayilar[i];
        }
        System.out.println("--------------");
        System.out.print("Dizimiz :");
        for (int elemanlar:sayilar) {
            System.out.print(elemanlar+",");
        }
        System.out.println("\n Dizinin elemanları toplamı :"+toplam);

        ortalama=(double)toplam/sayilar.length;
        System.out.print("\n Dizinin elemanları ortalaması :"+ortalama);
    }
}
