import java.util.Scanner;
public class MakeTelevision {

	public static void main(String[] args) {
		Television tv1=new Television();
		Scanner s=new Scanner(System.in);

		System.out.println("Enter Television Barand Name : ");
		String brand=s.next();
		System.out.println("Enter Power State : ");
		boolean state=s.nextBoolean();
		System.out.println("Enter Screen Size : ");
		double size=s.nextDouble();
		System.out.println("Enter Channel Number : ");
		int number=s.nextInt();
		System.out.println("Enter Sound  : ");
		int sound=s.nextInt();

		tv1.setbrand(brand);
		tv1.setScreen(size);
		tv1.increaseSound(sound);
		tv1.setChannalNumber(number);
		tv1.setPowerState(state);

		System.out.println("Brand Name : "+ tv1.getBarndName());
		System.out.println("Power State : "+ tv1.getPowerstate());
		System.out.println("Screen Size : "+ tv1.getScreenSize());
		System.out.println("Channel Number : "+ tv1.getChannelNumber());
		System.out.println("Sound  : "+ tv1.getSound());


	}

}
