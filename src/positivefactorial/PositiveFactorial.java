package positivefactorial;

import java.util.Scanner;

public class PositiveFactorial {

    public static void main(String[] args) {
    int n;
        int a = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("The numbers start at : ");
        n = s.nextInt();
        int b = n;
        int sum = n;

        for (int i = n; i >= 2; n--) {
            for (int j = n - 1; j > 1; j--) {

                sum = sum + b;

                a = sum;
            }
            b = a;
            if (n <= 0) {
                System.out.println("Factorial = " + b);
                return;
            }
        }
    }
    
}
