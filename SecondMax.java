import java.util.Scanner;

public class SecondMax {

    static int maxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
                if (arr[i] > max) {
                    max = arr[i];
                }
        }
        return max;
    }

    static int findSecondMax(int[] arr){
        int mx = maxValue(arr);

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = maxValue(arr);

        return secondMax;
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

        System.out.println(findSecondMax(arr));
    }
}
