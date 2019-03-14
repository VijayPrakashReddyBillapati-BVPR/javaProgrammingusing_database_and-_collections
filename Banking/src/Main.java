
public class Main {

	public static void main(String[] args) {
		OnlineTransaction online= new OnlineTransaction();
		OfflineTransaction offline = new OfflineTransaction();
		Bank bank = new Bank();
		System.out.println("BANK CLASS \n");
		bank.displaybankDetails("SBI", "SBIN0020094","HYDERABAD");
		bank.setBalance(963258);
		System.out.println("Balance = "+bank.getBalance());
		bank.setAmount(9632);
		System.out.println("amount for transaction = "+bank.getAmount());
		System.out.println("\n");
		
		System.out.println("OfflineTransaction \n");
		offline.setaccountNumber(1234567890);
		offline.offlineVerification();
		System.out.println("\n");
		System.out.println("========================================================================================================");
		
		
		System.out.println("OnlineTransaction \n");
		online.setPassword("password");
		online.setUserName("vijay");
		online.onlineVerification();

	}

}
