package week01;

import java.util.ArrayList;
import java.util.List;

public class P05 {
    // Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
    //kismini list olarak bize donduren bir method olusturun


    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("melih");
        arr.add("Mehmet");
        arr.add("Hakkı");


        List<String> yyeniarr = isimListesindenHarfSilme(arr, "melih");

        System.out.println(yyeniarr);


    }

    public static List<String> isimListesindenHarfSilme(List<String> arr, String silinen) {

        List<String> silnmisHalli = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {

            silnmisHalli.add(arr.get(i));


            if (arr.get(i).equalsIgnoreCase(silinen)) {

                silnmisHalli.remove(silinen);

            }

        }

        return silnmisHalli;

    }
}
