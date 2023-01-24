import java.util.Scanner;
public class Test5 {
    public static void main(String[] args){

        //Title: How long is your Burrrp?

        //aAsh the user to enter an Integer (burp Length)

        //Depending on the input Provid 'Burp' will be produced.

        //For example:
        // 5 : Burrrrrp;

        // Input can be any Random Number...

        Scanner sc = new Scanner(System.in);
        System.out.println("How long is your burp");
        int burpLength = sc.nextInt();
        String msg="";
        for(int i=1; i<=burpLength;i++){
            msg+="r";
        }
        System.out.println("Bu"+msg+"p");



    }
}
