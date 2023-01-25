public class constructor {

    //constructor

    //<identification>
    //1. same name as class name
    //1.2 no return type

    // <purpose>
    //1.1 it creates/intializes object in memory
    //1.2 you can use constructor block to initialize som default values.
    int employeeId;
    int salary;
    String department;
    constructor(int empId,int sal,String depart){
             employeeId =empId;
             salary=sal;
             department = depart;
    }

    public static void main(String[] args){
          constructor rahul = new constructor(101,3000,"Coding");
        constructor Grandhi = new constructor(102,4000,"Testing");


        System.out.println(rahul.employeeId);
          System.out.println(rahul.salary);
          System.out.println(rahul.department);
        System.out.println(Grandhi.employeeId);
        System.out.println(Grandhi.salary);
        System.out.println(Grandhi.department);


    }
}
