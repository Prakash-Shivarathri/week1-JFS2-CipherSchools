// Polymorphism
// an ability of an object to take many form.
// Static : Overloading(Function)
// Dynamic : Overiding(Function)
public class Poly {
       // Function overloading ; defining multiple functiona with same name with different paramenters.
       // // add is existing in multiple forms(using the parameters)

         void add(int num1, int num2){
             System.out.println(num1+num2);
         }
         void add(int num1,int num2,int num3){
             System.out.println(num1+num2+num3);
         }
         void add(float num1, float num2){
              System.out.println(num1+num2);
         }
         void add(int num1, float num2){
             System.out.println(num1+num2);
        }
        void add(float num1, int num2){
              System.out.println(num1+num2);
        }
        // rules :

       // 9/12 no of parameters must be the different..
       // 9/15 no of parameters are same but it is valid because type is diferent
       // 18/21 no fo parameters are same and type are also almost same. it's sequence /order of datatype


    public static void main(String[] args){
             Poly p= new Poly();
             p.add(12.2f,300);
    }



}
