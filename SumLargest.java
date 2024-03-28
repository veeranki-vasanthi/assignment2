import java.util.Arrays;

public class SumLargest{
    public static void main(String[] args) {
        int[] values = {10, 51, 53, 39, 47, 44, 21};
        int sum = findSecondThirdLargestSum(values);
        System.out.println("Sorted array: " + Arrays.toString(values));
        System.out.println("Sum of the 2nd and 3rd largest numbers: " + sum);
    }
    
    public static int findSecondThirdLargestSum(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2] + arr[arr.length - 3];
    }
}