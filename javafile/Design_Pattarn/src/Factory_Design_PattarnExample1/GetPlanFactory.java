/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Design_PattarnExample1;

/**
 *
 * @author Deshan
 */
public class GetPlanFactory {
    public Plan getPlan(String planname){
        if(planname==null){
            return null;
        }
        if(planname.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomasticPlan();
        }
        
        if(planname.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        
        if(planname.equalsIgnoreCase("INSTITUTIONALPLAN")){
            return new InstitutionalPlan();
        }
        
        return null; 
    }
}
