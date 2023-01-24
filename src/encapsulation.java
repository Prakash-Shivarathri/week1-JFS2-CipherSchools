public class encapsulation {
    private void name(){
     Amazon customer = new Amazon();
     float payableamount = customer.Transaction(1000);
     System.out.println("Total PayableAmount "+payableamount);
    }
}
class Amazon{
       float Transaction(float amt){
           Gpay gpayObj = new Gpay();
           float totalAmount = amt+(amt*gpayObj.txnCharge);
           return totalAmount;
       }
}
class Gpay{
   float txnCharge=0.5f;
}