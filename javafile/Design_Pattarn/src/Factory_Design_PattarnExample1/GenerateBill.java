
package Factory_Design_PattarnExample1;


public class GenerateBill {

   
    public static void main(String[] args) {
        GetPlanFactory planFactory=new GetPlanFactory();
        //Assign Plan object to p
        Plan p=planFactory.getPlan("INSTITUTIONALPLAN");
        p.getRate();
        p.calculateBill(45);
    }
    
}
