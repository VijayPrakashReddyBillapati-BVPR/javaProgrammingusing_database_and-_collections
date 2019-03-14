package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {
	AccountDao account=new AccountDaoImpl();

	@Override
	public Account getAccountDetails(String mobileNo) {
		try {
			return account.getAccountDetails(mobileNo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		int d = 0;
		try {
			d = account.rechargeAccount(mobileNo, rechargeAmount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		return d;
	}

}
