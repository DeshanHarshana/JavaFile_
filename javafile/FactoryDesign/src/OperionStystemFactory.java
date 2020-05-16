
public class OperionStystemFactory {
public OS getInstance(String str) {
	if(str.equals("Android")) {
		return new Android();
	}
	else if(str.equals("IOS")){
		return new IOS();
	}
	else if(str.equals("Symbian")) {
		return new Symbian();//short way of create obj in java=new classname(); this is not going heap memory
	}
	else 
		return new Windows();
	
}
}
//if one day someone add extra class he or she will have to change only this one.
//suporse someone add class called symbian.java the we have to change only 

//		else if(str.equals("Symbian")){
//		return new Symbian();
//		}
//
//client can't see other classes beacause client have to use only getInstance method
// getInstance duty is making object and pass them when we call it
//this is like a factory therefore we called it factory design pattern
