package c_01_recursion;

import java.util.Scanner;

public class StaticGlobal {
    static int  x = 0; //0-1-2-3
    public int recurstionFn(int n){
         if (n>0) {
             x++;
             return recurstionFn(n - 1) + x;
         }
         return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream

        int n = 3; // sc.nextInt();
        StaticGlobal rec = new StaticGlobal();
        int val = rec.recurstionFn(n);
        System.out.print(val);// 9

    }
}
