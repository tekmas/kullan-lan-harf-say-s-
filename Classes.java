package paket;

import java.util.Scanner;

public class Classes {

     static int FirstFactorial(int num) {
        int sonuc =1;
            for (int i=num;i>=1;i--){
                sonuc = sonuc*i;
            }
         return sonuc;
        }

        public static void main (String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.println("sayı gir");
            System.out.println(FirstFactorial(s.nextInt()));
        }
    }
