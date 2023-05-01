package week01;

import java.util.ArrayList;
import java.util.List;

public class P04 {


    // Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
    //kismini list olarak bize donduren bir method olusturun


    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("melih");
        arr.add("Mehmet");
        arr.add("Hakkı");


        List<String> yeniarr = isimListesindenHarfSilme(arr, 'e');

        System.out.println(yeniarr);

    }
    public static List<String> isimListesindenHarfSilme(List<String> arr, char silinen){

            List<String> yeniArr = new ArrayList<>();

            for (int i = 0; i < arr.size(); i++) {
                String isim = arr.get(i);
                if (isim.indexOf(silinen) == -1) {
                    yeniArr.add(isim);
                }
            }
            return yeniArr;
        }

    }





