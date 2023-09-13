import java.util.Scanner;

public class SwapWithoutThirdVariable {

    static void swap(int a, int b){
        System.out.println("Original values before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        a = a + b;
        b = a - b;
        a = a - b;

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
