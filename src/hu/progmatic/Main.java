package hu.progmatic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. feladat

        /*System.out.println("Hi!");
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
        }*/

        //2. feladat


        System.out.println("Add meg az ellenőrző számot:");
        int ellenorzo = scanner.nextInt();
        scanner.nextLine();
        boolean pozitiv = ellenorzo > 0;
        int i;
        int n =0;
        int[] osztok = new int[300];
        for(i = 1; i <= ellenorzo; i++){
            if(ellenorzo % i ==0){
                osztok[n] = i;
                n++;
                System.out.println(i + "osztója a számnak.");
            }
        }



    }
}