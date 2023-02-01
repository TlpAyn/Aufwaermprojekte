package Proje_02_KDV_Tutari;

import java.util.Scanner;

public class KDV_Tutari {
    public static void main(String[] args) {


        //    Alinina tutarin Kdv tutarini hesaplayip ekrana bastiran programi yaziniz  KDV %18
        Scanner input = new Scanner(System.in);
        double price, total,kdvPrice;
        System.out.println(" lutfen bir fiyat giriniz =");
         price = input.nextDouble();

         kdvPrice = (price*18)/100;

        total =kdvPrice+ price;

        System.out.println("price = " + price);
        System.out.println("kdvPrice = " + kdvPrice);
        System.out.println("total = " + total);


    }
}



