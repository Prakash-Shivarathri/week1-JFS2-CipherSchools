import java.util.Random;
public class Test2 {
    //Objective : Generate Random number
    //package : java.util
    //class : Random
    //Method : nextInt(limit) : generate random number 0 to limit
    public static void main(String[] args){
        Random rnd = new Random();
           int computerchoice = rnd.nextInt(20);
           System.out.println("Computer choice : "+ computerchoice);
    }
}
