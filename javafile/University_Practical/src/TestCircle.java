
public class TestCircle {

	public static void main(String[] args) {
		Circle c1=new Circle(2.4,"Green");
		System.out.println(c1.getColor());
		c1.setColor("Blue");
		c1.setRadius(5.4);
		System.out.println(c1.toString());  // explicit call
		System.out.println(c1);             // println() calls toString() implicitly, same as above
		System.out.println("Operator '+' invokes toString() too: " + c1);  // '+' invokes toString() too
	}

}
class Circle{
	
	private double Radius=1.0;
	private String Color="Red";
	
	public Circle() {
		
	}
	public Circle(double Radius) {
		this.Radius=Radius;
	}
	public Circle(double Radius, String Color) {
		this.Color=Color;
		this.Radius=Radius;
	}
	public String getColor() {
		return this.Color;
	}
	public void setRadius(double Radius) {
		this.Radius=Radius;
	}
	public void setColor(String Color) {
		this.Color=Color;
	}
	public String toString() {
		return "Circle[radius=" + Radius + " color=" + Color + "]";
	}
	public double getArea() {
		return Math.PI*(Radius*Radius);
	}
}