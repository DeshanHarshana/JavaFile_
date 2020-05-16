class Account{
	private String accountNo;
	private String Account_Holder_name;
	private String Account_Holder_Address;
	private String Account_Holder_ConD;
	private int Current_Balance;
	
	//Setter
	void setAccountNo(String accNo) {
		accountNo = accNo;
	}
	void setAccount_Holder_name(String account_H_name) {
		Account_Holder_name = account_H_name;
	}
	void setAccount_Holder_Address(String account_H_Address) {
		Account_Holder_Address = account_H_Address;
	}
	void setAccount_Holder_ConD(String account_H_ConD) {
		Account_Holder_ConD = account_H_ConD;
	}
	void setCurrent_Balance(int currentBalance) {
		Current_Balance = currentBalance;
	}
	

	//Getters
	
	String getAccountNo() {
		return accountNo;
	}
	String getAccount_Holder_name() {
		return Account_Holder_name;
	}
	String getAccount_Holder_Address() {
		return Account_Holder_Address;
	}
	String getAccount_Holder_ConD() {
		return Account_Holder_ConD;
	}
	int getCurrent_Balance() {
		return Current_Balance;
	}
	
	
}