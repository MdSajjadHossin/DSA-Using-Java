import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastIndexOfArray {

    static int[] checkIndex(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int ans[] = checkIndex(arr);

        System.out.println("smallest = "+ ans[0]);
        System.out.println("largest = "+ ans[1]);
    }
}
