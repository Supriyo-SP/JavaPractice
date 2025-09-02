package methods;

import java.util.Scanner;

public class FiboMethod {
    static int[] getFibo(int n){
        int[] a=new int[n];
        int first=-1;
        int second=1;
        for (int i = 0; i < a.length; i++) {
            int c=first+second;
            a[i]=c;
            first=second;
            second=c;
        }
        return a;
    }
   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int[] arr= getFibo(n);
       for (int j : arr) {
           System.out.println(j +" ");

       }
    }
}
