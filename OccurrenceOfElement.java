import java.util.Scanner;

public class OccurrenceOfElement {

    static int countOccurrence(int[] arr, int x){
        int count= 0;
        for (int j : arr) {
            if (j == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Element: ");
        int n = sc.nextInt();
        System.out.println("Enter "+ n + " element in the array");
        int[] arr = new int[5];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number  you want to count the occurrence: ");
        int x = sc.nextInt();
        System.out.println(countOccurrence(arr, x));
    }
}
