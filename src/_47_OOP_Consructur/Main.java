package _47_OOP_Consructur;

public class Main {
    public static void main(String[] args) {

        Hesap_Makinesi makine1;
        makine1= new Hesap_Makinesi(4,2);
        System.out.println(makine1.sayi1+ "  "+ makine1.sayi2);
        System.out.println(makine1.toplama());
        makine1.sayi1=1;
        System.out.println(makine1.carpma());

        Hesap_Makinesi makine2 = new Hesap_Makinesi(4,5,"mavi");


    }
}
