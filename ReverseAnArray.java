public class ReverseAnArray {

    static int[] arrayReverse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        //traversing original array in reverse direction
        for(int i = n-1; i>=0; i--){
            ans[j++] = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5};
        int[] ans = arrayReverse(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
