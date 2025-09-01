import java.util.Scanner;

public class CountOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
//        int t=0;
//        int s=0;
//        while(n>0){
//            int l=n%10;
//             n=n/10;
//             t=t+1;
//             s=s+l;
//        }
//        System.out.println("count is "+t);
//        System.out.println("sum of the digit is "+ s);

//    }
        int ans = 0;

        while (n > 0) {
            int l = n % 10;
            n /= 10;
             ans = ans * 10 + l;

        }
        System.out.println("the reverse of the number is " + ans);
    }
}
