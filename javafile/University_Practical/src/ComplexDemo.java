
class Complex{
	private double realPart;
	private double imaginaryPart;
	
	public Complex (){
		realPart=0;
		imaginaryPart=0;
	}
	public Complex(double realPrt, double imaginaryPrt){
		realPart=realPrt;
		imaginaryPart=imaginaryPrt;
	}
	
	public Complex add(Complex otherNumber){
		Complex com=new Complex();
		com.setRealPart(realPart+otherNumber.getRealPart());
		com.setImaginaryPart(imaginaryPart+otherNumber.getImaginaryPart());
		return com;
	}
	
	public Complex subtract(Complex otherNumber){
		Complex com=new Complex();
		com.setRealPart(realPart-otherNumber.getRealPart());
		com.setImaginaryPart(imaginaryPart-otherNumber.getImaginaryPart());
		return com;
	}
	
	public Complex multiply(Complex otherNumber){
		Complex com=new Complex();
		com.setRealPart((realPart*otherNumber.getRealPart())-(imaginaryPart*otherNumber.getImaginaryPart()));
		com.setImaginaryPart((realPart*otherNumber.getImaginaryPart())+(imaginaryPart*otherNumber.getRealPart()));
		return com;
	}
	
	public Complex divide(Complex otherNumber){
		Complex com=new Complex();
		
		
		com.setRealPart(((realPart*otherNumber.getRealPart()+imaginaryPart*otherNumber.getImaginaryPart())-(realPart*otherNumber.getImaginaryPart()-imaginaryPart*otherNumber.getImaginaryPart()*(-1)))/(otherNumber.getRealPart()*otherNumber.getRealPart()+otherNumber.getImaginaryPart()*otherNumber.getImaginaryPart()));
		com.setImaginaryPart((realPart/otherNumber.getImaginaryPart())+(imaginaryPart/otherNumber.getRealPart()));
		return com;
	}
	
	//getter setter
	
	public double getRealPart(){
		return realPart;
	}
	public double getImaginaryPart(){
		return imaginaryPart;
	}
	public void setRealPart (double realPrt){
		realPart=realPrt;
	}
	public void setImaginaryPart (double imaginaryPrt){
		imaginaryPart=imaginaryPrt;
	}
}
class ComplexDemo{
	public static void main(String ar[]){
		Complex c1=new Complex(2,5);
		Complex c2=new Complex(4,6);
		Complex c3=new Complex();
		Complex c4=new Complex();
		Complex c5=new Complex();
		Complex c6=new Complex();
		c3=c1.add(c2);
		c4=c1.subtract(c2);
		c5=c1.multiply(c2);
		c6=c1.divide(c2);
	System.out.println("First complex number realPart : " + c1.getRealPart() + " and imaginaryPart is : " + c1.getImaginaryPart());

	System.out.println("Second complex number realPart : " + c2.getRealPart() + " and imaginaryPart is : " + c2.getImaginaryPart());
	
	System.out.println("======================================================");

	System.out.println("Addition of first complex number realPart and second Complex number realPart: " + c3.getRealPart() + " and Addition of first complex number imaginaryPart and second Complex number imaginaryPart : " + c3.getImaginaryPart() + "\n");
	
	System.out.println("difference of first complex number realPart and second Complex number realPart: " + c4.getRealPart() + " and difference of first complex number imaginaryPart and second Complex number imaginaryPart : " + c4.getImaginaryPart()+ "\n");
	
	System.out.println("product  of first complex number realPart and second Complex number realPart: " + c5.getRealPart() + " and product  of first complex number imaginaryPart and second Complex number imaginaryPart : " + c5.getImaginaryPart() + "\n");
	
	System.out.println("division  of first complex number realPart and second Complex number realPart: " + c6.getRealPart() + " and division  of first complex number imaginaryPart and second Complex number imaginaryPart : " + c6.getImaginaryPart() + "\n");
		
		
	}
}
