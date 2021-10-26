package com.controller;

import java.util.Scanner;

import com.model.*;
import com.services.*;

public class Admin {
	public static void main(String[] args) {
    		boolean b = true;
		SBI s = new SBI();
		Scanner sc1 = new Scanner(System.in);
		while (b) {
			try {

				System.out.println("\n-----------WELCOME TO STATE BANK OF INDIA-----------\n");
				System.out.println("1.Adding new Account.");

				System.out.println("2.Depositing Money.");
				System.out.println("3.Withdrawing Money.");
				System.out.println("4.View Account Balance.");
				System.out.println("5.View Account Details.");
				System.out.println("6.Update Account Details.");
				System.out.println("7.Adding Multiple new Account.");
				System.out.println("8.View All Account From Bank. ");
				System.out.println("9. Transaction History.");
				System.out.println("10. Delete Account.");
				System.out.println("11.Exit.\n");
				System.out.println("Enter Your Choice : ");
				String choice = sc1.next();
				// choice +=sc1.nextLine();
				int ch = Integer.parseInt(choice);
				switch (ch) {
				case 1:
					s.addAccount();
					break;
				case 2:
					s.depositeMoney();
					break;
				case 3:
					s.WithdrawMoney();
					;
					break;
				case 4:
					s.viewBalance();
					break;
				case 5:
					s.viewAccountDetails();
					break;
				case 6:
					s.updateAccount();
					break;
				case 7:
					s.addMultipleAccount();
					break;
				case 8:
					s.viewAllAccountDetails();
					break;
				case 9:
					s.transactionHistory();
					break;
				case 10:
					s.deleteAccount();
					break;
				case 11:
					b = false;
					break;

				default:
					System.out.println("You Have Entered Wrong input...");

				}
			} catch (NumberFormatException e) {
				System.out.println("Please Enter valid .....");
			}
			catch(Exception e) {
				
			}

		}



	}

}
