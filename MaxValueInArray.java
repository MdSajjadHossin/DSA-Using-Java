import java.util.Scanner;

public class MaxValueInArray {

    static int maxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" element in array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxValue(arr));
    }
}
