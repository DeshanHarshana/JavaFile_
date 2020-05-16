import java.util.regex.*;
public class switchseen {

	public static void main(String[] args) {
		boolean b1=Pattern.matches(".s", "ahs");  //.s mean contain only 2 letter and second letter must be s
		boolean b2=Pattern.matches("..s", "rhs");//..s mean contain only 3 letter and third letter must be s
		boolean b3=Pattern.matches("..s.", "rhs7");//..s. mean contain only 4 letter and third letter must be s
		System.out.println(b3);
		System.out.println("-------------------------------------------------------");
		//The . (dot) represents a single character.
		System.out.println(Pattern.matches("[amn]", "y"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (contain a or m or n)  
		System.out.println(Pattern.matches("[amn]", "aa"));//false (contain more than once)  
		System.out.println(Pattern.matches("[amn]", "amn"));//false (can only contain a or m or n. not all)  
		System.out.println(Pattern.matches("[a]", "a"));//true  
		System.out.println(Pattern.matches("[^amn]", "y"));//true (Any character except a or m or n)  
		System.out.println(Pattern.matches("[^amn]", "yh"));//false (Any character except a or m or n but only contain one letter) 
		System.out.println("-------------------------------------------------------");
		System.out.println(Pattern.matches(".[a-zA-Z]..", "7Q3r"));//true (second letter contain A-Z)
		System.out.println(Pattern.matches(".[a-d[m-p]]..", "7l3r"));//a through d, or m through p: [a-dm-p] (union)
		System.out.println(Pattern.matches(".[a-z&&[def]]..", "7d3r"));//must contain a-z and must be d or e or f
		System.out.println(Pattern.matches(".[a-z&&[^bc]]..", "7d3r"));//a through z, except for b and c: [ad-z] (subtraction)
		System.out.println(Pattern.matches(".[a-z&&[^m-p]]..", "7d3r"));//a through z, and not m through p: [a-lq-z](subtraction)
		System.out.println("-------------------------------------------------------");
	}
}