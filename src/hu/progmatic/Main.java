package hu.progmatic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1. feladat

        System.out.println("Hi!");
        System.out.println("Adj meg egy évet!");
        Scanner scanner = new Scanner(System.in);
        //n > 1582 ; n % 4 == 0 ; n % 100 == 0 && n % 400 == 0;
        int ev = scanner.nextInt();
        scanner.nextLine();
        boolean szokoev = ev > 1582 && ev % 4 == 0;
        if (szokoev && ev % 100 !=0){
            System.out.println("Az általad megadott év: " + ev + " szökőév.");
        }else if (ev % 100 == 0 && ev % 400 == 0){
            System.out.println("Az általad megadott év: " + ev + " szökőév.");
        }else{
            System.out.println("Az általad megadott év: " + ev + " nem szökőév.");
        }
    }
}
