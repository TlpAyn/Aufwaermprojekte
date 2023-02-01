package Proje_03_Taksimetre;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        /*
        Kilometre basina 2.20
        kisa mesafe tutari 20 tl dir .
        20 alti ise fiyat 20 ;
        taksimetre acilis ucreti 10 tldir .
         */
        double tutar;
        double kilometre ;
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen Mesafe = ");
        kilometre = input.nextDouble();

        tutar= 10+(kilometre*2.20);

        if( tutar<20){
            System.out.println("Borcunuz 20 Tldir");
        }else
            System.out.println(" Borcunuz "+tutar+" Tldir");



    }
}
