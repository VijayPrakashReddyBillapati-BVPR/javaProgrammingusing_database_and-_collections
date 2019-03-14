package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {

	static AccountService as =new AccountServiceImpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		options();
	}
	public static void options() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("menu");
		System.out.println("1.Account balance Enquiry"+"\n"+"2.Recharge"+"\n"+"3.exit");
		int n= sc.nextInt();
		switch(n) {
			case 1:
					System.out.println("enter the mobile number");
					String mobileNo = sc.next();
	
					as.getAccountDetails(mobileNo);
	
					break;
			case 2:
	
					System.out.println("enter mobile no");
					String mobileNo1 = sc.next();
					System.out.println("enter amount to be recharged");
					double amount = sc.nextDouble();
	
					as.rechargeAccount(mobileNo1, amount);
					break;
			case 3:
					System.exit(0);

			}
		sc.close();
	}

}
