package tk.cs.lr;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //public static final String FORMAT_STRING = "Output: %s ;";

    public static void main(String[] args) {
//        out();
//        scanner();
//        printAllTypes();
//        math();
//        cond();
//        loops();
//        arr();
        Fibonacci fibonacci = new Fibonacci();
        for(int i = 0; i < 8; i++)
        {
            System.out.println(fibonacci.getFibonacciNumbers(i) + " ");
        }
    }

//    private static void arr() {
//        int [] arr1 = new int[] {0,1,2};
//        int [][] arr2 = new int[][] {{0,1,2},{0,1,2}};
//        for(int r1:arr1){
//            System.out.println("r1 = " + r1);
//        }
//        for(int[] r2:arr2){
//            System.out.println("r2 = " + Arrays.stream(r2));
//        }
//    }
//
//    private static void loops() {
//        int j = 0;
//        for (int i = 0; i < 3; i++) {
//            System.out.print( i + " ");
//        }
//        System.out.println();
//        while (j < 3) {
//            System.out.print( j + " ");
//            j++;
//        }
//        System.out.println();
//        do {
//            System.out.print( j + " ");
//            j++;
//        } while (j < 3);
//    }
//
//    private static void cond() {
//        int a = 1, b = 2, c;
//        if (a > 0 && b < 10) {
//            System.out.println("The condition is true");
//        } else {
//            System.out.println("The condition is false");
//        }
//
//        c = a == 0 ? 0 : 100;
//        System.out.println("c = " + c);
////        a = 100;
//        switch (a) {
//            case 1:
//                System.out.println("a(1) = " + a);
//                break;
//            case 2:
//                System.out.println("a(2) = " + a);
//                break;
//            default:
//                System.out.println("a(default) = " + a);
//        }
//    }
//    private static void math() {
//        float s1 = 1f, s2 = 2f, res1, res2;
////        var1
//        res1 = s1 + s2;
//        res1 += 1;
////        var2
//        res1 = s1 / s2;
//        res2 = s1 % s2;
//        System.out.println("res1 = " + res1);
//        System.out.println("res2 = " + res2);
//    }
//    private static void scanner() {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        System.out.println("str = " + str);
//    }
//    private static void out() {
//        System.out.print("line ");
//        System.out.println("paragraph");
//        System.out.println(String.format(FORMAT_STRING, "Str1"));
//        System.out.println(String.format(FORMAT_STRING, "Str2"));
//    }
//    public static void printAllTypes() {
//        var CharMinValue = (Character) Character.MIN_VALUE;
//        var CharMaxValue = (Character) Character.MAX_VALUE;
//        var ByteMinValue = (Byte) Byte.MIN_VALUE;
//        var ByteMaxValue = (Byte) Byte.MAX_VALUE;
//        var ShortMinValue = (Short) Short.MIN_VALUE;
//        var ShortMaxValue = (Short) Short.MAX_VALUE;
//        var IntMinValue = (Integer) Integer.MIN_VALUE;
//        var IntMaxValue = (Integer) Integer.MAX_VALUE;
//        var LongMinValue = (Long) Long.MIN_VALUE;
//        var LongMaxValue = (Long) Long.MAX_VALUE;
//        var FloatMinValue = (Float) Float.MIN_VALUE;
//        var FloatMaxValue = (Float) Float.MAX_VALUE;
//        var DoubleMinValue = (Double) Double.MIN_VALUE;
//        var DoubleMaxValue = (Double) Double.MAX_VALUE;
//
//        System.out.println("Byte min value : " + ByteMinValue + " Byte max value : " + ByteMaxValue);
//        System.out.println("Short min value : " + ShortMinValue + " Short max value : " + ShortMaxValue);
//        System.out.println("Char min value : " + (int) CharMinValue + " Char max value : " + (int) CharMaxValue);
//        System.out.println("Int min value : " + IntMinValue + " Int max value : " + IntMaxValue);
//        System.out.println("Long min value : " + LongMinValue + " Long max value : " + LongMaxValue);
//        System.out.println("Float min value : " + FloatMinValue + " Float max value : " + FloatMaxValue);
//        System.out.println("Double min value : " + DoubleMinValue + " Double max value : " + DoubleMaxValue);
//    }
}
