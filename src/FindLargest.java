import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int fst=in.nextInt();
        int snd=in.nextInt();
        int trd=in.nextInt();
//        if(fst>snd && fst>trd){
//            System.out.println("the biggest number is "+ fst);
//        }
//        else if(snd>fst && snd>trd){
//            System.out.println("the biggest number is "+ snd);
//
//        }else{
//            System.out.println("the biggest number is "+ trd);
//        }
        int max=Math.max(trd,Math.max(fst,snd));
        System.out.println("the biggest number is "+ max);

    }
}
