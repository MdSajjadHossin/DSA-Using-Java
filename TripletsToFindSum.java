import java.util.Scanner;

public class TripletsToFindSum {

    static int tripletsSum(int[] arr, int x){
        int count = 0;
        for(int i= 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        System.out.println("Enter the target: "+n+" array element");
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum");
        int x = sc.nextInt();


        System.out.println(tripletsSum(arr, x));

    }
}
