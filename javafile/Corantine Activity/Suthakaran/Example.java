
public class Example {
	public static void sumDisplay(int num) {
        int sum = (num/2)*(2*1+(num-1)*1);
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i < num+1; i++) {
            
            if(i<num) {
               sb = sb.append(i + "+");
            }

        }
        sb.append(num);
        System.out.print(sb.toString()+"="+sum);

    }
	public static void main(String[] args) {
		sumDisplay(10);
	}
}