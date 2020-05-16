
public class School {

	public static void main(String[] args) {
		AssignmentWork aWork=new AssignmentWork();
		
		Pen p=new PenAdaptoar();
		aWork.setPen(p);
		aWork.writeAssignment("Deshan Harshana");

	}

}
/*
 * We need to write Assignment adding "Deshan Harshana"
 * we pass "Deshan Harshana" to writeAssignment method
 * writeAssignment method want pen object for call write method. therefore we have to make private Pen p object. Pen is interface and we have to make setters to define a value to p object
 * interface can't create object Pen p=new Pen(); but we can create object using subclass. it is the way we have to call interface objects.
 * we have to use various pen. But setPen setter accept only p objects. eligible way is use any pen class we have to make a PenAdapter class
 * PenAdaptor class implement Pen Interface then PenAdaptor class has write method. 
 * penAdaptor class duty is making Marker or Pilot pen object and pass "Deshan Harshana " to it
 * then that classes do their work.
 * this is the purpose of adaptor design pattern 
*/
  
