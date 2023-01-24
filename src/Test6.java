import java.util.*;
public class Test6 {
    public static void main(String[] args){
        //Assuming you are riding a bike and police officer stops you
        // Police officer asking you to provid 2 details
        // if it is you birthday today?

        // The Police officer will calculate find based on follwing parameters
        // If it is your Birthday your will be waived off (excmpted) with
        //5mile/Hour

        // if it not your birthday no exemption will be given

        //if your speed is greater than 80 Ticket raised willl be 'High Ticket'
        //if your speed is between 60 and 80 Ticket raised will be 'Mid Ticket'
        //if your speed is below 60 Ticket raised will be low Ticket.

        //Find the Ticket!!

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Speed");
        int speed=sc.nextInt();

        System.out.println("To is Your Birthday ? ");
        boolean isbirthday=sc.nextBoolean();

        if(isbirthday==true){
            speed-=5;
        }
        if(speed>80){
            System.out.println("High Ticket");
        }else if(speed<=80 && speed>=60){
            System.out.println("Mid Ticket");
        }else{
            System.out.println("No Ticket");
        }
    }
}
