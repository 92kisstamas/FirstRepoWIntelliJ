package hu.progmatic;

import java.util.*;

public class homeWork {
    public static void main(String[] args) {

        // Elem csere, ha...
        /*
        int[] numbers = {2, 1, -4, 3};
        int repl = 0;
        boolean battRepl = numbers.length >= 2 && numbers[0] > numbers[1];
        if(battRepl) {
            repl=numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = repl;
        }
        System.out.println(Arrays.toString(numbers));
         */

        // Tömb növelése
        /*
        int[] numbers = {};
        int newElement = 1;
        int[] newArray = new int[numbers.length + 1];
        int i = 0;
        for (i = 0; i <= numbers.length - 1; i++){
            newArray[i] = numbers[i];
        }
        newArray[newArray.length -1] = newElement;
        System.out.println(Arrays.toString(newArray));
        */

        //Számjegyösszegző
        /*
        int number = -5483229;
        int amount = 0;
        if (number < 0) {number *=  -1;}
        while (number != 0) {
            amount += number % 10;
            number = number/10;
        }
        System.out.println(amount);
        */

        //Hatványozás
        /*
        int base = 7;
        int exponent = 5;
        int amount = base;
        for (int i = 2; i <= exponent; i++) {
            amount *= base;
        }
        if (exponent == 0) {amount = 1;}
        System.out.println(amount);
        */

        //Minimumkeresés
        /*
        int[] numbers = {-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};
        int i;
        int minimum = numbers[0];
        for (i = 0; i < numbers.length; i++){
            if (numbers[i] < minimum){minimum = numbers[i];}
        }
        System.out.println(minimum);
        */

        //Maximumkeresés
        /*
        int[] numbers = {-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};
        int i;
        int maximum = numbers[0];
        for (i = 0; i < numbers.length; i++){
            if (numbers[i] > maximum){maximum = numbers[i];}
        }
        System.out.println(maximum);
        */

        //Konvertálás
        /*
        int[] numbers = {-2, 1, -6, 10};
        String[] strNum = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            strNum[i] = String.valueOf(numbers[i]);
        }
        System.out.println(Arrays.toString(strNum));
        */

        //Tükörtömb
        /*
        int[] numbers = {1, 2, 2, 3, 5, 5, 4, 3, 2, 2, 1};
        boolean mirror = numbers.length > 0;
        int i = 0;
        int e = numbers.length-1;
        if (mirror){
            for(i = 0; i < numbers.length; i++){
                mirror = numbers[i] == numbers[e];
                e--;
                if (!mirror){break;}
            }
        }
        if(mirror){
            System.out.println("Mirror array.");
        } else {
            System.out.println("Not mirror array.");
        }
         */

        //Random tömb
        /*
        double d = Math.random();                           // 0.0 <= d && d < 1.0
        int r1 = (int) (Math.random() * 5);                  // 0 <= r1 && r1 < 5
        int r2 = (int) (Math.random() * 5 + 1);            // 1 <= r2 && r2 <= 5)
        int r3 = (int) (Math.random() * 101 + 100);    // 100 <= r3 && r3 <= 200

        int[] array = new int[100];
        int i = 0;
        for (i=0; i < array.length; i++){array[i] = i+1;}

        for ( i = 0; i < array.length; i++) {
            int ranInd = (int) (Math.random() * 99 + 0);;
            int temporary = array[ranInd];
            array[ranInd] = array[i];
            array[i] = temporary;
        }
        System.out.println(Arrays.toString(array));
        */

        /*       //Shuffle paranccsal:
        Integer[] intArray = new Integer[10];
        int i = 0;
        for (i=0; i < intArray.length; i++){intArray[i] = i+1;}
        List<Integer> intList = Arrays.asList(intArray);
        Collections.shuffle(intList);
        intList.toArray(intArray);
        System.out.println(Arrays.toString(intArray));
         */

        //Tömb számjegyei
        /*
        long[] numbers = {-1526446364, 1874047238, 1064541050, -815818089, 467498070, -1427103238, 1267273266, -1248819505, 839131004, -1313719080, 1545523494};
        long amount = 0;
        int i = 0;

        for (i= 0; i < numbers.length; i++){
            if (numbers[i] < 0) {numbers[i] *= -1;}
        }

        int[] counter = new int[10];

        for (i=0; i < numbers.length; i++) {
            if(numbers[i] == 0) {counter[0] += 1;}
            while (numbers[i] > 0) {
                amount = numbers[i] % 10;
                numbers[i] = numbers[i] / 10;
                counter[(int)(amount)] += 1;
                amount = 0;
            }
        }

        boolean counterAllNull = true;
        for (i=0; i < 10; i++){
            if(counter[i] == 1){
                counterAllNull = true;
            } else {
                counterAllNull = false;
                break;
            }
        }
        if (counterAllNull){
            System.out.println("Mindegyik számjegy egyszer szerepel.");
        }


        System.out.print("Egyszer sem szerepelnek: ");
        for (i=0; i < 10; i++){
            if (!counterAllNull && counter[i] == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("");

        for (i=0; i < 10; i++){
            if(!counterAllNull &&counter[i] != 0){
                System.out.println("A " + i + "-> " + counter[i] + "x szerepel.");
            }
        }
        */

        //Tízes számrendszerből kettesbe
        /*
        int decimal = 4242;
        int tempOne = 0;
        int tempTwo = 0;
        int tempThree = 0;
        ArrayList<Integer> binary = new ArrayList<>();
        int i = 0;

        for (tempThree = decimal; tempThree > 0; i++){
            if (tempThree > 0) {
                tempOne = tempThree % 2;        // 1   1   0   1
                tempThree /= 2;                 // 5   2   1   0
                binary.add(tempOne);            // 1 , 1 , 0 , 1
                tempOne = 0;
            } else if (tempThree == 0) {
                break;
            }
        }
        if (decimal == 0){
            System.out.println("Kettes számrendszerben: 0");
        } else if (decimal != 0) {
            System.out.print("Kettes számrendszerben:");
            Collections.reverse(binary);
            System.out.print(binary);
        }
        */

        //Kettes számrendszerből tízesbe
        /*
        long binary = 110010011;
        int i;
        int temp;
        int temp2 = (int) binary;
        ArrayList<Integer> decimal = new ArrayList<>();
        int amount = 0;

        for (i=1; i > 0; i++) {
            if (temp2 > 0) {
                temp = temp2 % 10;       // 0    0    0   1
                temp2 /= 10;             // 100  10   1   0
                decimal.add(temp);
            } else {
                break;
            }
        }

        int n = 1;
        for (i=0; i < decimal.size(); i++){
            temp = decimal.get(i) * n;
            amount += temp;
            n *= 2;
        }
        System.out.println(amount);
        */


        //-------------- EXTREME -------------------------------------

        String abc = "__|_A_B_C_D_E_F_G_H \n";
        String def = "_|_0_1_0_1_0_1_0_1 \n";
        String ghi = "_|_1_0_1_0_1_0_1_0 \n";




    }
}
