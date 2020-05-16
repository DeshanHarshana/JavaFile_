import java.util.Arrays;

public class q5 {

	public static void main(String[] args) 
	{ 
	    String s1 = "abcd"; 
	    String s2 = "cdab"; 
	  
	    int size = s2.length(); 
	  
	    Second second=new Second();
	    if (second.isAnagram(s1, s2)) 
	        System.out.println(second.CountSteps(s1.toCharArray(), s2.toCharArray(), size)); 
	    else
	        System.out.println(-1); 
	} 
} 
		class Second  
		{ 
		  
		
		static boolean isAnagram(String s1, String s2) 
		{ 
		    s1 = sortString(s1); 
		    s2 = sortString(s2); 
		    return (s1.equals(s2)); 
		} 
		
		public static String sortString(String inputString)  
		{  
		    
		    char tempArray[] = inputString.toCharArray();  
		      
		    
		    Arrays.sort(tempArray);  
		      
		    
		    return new String(tempArray);  
		}  
		  
		
		static int CountSteps(char []s1, char[] s2, int size) 
		{ 
		    int i = 0, j = 0; 
		    int result = 0; 
		  
		    
		    while (i < size) 
		    { 
		        j = i; 
		  
		        while (s1[j] != s2[i]) 
		        { 
		            j += 1; 
		        } 
		  
		        
		        while (i < j) 
		        { 
		  
		           
		            char temp = s1[j]; 
		            s1[j] = s1[j - 1]; 
		            s1[j - 1] = temp; 
		            j -= 1; 
		            result += 1; 
		        } 
		        i += 1; 
		    } 
		    return result; 
		} 
		  
		}