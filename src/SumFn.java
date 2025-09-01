import java.util.Scanner;

public class SumFn {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y= in.nextInt();
        sum(x,y);
        String greeting = greet();
        System.out.println(greeting);

    }

    private static String greet() {

        return "hi,how are you";
    }

    static void sum(int a, int b){
        int c=a+b;
        System.out.println("Sum is "+c);
    }
}
