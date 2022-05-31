package paket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sinif {
    static String test="Merhaba Dünya yazısıdır";
    static List <String> liste=new ArrayList<>();

        public static void main(String[] args) {


            for (int i = 0; i < test.length(); i++) {
                if (!liste.contains(test.charAt(i))) {
                    liste.add(String.valueOf(1+ test.charAt(i)));
               } else {
                    int harfsayi = Integer.parseInt(liste.get(test.charAt(i)));
liste.add(String.valueOf((harfsayi+1)+(test.charAt(i))));
                }
            }
            System.out.println(test);
            System.out.println(liste);
        }
}
