class Calculator {

    // Method 1: Adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers (different number of parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two double values (different parameter type)
    double add(double a, double b) {
        return a + b;
    }

    // Method 4: Adds int and double (different parameter type & sequence)
    double add(int a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));          // Calls Method 1
        System.out.println(calc.add(5, 10, 15));      // Calls Method 2
        System.out.println(calc.add(5.5, 6.5));       // Calls Method 3
        System.out.println(calc.add(5, 6.5));         // Calls Method 4
    }
}


