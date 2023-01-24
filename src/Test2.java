import java.util.Random;
import java.util.Scanner;

public class Test2 {
    //Objective : Generate Random number
    //package : java.util
    //class : Random
    //Method : nextInt(limit) : generate random number 0 to limit
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
           int computerchoice = rnd.nextInt(20);
           System.out.println("Computer choice : "+ computerchoice);
           //Guss the number
      for(int i=1;i<=6;i++) {
          System.out.println("Guss a number between 0 to 20 ");
          int userChoice = sc.nextInt();
          if (userChoice > computerchoice) {
              System.out.println("Your Guss is Too High ");
          } else if (userChoice < computerchoice) {
              System.out.println("Your Guss is Too Low ");
          } else {
              System.out.println("Gotcha! Your Gussed it Right!!");
              break;
          }
      }
    }
}
