import java.util.Scanner;

class OnlineTransaction extends Bank implements Transaction {
	
	 private String userName;
	private String password; 
	Scanner s = new Scanner(System.in);
	
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	public void onlineVerification() {
	if(getUserName()=="vijay"&&getPassword()=="password")
	{
		System.out.println("select number for transaction \n 1.withdrawal()\n 2.deposit()\n 3.showBalance()\n ");
		
		int selectmode;
		selectmode=s.nextInt();
		switch(selectmode)
		{
		case 1: super.withdrawal();
				break;
		case 2 : super.deposit();
				break;
		case 3 : super.showBalance();
					break;
		default : System.out.println("enter valid transaction type");
		
		}
	}
	}
	public void offlineVerification() {
		 System.out.println("it's online transaction");
	 }
	

}
