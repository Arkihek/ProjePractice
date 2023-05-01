package week02;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class P01_ATM {
    /*
    SORU 1:

                    ATM
            Kullanicidan giriş için kart numarasi ve şifresini isteyin,
            eger herhangi birini yanlis girerse tekrar isteyin.Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
            Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,


            Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.


            Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

            Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekraninageri donsun.

            Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,


     */

    static Scanner scan = new Scanner(System.in);
    static String kartNo = "123456";
    static String sifre = "1234";
    static double bakiye = 50000;
    static int sayac = 0;


    public static void main(String[] args) {
        giris();
    }
    private static void giris() {
        System.out.println("KART NUMARASI GIRINIZ : ");
        String kKartNo = scan.nextLine().replace(" ", "");
        System.out.println("SIFRE GIRINIZ :");
        String kSifre = scan.next();

        if (kKartNo.equals(kartNo) && kSifre.equals(sifre)){ // kkartNo==kartNo kullanamayiz referans degerleri isin icine girer
            menu();
        } else {
            System.out.println("HATALI GIRIS YAPTINIZ...");
            scan.nextLine(); // DUMMY
            giris();
        }
    }

    private static void menu() {
        // Menu listesinde
        // Bakiye sorgula,
        // para yatirma,
        // para çekme,
        // para gönderme,
        // sifre değiştirme ve
        // cikis islemleri olacaktır.
        System.out.println("****** JAVA BANK ******\n" +
                "1. BAKIYE SORGULAMA\n" +
                "2. PARA YATIRMA\n" +
                "3. PARA CEKME\n" +
                "4. PARA GONDERME\n" +
                "5. SIFRE DEGISTIRME\n" +
                "6. CIKIS\n");
        int secim = scan.nextInt(); // char
        switch (secim){
            case 1:{
                bakiyeSorgula(); // case '1' // case "1"
            }
            case 2:{
                System.out.print("YATIRILACAK MIKTARI GIRINIZ : ");
                // double miktar = scan.nextDouble();
                paraYatirma(scan.nextDouble()); // PARAMETRELI BIR METHOD OLUSTURDUK *** veya bu sekilde yapilabilirdi paraYatirma(miktar);
            }
            case 3:{
                paraCekme();
            }
            case 4:{
                paraGonderme();
            }
            case 5:{
                sifreDegistirme();
            }
            case 6:{
                System.out.println("BIZI SECTIGINIZ ICIN TESEKKUR EDERIZ");
                System.exit(0);
            }
        }

    }

    private static void sifreDegistirme() {

        System.out.print("ESKI SIFREYI GIRINIZ : ");
        String eSifre = scan.next();
        if (eSifre.equals(sifre)){
            System.out.print("YENI SIFREYI GIRINIZ : ");
            sifre = scan.next();
            scan.nextLine(); // DUMMY
            giris();
        }else {
            System.out.println("HATALI GIRIS YAPTINIZ");
            sifreDegistirme();
        }
    }

    private static void paraGonderme() {
        // Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        scan.nextLine(); // dummy methodu -- scan yuzunden bug olusabiliyor bu sekilde kurtariyoruz
        System.out.print("IBAN GIRINIZ : ");
        String iban = scan.nextLine().toUpperCase().replace(" ","");
        if (iban.length() == 26 && iban.startsWith("TR")){
            System.out.print("GONDERMEK ISTEDIGINIZ TUTARI GIRINIZ : ");
            double miktar = scan.nextDouble();
            if (bakiye>=miktar){
                bakiye -= miktar;
                bakiyeSorgula();
            } else {
                System.out.println("GONDERMEK ISTEDIGINIZ MIKTARDA BAKIYE YOK.......");
                paraGonderme();
            }
        }
        else {
            System.out.println("HATALI IBAN GIRISI YAPTINIZ MENUYE YONLENDIRILIYORSUNUZ");
            menu();
        }
    }

    private static void paraCekme() {
        //  Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez
        System.out.print("CEKILECEK MIKTARI GIRINIZ : ");
        double miktar= scan.nextDouble();
        if (bakiye>=miktar){
            bakiye -= miktar;
            bakiyeSorgula();
        } else {
            System.out.println("CEKMEK ISTEDIGINIZ MIKTARDA BAKIYE YOK.......");
            paraCekme();
        }
    }

    private static void paraYatirma(double miktar) {
        bakiye += miktar;
        bakiyeSorgula();
    }

    private static void bakiyeSorgula() {
        System.out.println("Bakiyeniz : " + bakiye);
        System.out.println();
        menu();
    }
}
