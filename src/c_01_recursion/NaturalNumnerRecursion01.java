package c_01_recursion;

import java.util.Scanner;

public class NaturalNumnerRecursion01 {
    static int  x = 0; //0-1-2-3
    //This is Without recursion and formula is used
    public int recurstionFn(int n){
         if (n==0) {
             return 0;
         }
         else {
             return n*(n+1)/2;
         }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream

        int n = 10; // sc.nextInt();
        NaturalNumnerRecursion01 rec = new NaturalNumnerRecursion01();
        int val = rec.recurstionFn(n);
        System.out.print(val);// 9NaturalNumnerRecursion03

    }
}
