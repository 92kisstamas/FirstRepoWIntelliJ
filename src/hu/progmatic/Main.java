package hu.progmatic;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. feladat

        /*
        System.out.println("Hi!");
        System.out.println("Adj meg egy évet!");
        //n > 1582 ; n % 4 == 0 ; n % 100 == 0 && n % 400 == 0;
        int ev = scanner.nextInt();
        scanner.nextLine();
        /*boolean szokoev = ev > 1582 && ev % 4 == 0;
        if (szokoev && ev % 100 !=0){
            System.out.println("Az általad megadott év: " + ev + " szökőév.");
        }else if (ev % 100 == 0 && ev % 400 == 0){
            System.out.println("Az általad megadott év: " + ev + " szökőév.");
        }else{
            System.out.println("Az általad megadott év: " + ev + " nem szökőév.");
        }
        boolean isLeapYear = (ev >= 1582 && (ev % 4 == 0 && ev % 100 != 0 || ev % 400 ==0));*/


        //2. feladat

/*
        System.out.println("Add meg az ellenőrző számot:");
        int ellenorzo = scanner.nextInt();
        scanner.nextLine();
        boolean pozitiv = ellenorzo > 0;
        int i;
        int n =0;
        int[] osztok = new int[30];
        for(i = 1; i <= ellenorzo; i++){
            if(ellenorzo % i ==0){
                osztok[n] = i;
                n++;
            }
        }
        System.out.println(Arrays.toString(osztok));*/


        //3. feladat

        /*
        /*int x = 3;
        int y = 0;

        for (int i = 1; i <= x ; i++){
            if(x % i ==0){
                y++;
            }
        }
        if (y == 2){
            System.out.println("Prím szám");
        }else{
            System.out.println("Nem prím szám");
        }
*/


        //4. feladat

        /*int x = 12;
        int y= 48;
        int z = 0;

        for (int i = 1; i <= x; i++){
                if (x % i == 0 && y % i ==0){
                    z = i;
            }
        }
        System.out.println("A legnagyobb közös osztó: "+ z);
     */

        //Gyakorló 1* 1. feladat

        /*int x = 10;
        int y = 0;

        if (y == 0){
            System.out.println("Nullával nem osztunk");
        }else{
            System.out.println(x/y);
        }*/

        /*//Gyakorló 1 2. feladat

        int x = -1;
        if (x <= 0){
            System.out.println(x);
        }else{
            System.out.println(x-1);
        }*/

        /*//Gyakorló 1 3. feladat

        int x = 5;

        if(x == 0){
            System.out.println("nulla");
        }else if(x > 0){
            System.out.println("pozitív");
        }else{
            System.out.println("negatív");
        }*/


    }
}