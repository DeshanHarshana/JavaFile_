import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import javax.sound.midi.Soundbank;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class q4 {

	public static void main(String[] args) throws IOException, ParseException {
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        String NICNum = bufferedReader.readLine();
	        boolean b=false;
	        bufferedReader.close();
	        if(NICNum.length()>10) {
	        	b=true;
	        }
	       NIC_Details N = new NIC_Details(NICNum,b);
	       
	       
	       String input_date=N.setMonth() +"/" + N.getYear();
	       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH);
	       Date myDate = sdf.parse(input_date);
	       sdf.applyPattern("EEE, d MMM yyyy");
	       String sMyDate = sdf.format(myDate);
	       String date="";
	       if(sMyDate.substring(0,3).equals("Wed")) {
	    	   date="Wednesday";
	    	   
	       }
	       else if (sMyDate.substring(0,3).equals("Fri")) {
	    	   date="Friday";
	       }
	       else if (sMyDate.substring(0,3).equals("Sat")) {
	    	   date="Saturday";
	       }
	       else if (sMyDate.substring(0,3).equals("Sun")) {
	    	   date="Sunday";
	       }
	       else if (sMyDate.substring(0,3).equals("Mon")) {
	    	   date="Monday";
	       }
	       else if (sMyDate.substring(0,3).equals("Tue")) {
	    	   date="Tuesday";
	       }
	       else if (sMyDate.substring(0,3).equals("Thu")) {
	    	   date="Thursday";
	    }
	       System.out.println(input_date + " " + date);
	        
	        
	}
}



class NIC_Details {

    String id;
    boolean b=false;
    int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public NIC_Details(String num,boolean b) {
        this.b=b;
        id = num;
    }

    public int getYear() {
    	if(b) {
    		return (2000 + Integer.parseInt(id.substring(2, 4)));
    	}
    	else {
            return (1900 + Integer.parseInt(id.substring(0, 2)));
    	}
    }

    public int getDays() {
    	int d=0;
    	if(b) {
    		d = Integer.parseInt(id.substring(4, 7));
    	}
    	else {
         d = Integer.parseInt(id.substring(2, 5));
    	}
        if (d > 500) {
            return (d - 500);
        } else {
            return d;
        }
    }

    public String setMonth() {
        int mo = 0, da = 0;
        int days = getDays();

        for (int i = 0; i < month.length; i++) {
            if (days < month[i]) {
                mo = i + 1;
                da = days;
                break;
            } else {
                days = days - month[i];
            }
        }
        String date="";
        String month="";
        if(da<10) {
        	date="0"+String.valueOf(da);
        }
        else {
        	date=String.valueOf(da);
        }
        if(mo<10) {
        	month="0"+String.valueOf(mo);
        }
        else {
        	month=String.valueOf(mo);
        }
        
        return date+"/"+month;

    }

    
}