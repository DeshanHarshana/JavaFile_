
package computerscience_examples;


public class Star_Pattern {

    public static void main(String[] args) {
      Star_Pattern st=new Star_Pattern();
      st.Rectangle();
    }
    public void Rectangle(){
        int i,j;
        for(i=0; i<5; i++){
            for(j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
            
            /*
            
            *****
            *****
            *****
            *****
            *****
            */
        }
    }
    
    
}


