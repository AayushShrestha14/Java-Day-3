package org.example;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c=8;

        // Bitwise XOR
        // 0101 ^ 0111 = 0010
        //System.out.println("a^c = " + (a^b));

        //Bitwise NOT
        //~00000000 00000000 00000000 00000101 = 11111111 11111111 11111111 11111010
        //will give 2's 32 bit comp
        //System.out.println("~a = " + (~a));


        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a =a&b
        // a =a|b
        //a |= b;
        //System.out.println("a|=b = " + a);

        //if-else ladder
        if (a == 12) {
            System.out.println("a is 12");
        } else if (a == 13) {
            System.out.println("a is 13");
        } else if (a == 15) {
            System.out.println("a is 15");
        } else {
            System.out.println("a is not 12, 13 or 15");
        }


        //nested if-else
        if (a == 5) {
            if (b == 7) {
                System.out.println("a is 5 and b is 7");
            } else {
                System.out.println("a is 5 and b is not 7");
            }
        }

        switch (a) {
            case 5:
                System.out.println("a is 5");
                break;
            case 6:
                System.out.println("a is 6");
                break;
            case 7:
                System.out.println("a is 7");
                break;
            default:
                System.out.println("a is not 5, 6 or 7");
        }


        //widening casting
        double doubleA = a; //Automatic casting: int to double

        System.out.println(a);
        System.out.println(doubleA);


        //narrowing casting
        double doubleB = 5.99;
        int intB = (int) doubleB; //Manual casting: double to int
        System.out.println(doubleB);
        System.out.println(intB);


        //Parsing Strings to Numbers Integer.parseInt()
        String str = "123";
        Integer num = Integer.parseInt(str);
        System.out.println(num);
        System.out.println(num instanceof Integer);


        //Parsing Numbers to Strings Integer.toString
        int num1 = 456;
        String str1 = Integer.toString(num1);
        System.out.println(str1);
        System.out.println(str1 instanceof String);

        String str1 = String.valueOf(num1);
        System.out.println(str1);
        System.out.println(str1 instanceof String);
    }
}
