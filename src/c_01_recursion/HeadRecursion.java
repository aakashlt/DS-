package c_01_recursion;
import java.util.*;

public class HeadRecursion {

    public void recurstionFn(int n){
        if (n>0){
            recurstionFn(n-1);
            System.out.print(n);
        }


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream

        int n = sc.nextInt();
        HeadRecursion rec = new HeadRecursion();
        rec.recurstionFn(n);


    }
}
