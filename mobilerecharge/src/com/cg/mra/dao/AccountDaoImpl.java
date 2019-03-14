package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mra.beans.Account;
import com.cg.mra.ui.MainUI;

public class AccountDaoImpl implements AccountDao {
	Map<String , Account> accountEntry;
	MainUI m = new MainUI();
	public AccountDaoImpl()
	{
		accountEntry=new HashMap<>();
		accountEntry.put("9010210131" , new Account("prepaid " , "vaishali", 200));
		accountEntry.put("9823920123" , new Account("prepaid " , "meghana", 453));
		accountEntry.put("9932012345" , new Account("prepaid " , "vikas", 631));
		accountEntry.put("9010210131" , new Account("prepaid " , "anju", 521));
		accountEntry.put("9010210131" , new Account("prepaid " , "tushar", 632));
	}

	@Override
	public Account getAccountDetails(String mobileNumber) {
		Account a = null;
		 if(mobileNumber.length()==10) {
			 
		 
		            // Check if this key is the required key 
		            if (accountEntry.containsKey(mobileNumber)) { 
		  
		            a= accountEntry.get(mobileNumber);
		          System.out.println(a.getAccountBalance());
		            }
		            else {
		            	System.out.println("ERROR: Cannot recharge account as given no does exists");
		            }
		            m.options();
		 } else
			m.options();
			return a;
	}

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		Account a= null;
		if(mobileNo.length()==10) {
			
		
		 if (accountEntry.containsKey(mobileNo)) {
			a =accountEntry.get(mobileNo);
			 double r=a.getAccountBalance()+rechargeAmount;
			 System.out.println("current balance is"+r);
			 a.setAccountBalance(r);
			m.options();
		 }
		 else {
			 System.out.println("cannot recharge account as given mobile no does not exsist");
		 }
		}
		 else {
			 ///
			 }
		
		return 0;
	}

}
