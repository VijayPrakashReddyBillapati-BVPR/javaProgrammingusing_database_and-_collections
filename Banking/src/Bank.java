import java.util.Scanner;

public class Bank {
		String bankName;
		String ifscCode;
		String bankAddress;
		long balance;
		long amount;
		
		public void setBalance(long bal)
		{
			this.balance=bal;
		}
		
		public void setAmount(long amt)
		{
			this.amount=amt;
		}
		
		public long getBalance()
		{
			return balance;
		}
		
		public long getAmount()
		{
			return amount;
		}
		
		public void  displaybankDetails(String bankName , String ifscCode , String BankAddress)
		{
			this.bankName=bankName;
			this.ifscCode=ifscCode;
			this.bankAddress=BankAddress;
			System.out.println(bankName+"\n"+ifscCode+"\n"+bankAddress);
		}
		Scanner s = new Scanner(System.in);
		void deposit()
		{
			balance=balance+getAmount();
			System.out.println("after withdrawal() :-   "+ getBalance());
		}
		
		void withdrawal()
		{
			
			if(balance>=getAmount())
			{ 
				balance=balance- getAmount();
				System.out.println("after withdrawal() :-   "+ getBalance());
			}
			else
			{
				System.out.println("Less Balance..Transaction Failed..");
			}
		}
		
		public void showBalance() {
			System.out.println( getBalance());
		}

}
