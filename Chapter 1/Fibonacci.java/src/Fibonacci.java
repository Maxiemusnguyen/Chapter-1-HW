public class Fibonacci {
    public static void main(String[] args) {
        int[] fibonacciNumbers = {1, 1, 2, 3, 5, 8, 13, 21};

        int sum = 0;
        for (int num : fibonacciNumbers) {
            sum += num;
        }

        System.out.println("The result of the sum is: " + sum);
    }
}
