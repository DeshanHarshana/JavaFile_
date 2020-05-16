class MakeAccount{
	public static void main(String args[]){
		Account Holder;
		String accNo, accHolder, accHolderAdd, accHolderContact;
		int CurrentBalance;
		Holder=new Account();
		//Setting Values
		
		Holder.setAccountNo("4566756");
		Holder.setAccount_Holder_name("Deshan");
		Holder.setAccount_Holder_Address("Penalikadawara, Moragane");
		Holder.setAccount_Holder_ConD("0775058313");
		Holder.setCurrent_Balance(4500);
		
		//Getting Values
		
		accNo=Holder.getAccountNo();
		accHolder=Holder.getAccount_Holder_name();
		accHolderAdd=Holder.getAccount_Holder_Address();
		accHolderContact=Holder.getAccount_Holder_ConD();
		CurrentBalance=Holder.getCurrent_Balance();
		
		
		System.out.println("\n Account Number : " + accNo + "\n Account Holder Name : " + accHolder + "\n Account Holder Address : " + accHolderAdd + "\nAccount Holder Contact : " + accHolderContact + "\nCurrent Balance : " + CurrentBalance);
		
	}
}