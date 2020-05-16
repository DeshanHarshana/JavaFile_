
package Singleton;
//Singleton mean is one. We can only create one instance using class

public class Singleton {

    public static void main(String[] args) {
      // Abc obj1=new Abc();
      // Abc obj2=new Abc();
      
      //obj1 has diffrent value and obj2 has diffrent value. But we want to create only one instance
      
      
      
      
      Abc obj1=Abc.getInstance();
      
    }
    
}

class Abc{
    static Abc obj=new Abc();
    private Abc(){}
    
    public static Abc getInstance(){
        return obj;
    }
}
//Do following procuder to make singleton class
//1. Create static obj. return type must be class name;
//2.put constructor to private
// create public static method for get instance