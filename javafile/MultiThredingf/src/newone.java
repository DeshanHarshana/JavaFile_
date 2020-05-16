
class Overridye {
    //purposee of override is if we need something change in past subclasses we have to use it
    //weshould use
        public static void main(String[] args) {
            Monky obj;
            
            //we can call only monkry class method
            obj=new Monky();
            System.out.println(obj.hashCode());
            obj.climb();
            obj.eat();
            
            obj=new Human();
            System.out.println(obj.hashCode());
            obj.climb();//override monkey climb
            obj.eat();//override monkey eat
            //obj.think() we can't get it because it is not override method
            //if we want to get it we have to Human obj=new Human();
            // obj.think();
            
            Human obj2=new Human();
            obj2.think();
            
            Human h1=new Human();
            Monky m1=(Monky)h1;
            m1.climb();
            
        }
    
    }
    
    class Monky{
        public void climb() {
            System.out.println("Monky climb...");
        }
        public void eat() {
            System.out.println("Monky eat...");
        }
    }
    class Human extends Monky{
        
        public void climb() {
            System.out.println("Man climb...");
        }
        
        public void eat() {
            System.out.println("Man eat...");
        }
        public void think() {
            System.out.println("Man think...");
        }
    
    }
    