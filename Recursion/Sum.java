public class Sum {
    public static void sumOfNumbers(int n, int i, int sum) {
        if(i==n){
            sum+=i;
            System.out.println("Sum of natural no.is"+sum);
            return;
        }
    sum+=i;
    sumOfNumbers(n,i+1,sum);
    }

    public static void main(String args[]) {
sumOfNumbers(10, 1, 0);
    }
}