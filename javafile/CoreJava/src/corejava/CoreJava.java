
package corejava;


public class CoreJava {

    
    public static void main(String[] args) {
        Cat cat=new Cat();
        Animal animal=new Animal();
        Animal.w=34;
        
        int c=cat.miaw(50);
        
        
    }
    
}
class Animal {
    int age;
    String Name;
    static int w;
}
class Dog extends Animal{
    public void bark(){
        
    }
    int Stylr;
}
class Cat extends Animal{
    public int miaw(int data){
        data=data*5;
        return data;
    }
    int expect;
}