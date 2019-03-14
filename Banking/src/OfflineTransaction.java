import java.util.Scanner;

public class OfflineTransaction extends Bank implements Transaction {
	
	 private long accountNumber;
	 Scanner s = new Scanner(System.in);
		

		public void setaccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}



		public long getaccountNumber() {
			return accountNumber;
		}
		
 public void  offlineVerification() {
	 
 
		if(getaccountNumber()==1234567890)
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
 
 public void  onlineVerification() {
	 System.out.println("\n");
 }

}
