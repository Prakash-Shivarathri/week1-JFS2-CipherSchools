// Dynamic Polymorphism : Overriding

import java.awt.desktop.SystemEventListener;

abstract  class Doctor{
    abstract void treatPatient();
}
class Physician extends Doctor{
    @Override
    void treatPatient(){
        System.out.println("Hi!I am Physician");
    }
}
class Surgeon extends  Doctor{
    void treatPatient(){
        System.out.println("Hi! I am Surgeon");
    }
}
class Dentist extends  Doctor{
    void treatPatient(){
        System.out.println("Hi! I am Dentist");
    }
}
public class dynapoly {
    public static void main(String[] args){
        System.out.println("Hi I am lucky Receptionist at max care");
        System.out.println("Who you are looking for ?");
        System.out.println("Press 1. Physician\n2. Surgeon \n3. Dentist");
   Doctor doc=null;
   // Polymorphism is the ability/implementation of base class object i.e Doctor's doc to get intialized/change form using any of the derived class i.e physican/surgeon/dentist
        int choice = new java.util.Scanner(System.in).nextInt();
        switch(choice){
            case 1:
                doc = new Physician();
                break;
            case 2:
                doc = new Surgeon();
                break;
            case 3:
                doc = new Dentist();
                break;
            default:
                System.out.println("A oh! Invalid Choice");
                break;
        }
        if(choice < 0 || choice > 3){
            System.exit(0);
        }else {
            doc.treatPatient();
        }
    }
}
