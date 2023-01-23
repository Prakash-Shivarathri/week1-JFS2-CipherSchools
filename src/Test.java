import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        if(num>0) {
            System.out.println("Given number is positive : "+num);
        }else if(num==0) {
            System.out.println("Given number is Zero : "+num);
        }else {
            System.out.println("Given number is negative : "+num);
        }
    }
}
