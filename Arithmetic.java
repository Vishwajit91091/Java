import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter a number :");
        Scanner obj =new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Addition :"+(a+b));
        System.out.println("Subtraction :"+(a-b));
        System.out.println("Division :"+(a/b));
        System.out.println("Modulation :"+(a%b));
    }
}
