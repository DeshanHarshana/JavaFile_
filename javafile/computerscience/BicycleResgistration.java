class BicycleResgistration{
	public static void main(String args[]){
		Bicycle bike1,bike2;
		String owner1, owner2, tagNo1, tagNo2;
		
		bike1=new Bicycle();
		bike1.setOwnerName("Deshan");
		bike1.setTagNo("2004-13RF");
		
		bike2=new Bicycle();
		bike2.setOwnerName("Harshana");
		bike2.setTagNo("2019-13RF");
		
		//Output the Information
		owner1=bike1.getOwnerName();
		owner2=bike2.getOwnerName();
		
		tagNo1=bike1.getTagNo();
		tagNo2=bike2.getTagNo();
		
		System.out.println("Owner One : " + owner1 + ", Tag Number One : " + tagNo1);
		System.out.println("Owner Two : " + owner2 + ", Tag Number Two : " + tagNo2);
		
		
	}
}