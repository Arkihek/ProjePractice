package week02.geometrikSekiller;

import java.util.Scanner;

public class Dikdortgen {
    Scanner scan = new Scanner(System.in);

    void cevre() {
        System.out.print("Kisa kenar uzunlugunu giriniz : ");
        int kKenar = scan.nextInt();
        System.out.print("Uzun kenar uzunlugunu giriniz : ");
        int uKenar = scan.nextInt();
        System.out.println("Dikdortgenin cevresi : " + (kKenar + uKenar) * 2);
    }

    void alan() {
        System.out.print("Kisa kenar uzunlugunu giriniz : ");
        int kKenar = scan.nextInt();
        System.out.print("Uzun kenar uzunlugunu giriniz : ");
        int uKenar = scan.nextInt();
        System.out.println("Dikdortgenin alani : " + (kKenar * uKenar));
    }
}
