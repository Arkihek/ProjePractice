package week02.geometrikSekiller;

import java.util.Scanner;

public class Daire {
    Scanner scan = new Scanner(System.in);

    void cevre() {
        System.out.print("Dairenin yaricap uzunlugunu giriniz : ");
        int r = scan.nextInt();
        System.out.println("Dairenin cevresi : " + (2*3.14*r));
    }

    void alan() {
        System.out.print("Dairenin yaricap uzunlugunu giriniz : ");
        int r = scan.nextInt();
        System.out.println("Dairenin alani : " + (3.14*r*r));
    }
}
