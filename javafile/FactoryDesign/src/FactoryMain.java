
public class FactoryMain {

	public static void main(String[] args) {
		OperionStystemFactory operionStystemFactory=new OperionStystemFactory();
	OS obj=operionStystemFactory.getInstance("Symbian ");
	obj.spec();
	}

}
// This is the client class. If we want to and some extra operation system we won't need to change this.
//we only have to change operationSystemFactory class only
//we called that class, object creation factory
//this is the main purpose of factory design pattern.
//client can't seen inside classes beacuse we call only getInstance method.



