package c_01_recursion;

import java.util.Scanner;

public class TailRecursion {

    public void recurstionFn(int n){
        if (n>0){
           System.out.print(n);
           recurstionFn(n-1);
        }


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream

        int n = sc.nextInt();
        TailRecursion rec = new TailRecursion();
        rec.recurstionFn(n);


    }
}
