import java.util.*;

public class day1 {

    public static int sumOfOdd(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {

            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String args[]) {

        int result = sumOfOdd(1, 100);
        System.out.println("Sum of 1 to 100 odd no is: " + result);// Sum of 1 to 100 odd no is: 2500
        System.out.println("hello");
    }
}