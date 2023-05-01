package week01;

import java.util.Scanner;

public class P03 {
    /*
        3. SORU
        Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.
        Sezar Şifreleme: Sezar şifrelemesi, ilk kez Romalı lider Jül Sezar tarafından kullanılmış olan şifreleme tekniğidir. Bu şifreleme en basit ve en bilinen şifreleme tekniklerinden biridir.
        Düz metindeki her harfin, alfabeden belirli bir sayı ileride konumlu olan bir harfle değiştirildiği bir şifreleme türüdür.
     */
    // hello =======> ifmmp


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sifrelenecek metni giriniz : ");
        String str = scan.nextLine().toUpperCase();
        System.out.print("Kaydirma araligini giriniz : ");
        int kaydirma = scan.nextInt();

        sifrele(str, kaydirma);
    }

    private static void sifrele(String str, int kaydirma) {
        String sifrelenmisStr = "";
        String alfabe = "ABCDEFGHIİJKLMNOPRSTUVWXYZ";

        for (int i = 0; i < str.length(); i++) {
            char karakter = str.charAt(i);
            int karakterIndex = alfabe.indexOf(karakter); // karakter`in alfabedeki indexini elde ettik. eger harften baska bir deger girilirse indexOf -1 degeri dondurur.
            if (karakterIndex>=0){
                int yeniIndex = (karakterIndex+kaydirma)%alfabe.length() ; // 26 alfabe 26. Z ++ 10 36
                sifrelenmisStr += alfabe.charAt(yeniIndex);
            }else {
                sifrelenmisStr += str.charAt(i);
            }
        }
        System.out.println("Metnin sifrelenmis hali : " + sifrelenmisStr);


    }
}
