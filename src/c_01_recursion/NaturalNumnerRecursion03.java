package c_01_recursion;

import java.util.Scanner;

public class NaturalNumnerRecursion03 {
    static int  x = 0; //0-1-2-3
    public int recurstionFn(int n){
         if (n==0) {
             return 0;
         }
         else {
             return recurstionFn(n - 1) + n;
         }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream

        int n = 10; // sc.nextInt();
        NaturalNumnerRecursion03 rec = new NaturalNumnerRecursion03();
        int val = rec.recurstionFn(n);
        System.out.print(val);// 9NaturalNumnerRecursion03

    }
}
