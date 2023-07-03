public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        int sum = calculateSum(numbers);
        System.out.println("The sum of the array elements is: " + sum);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
