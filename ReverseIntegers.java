/*
Braulio Carrion
Ms. Krasteva
04/15/19
This program run a method that reverses the order of the number passed in the
parameters. The method takes the remainder and prints it. Then it divides by 10
to remove it when the method is called again.
*/
import java.util.*;

public class ReverseIntegers {
    int newNum = 0;
    public void revDigits(int num) {
        System.out.print(num % 10);
        if ((num / 10) != 0) {
            revDigits(num / 10);
        }
    }

    public static void main(String[] args) {
        ReverseIntegers ri = new ReverseIntegers();
        System.out.print("Reversed Digits: ");
        ri.revDigits(123456789);
    }
}
