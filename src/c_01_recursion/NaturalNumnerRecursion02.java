package c_01_recursion;

import java.util.Scanner;

public class NaturalNumnerRecursion02 {
    static int  sum = 0; //0-1-2-3
    //This is Without recursion and formula is used
    public int recurstionFn(int n){
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream

        int n = 10; // sc.nextInt();
        NaturalNumnerRecursion02 rec = new NaturalNumnerRecursion02();
        int val = rec.recurstionFn(n);
        System.out.print(val);// 9NaturalNumnerRecursion03

    }
}
