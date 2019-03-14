package com.cg.mra.dao;

import com.cg.mra.beans.Account;

public interface AccountDao {
 Account getAccountDetails(String mobileNumber);
 int rechargeAccount(String mobileNo , double rechargeAmount);
}
