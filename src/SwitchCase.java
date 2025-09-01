import java.util.Objects;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String fruit =in.next();
        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "orange" -> System.out.println("round Fruit");
            case "Grapes" -> System.out.println("tangy fruit");
            default -> System.out.println("give input correctly");
        }
    }
}
