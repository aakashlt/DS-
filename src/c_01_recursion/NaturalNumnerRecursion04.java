package c_01_recursion;

import java.util.Scanner;

public class NaturalNumnerRecursion04 {
    static int  sum = 0; //0-1-2-3
    public int recurstionFn(int n){
         if (n>0) {
             sum=sum+n;
             return recurstionFn(n - 1);
         }
         return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream

        int n = 10; // sc.nextInt();
        NaturalNumnerRecursion04 rec = new NaturalNumnerRecursion04();
        int val = rec.recurstionFn(n);
        System.out.print(val);// 9NaturalNumnerRecursion03

    }
}
