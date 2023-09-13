import java.util.Scanner;

public class ArrayRotation {

    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        int[] ans = new int[n];
        int j = 0;

        //first part of rotation
        for(int i = n-k; i<n; i++){
            ans[j++] = arr[i];
        }

        for(int  i = 0; i<n-k; i++){
            ans[j++] = arr[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element Number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" element in the array");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Rotation number: ");
        int k = sc.nextInt();
        int[] ans = rotate(arr, k);
        System.out.println("Result after rotation");
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }


}
