package ProJE_01_NotHesaplama;

import java.util.ArrayList;
import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        /*
        Istediginiz kadar bio mat kim fiz tar turk derslerinden notlar giriniz kullanicidan
         alarak  ve sonunda tum derslerin ortlamasini yazdiran bir program yaziniz .
         */
        System.out.println();
        ArrayList<Integer> bio = new ArrayList<>();
        ArrayList<Integer> mat = new ArrayList<>();
        ArrayList<Integer> kim = new ArrayList<>();
        ArrayList<Integer> fiz = new ArrayList<>();
        ArrayList<Integer> tar = new ArrayList<>();
        ArrayList<Integer> turk = new ArrayList<>();
        boolean a= true;
        while (a) {
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen ders numarasini giriniz.\n 1- Bioloji\n 2- Mat\n 3- Kimya\n 4- Fizik\n 5- Tarih\n 6- Turkce ");
            System.out.println(" Cikmak icin 7 ye basiniz ");
            int secim = input.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Biyoloji Dersini sectiniz .");
                    System.out.println(" Lutfen Dersin notunu giriniz ");
                    int bioD = input.nextInt();
                    bio.add(bioD);
                    break;
                case 2:
                    System.out.println("Matemeatik Dersini sectiniz .");
                    System.out.println(" Lutfen Dersin notunu giriniz ");
                    int matD = input.nextInt();
                    bio.add(matD);
                    break;
                case 3:
                    System.out.println("Kimya Dersini sectiniz .");
                    System.out.println(" Lutfen Dersin notunu giriniz ");
                    int kimD = input.nextInt();
                    bio.add(kimD);
                    break;
                case 4:
                    System.out.println("Fizik Dersini sectiniz .");
                    System.out.println(" Lutfen Dersin notunu giriniz ");
                    int fizD = input.nextInt();
                    bio.add(fizD);
                    break;
                case 5:
                    System.out.println("Tarih Dersini sectiniz .");
                    System.out.println(" Lutfen Dersin notunu giriniz ");
                    int tarD = input.nextInt();
                    bio.add(tarD);
                    break;
                case 6:
                    System.out.println("Turkce Dersini sectiniz .");
                    System.out.println(" Lutfen Dersin notunu giriniz ");
                    int turD = input.nextInt();
                    bio.add(turD);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hatali bir giris yaptiniz ");
            }
        }
      OrtalamaBio(bio);
      OrtalamaMat(mat);
      OrtalamaKim(kim);
      OrtalamaFiz(fiz);
      OrtalamaTar(tar);
      OrtalamaTurk(turk);
    }


    public static void OrtalamaTurk(ArrayList<Integer> turk) {

        int ortalama;
        int toplam = 0;
        for (int i = 0; i < turk.size(); i++) {
            toplam += turk.get(i);

        }
        ortalama = toplam / turk.size();
        System.out.println("Turkce  Notlari Ortalamasi =" + ortalama);
    }

    public static void OrtalamaTar(ArrayList<Integer> tar) {
        int ortalama;
        int toplam = 0;
        for (int i = 0; i < tar.size(); i++) {
            toplam += tar.get(i);
        }

        ortalama = toplam / tar.size();
        System.out.println("Turkce  Notlari Ortalamasi =" + ortalama);

    }

    public static void OrtalamaFiz(ArrayList<Integer> fiz) {
        int ortalama;
        int toplam = 0;
        for (int i = 0; i < fiz.size(); i++) {
            toplam += fiz.get(i);
        }

        ortalama = toplam / fiz.size();
        System.out.println("Turkce  Notlari Ortalamasi =" + ortalama);


    }

    public static void OrtalamaKim(ArrayList<Integer> kim) {
        int ortalama;
        int toplam = 0;
        for (int i = 0; i < kim.size(); i++) {
            toplam += kim.get(i);
        }

        ortalama = toplam / kim.size();
        System.out.println("Turkce  Notlari Ortalamasi =" + ortalama);


    }

    public static void OrtalamaMat(ArrayList<Integer> mat) {
        int ortalama;
        int toplam = 0;
        for (int i = 0; i < mat.size(); i++) {
            toplam += mat.get(i);
        }

        ortalama = toplam / mat.size();
        System.out.println("Turkce  Notlari Ortalamasi =" + ortalama);


    }

    public static void OrtalamaBio(ArrayList<Integer> bio) {
        int ortalama;
        int toplam = 0;
        for (int i = 0; i < bio.size(); i++) {
            toplam += bio.get(i);
        }

        ortalama = toplam / bio.size();
        System.out.println("Turkce  Notlari Ortalamasi =" + ortalama);


    }

}

