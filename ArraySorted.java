import java.util.Scanner;

public class ArraySorted {

    static boolean sorted(int[] arr){
        boolean isSorted = true;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sorted(arr));
    }
}
