import java.util.Scanner;

public class LastOccurrenceOfElement {

    static int lastOccurrenceOfElement(int[] arr, int x){
        int lastIndex = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Element: ");
        int n = sc.nextInt();
        System.out.println("Enter "+ n + " element in the array");
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number  you want to count the occurrence: ");
        int x = sc.nextInt();
        System.out.println(lastOccurrenceOfElement(arr, x));
    }
}
