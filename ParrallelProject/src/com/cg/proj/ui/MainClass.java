package com.cg.proj.ui;

import java.util.Scanner;

import com.cg.proj.service.AccountService;
import com.cg.proj.service.AccountServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		
		
		AccountService aser = new AccountServiceImpl();
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Menu");
		System.out.println("-------------------");
		System.out.println("1. Create Account");
		System.out.println("2. Shoe Balance");
		System.out.println("3. Deposit");
		System.out.println("4. Withdraw");
		System.out.println("5. Fund Transfer");
		System.out.println("6. Print Statement");
		System.out.println("7. Exit");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			
	}

}
}