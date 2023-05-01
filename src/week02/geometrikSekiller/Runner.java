package week02.geometrikSekiller;

import java.util.Scanner;

public class Runner {
      /*
         SORU 2:
            Geometrik şekillerin çevre ve alan hesaplamalarını OOP kullanarak kodlayınız
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Geometrik sekil seciniz : \n" +
                "1. Dikdortgen\n" +
                "2. Daire");
        int secim = scan.nextInt();

        switch (secim) {
            case 1: {
                Dikdortgen dikdortgen1 = new Dikdortgen();
                dikdortgen1.cevre();
                dikdortgen1.alan();
                break;
            }
            case 2: {
                Daire daire1 = new Daire();
                daire1.cevre();
                daire1.alan();
                break;
            }
        }
    }
}
