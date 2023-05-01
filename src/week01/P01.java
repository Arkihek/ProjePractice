package week01;

import java.util.*;

public class P01 {
    /*
        1. SORU
        Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
        Örnek: 12 = 1 1 0 0
     */

    public static void main(String[] args) {
        System.out.println("BIR SAYI GIRINIZ");

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        System.out.println("GIRILEN IFADENIN BINARY KARSILIGI : " + binaryConvert(sayi));
    }

    public static List<Integer> binaryConvert(int sayi) {
        ArrayList<Integer> list = new ArrayList<>();
        while (sayi >= 1) {
            list.add(sayi % 2);
            sayi/=2; // sayi=sayi/2;
        }

        // Collections.reverse(list); // List`leri tersine ceviriyor **** Muhim bilgi

        List<Integer> tersList = new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            tersList.add(list.get(i));
        }


        return tersList;
    }


}
