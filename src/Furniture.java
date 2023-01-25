// Inheritance.....

public class Furniture {
    int width;
    int height;
    void display(String item){
        System.out.println(item+" Width"+width+" Height "+height);
    }
    public static void main(String[] args){
        Table neelkamal = new Table();
        neelkamal.foo();
    }

}
class chair extends Furniture{
   void foo(){
       width=10;
       height=20;
       display("chair");
   }
}
class Table extends  Furniture{
    void foo(){
        width=30;
        height=50;
        display("Table");
    }
}
class almira extends Furniture{
    void foo(){
        width=100;
        height=200;
        display("almira");
    }
}
