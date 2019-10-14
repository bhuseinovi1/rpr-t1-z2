package ba.unsa.etf.rpr.predavanje03;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n) {
        int suma=0;
        while(n!=0) {
            int ostatak = n%10;
            suma+=ostatak;
            n/=10;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int n=ulaz.nextInt();
        for(int i=1;i<=n;i++) {
            if(i%sumaCifara(i)==0) {
                System.out.println(i);
            }
        }
    }
}
