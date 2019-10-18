package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static int sumaCifara(int broj)
    {
        int n=broj;
        //if(n<0) n=n*(-1);
        int suma=0;
        while(n!=0) {
            int cifra=n%10;
            suma+=cifra;
            n=n/10;
        }
        return suma;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Unesite n: ");
        Scanner ulaz=new Scanner(System.in);
        n=ulaz.nextInt();
        for(int i=1;i<n;i++) {
            if (i % sumaCifara(i) == 0) {
                System.out.println(i);
            }
        }
    }
}
