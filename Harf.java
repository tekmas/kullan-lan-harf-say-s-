package paket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Harf {
    public static void kelime_harfsayisi(String cumle)
    {
        Map<Character, Integer> harf_kullanım = new HashMap<>();
        int sayi, index=0;
        for (int i = 0; i < cumle.length(); i++)
        { sayi=0;
                for (int j = 0; j < cumle.length(); j++) {
                    if (cumle.toLowerCase().charAt(i) == cumle.toLowerCase().charAt(j))
                        ++sayi;
            }
                index=i;
                harf_kullanım.put((cumle.toLowerCase().charAt(index)),sayi);
    }
        for (Character k : harf_kullanım.keySet()) {
            if (k==' ') {
                System.out.println("space karakteri " + harf_kullanım.get(k) + " kez kullanılmıştır");
            }
            else {
                System.out.println(k + " harfi " + harf_kullanım.get(k) + " kez kullanılmıştır");
            }
            }
        }

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle yazın");
        String cumle= scan.nextLine();
        kelime_harfsayisi(cumle);
    }
    }

