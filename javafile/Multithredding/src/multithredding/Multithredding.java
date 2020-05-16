
package multithredding;

public class Multithredding {

    public static void main(String[] args) throws InterruptedException {
        
        
        
        Thread t1=new Thread(() ->{
                    for(int i=0;i<10;i++){
        
                    System.out.println("One");
                    try{Thread.sleep(500);} catch(Exception e){}
    }
     });
        Thread t2=new Thread(() ->{
                    for(int i=0;i<10;i++){
        
                    System.out.println("Two");
                    try{Thread.sleep(500);} catch(Exception e){}
    }
     });
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
         System.out.println("bye");
        
        
    }
}
    

