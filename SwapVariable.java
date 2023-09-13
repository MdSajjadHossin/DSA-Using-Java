import java.util.Scanner;

public class SwapVariable {

    static void swap(int a, int b){
        System.out.println("Original values before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Values after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a & b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        swap(a, b);
    }
}
