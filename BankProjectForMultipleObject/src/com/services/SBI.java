package com.services;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.model.Account;


public class SBI implements RBI {
	List<Account> aclist = new ArrayList<Account>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addAccount() {

		Account a = new Account();
		boolean flag = true;
		while (flag) {
			try {
				System.out.println("Enter 5 digit Account Number : ");
				String s = sc.next();
				int acn =Integer.parseInt(s);
				boolean inside = true;
				boolean isCorrect = checkAccountDigit(acn);
				if(isCorrect){
				for(Account a1:aclist) {
					if(a1.getAccountnumber()==acn) {
						System.out.println("This Account Number Already Exists.");
						System.out.println("Enter Different Account Number.");
						inside =false;
					}

				}
				if(aclist.isEmpty()) {
					a.setAccountnumber(acn);
					flag=false;
				}
				if(inside) {
					a.setAccountnumber(acn);
					flag=false;
				}
				
			}
				
			} catch (NumberFormatException e) {
				System.out.println("Sorry...You Have entered Alphabet..Please enter Number..");
			}
		}

		System.out.println("Enter Account Holder Name :  ");
		String anm = sc.next();
		anm += sc.nextLine();
		a.setName(anm);

		System.out.println("Enter Account Holder Address : ");
		String adr = sc.next();
		adr += sc.nextLine();
		a.setAddress(adr);

		System.out.println("Enter Account Holder Pan ID : ");
		String apn = sc.next();
		apn += sc.nextLine();
		a.setPan(apn);
		while (true) {
			try {
				System.out.println("Enter Account Holder Balance : ");
				String s=sc.next();
				s+=sc.nextLine();
				double abl = Double.parseDouble(s);
				
				a.setBalance(abl);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Amount must be added as Number format...");
			}
		}
		aclist.add(a);

		System.out.println("Account Added Successfully....");

	}

	@Override
	public void viewBalance() {
		while(true) {
		try {
		System.out.println("Enter 5 digit Account Number : ");
		String s = sc.next();
		s+=sc.nextLine();
		int acno =Integer.parseInt(s);
		
		boolean iscorrect = checkAccountDigit(acno);
		
		if(iscorrect) {
		boolean inside=true;
		for (Account a : aclist) {
			if (a.getAccountnumber() == acno) {
				System.out.println("This account belongs to : " + a.getName());
				System.out.println("Your Current Balance is : " + a.getBalance());
				inside=false;
				break;
			}

		}
		if(inside) {
			System.out.println(acno+" : This Account Doesnot exits.");
			System.out.println("Enter Correct Account Number.");
		}
		break;
		}

		}
		catch(NumberFormatException e) {
			System.out.println("Sorry...You Have entered Alphabet..Please enter Number..");
		}
		}



	}

	@Override
	public void WithdrawMoney() {
		
		System.out.println("Enter 5 Digit Account Number : ");
		String s = sc.next();
		s+=sc.nextLine();
		int acno =Integer.parseInt(s);
		boolean isCorrect = checkAccountDigit(acno);
		if(isCorrect) {
		boolean inside=true;
		for(Account a:aclist) {
			if(a.getAccountnumber()==acno) {
				while(true) {
				try {
					inside=false;
				System.out.println("Hello : "+a.getName());
				System.out.println("Enter Withdrawing Money ..");
				String s1 = sc.next();
				s1+=sc.nextLine();
				double wamt=Double.parseDouble(s1);
				if(wamt>a.getBalance()) {
					System.out.println("You Have Insufficient Balance . ");
					System.out.println("Your Current Balance is : "+a.getBalance());
				}
				else {
				System.out.println("Your Previous Account balance was : Rs "+a.getBalance());
				double neBal = a.getBalance()-wamt;
				a.setBalance(neBal);
				System.out.println("Your Balance After Withdrawing amount of Rs. "+wamt+" is : "+a.getBalance());
				
				String trs1 =a.getName()+ " : "+ a.getCount() + " Transaction is Withdrawal Amount of Rs. : "+wamt;
				String trs2 ="\n"+a.getName()+ " : "+ a.getCount() + " Balance After Withdrawal of Rs. "+wamt+ " is Rs. :  "+a.getBalance();
				String trs=trs1+trs2;
				a.getStatemennt().add(trs);
				
				a.setCount(a.getCount()+1);
				
				break;
				}
				}
				catch(NumberFormatException e) {
					System.out.println("Amount must be added as Number format...");
				}
				
				}
			}
		}
		
		if(inside) {
			System.out.println(acno+ " This Account Number Does not exists in bank. ");
			System.out.println("Enter Correct Account Number.");
		}
		
		}
		
	}

	@Override
	public void depositeMoney() {
		try {
		System.out.println("Enter 5 Digit Correct Account Number : ");
		String s = sc.next();
		s+=sc.nextLine();
		int acno =Integer.parseInt(s);
		
		boolean isCorrect = checkAccountDigit(acno);
		if(isCorrect) {
		boolean inside = true;
		for(Account a:aclist) {
			if(a.getAccountnumber()==acno) {
				while(true) {
				try {
					inside = false;
				System.out.println("Hello : "+a.getName());
				System.out.println("Enter Depositing Money in Rs. : ");
				String s1 = sc.next();
				s1+=sc.nextLine();
				double damt=Double.parseDouble(s1);
				if(damt<=0) {
					System.out.println("Depositing Amount cannot be Negative and Zero.");
				}
				else {
				System.out.println("Your Previous Account balance was : Rs "+a.getBalance());
				double neBal = a.getBalance()+damt;
				a.setBalance(neBal);
				System.out.println("Your Balance After Depositing/adding amount of Rs. "+damt+" is : "+a.getBalance());
				
				
				String trs1 ="\n"+a.getName()+ " : "+ a.getCount() + " Transaction is Depositing/Adding Amount of Rs. : "+damt;
				String trs2 ="\n"+a.getName()+ " : "+ a.getCount() + " Balance After Depositing/Adding Amount of Rs. "+damt+ " is Rs. :  "+a.getBalance();
				String trs=trs1+trs2;
				a.getStatemennt().add(trs);
				a.setCount(a.getCount()+1);
				
				break;
				}
				}
				catch(NumberFormatException e) {
					System.out.println("Amount must be added as Number format...");
				}
				
				}
			}
		}
		if(inside) {
			System.out.println(acno+ " This Account Number Does not exists in bank. ");
		}
		}
		}
		catch(NumberFormatException e) {
			System.out.println("Sorry...You Have entered Alphabet..Please enter Number..");
		}
		

	}

	@Override
	public void updateAccount() {
		while(true) {
		try {
		boolean check=true;
		System.out.println("Enter 5 Digit Account Number : ");
		String s = sc.next();
		s+=sc.nextLine();
		int acno = Integer.parseInt(s);
		boolean isCorrect = checkAccountDigit(acno);
		if(isCorrect) {
		while(true) {
		for(Account a:aclist) {
			
			if(a.getAccountnumber()==acno) {
				check=false;
			
			System.out.println("1. Account Number Updating . ");
			System.out.println("2. Name Updating . ");
			System.out.println("3. Address Updating . ");
			System.out.println("4. Pan Updating .");
			System.out.println("5. Exit.\n");
			System.out.println("Enter Your Choice : ");
			String s1 = sc.next();
			int ch = Integer.parseInt(s1);
			boolean flag = true;
			switch(ch) {
			
			case 1:
				while(flag) {
				try {
				System.out.println("Your Previos Account Number Was : "+a.getAccountnumber());
				System.out.println("Enter New Account Number : ");
				String s2 = sc.next();
				s2+=sc.nextLine();
				int acn = Integer.parseInt(s2);
				for(Account a1:aclist) {
					if(a1.getAccountnumber()==acn) {
						System.out.println("This Account Number Already Present.\nEnter Diffrent Account Number.");
					}
					else {
						a.setAccountnumber(acn);
						System.out.println("Account Number Update Successfully..");
						System.out.println("New Account Number is : "+a.getAccountnumber());
						flag=false;
					}
					
				}
				}
				catch(NumberFormatException e) {
					System.out.println("Sorry...You Have entered Alphabet..Please enter Number..");
				}
				}
				break;
			case 2:
				
				System.out.println("Previos Name was : "+a.getName());
				System.out.println("Enter New Updating name : ");
				String nm = sc.next();
				nm+=sc.nextLine();
				a.setName(nm);
				System.out.println("Name Update successfully....");
				System.out.println("Name after Updating is : "+a.getName());
				break;
			case 3:
				System.out.println("Previous Address was : "+a.getAddress());
				System.out.println("Enter New Updating address : ");
				String adr = sc.next();
				adr+=sc.nextLine();
				
				a.setAddress(adr);
				System.out.println("Address Update Successfully...");
				System.out.println("Address After Updating is : "+a.getAddress());
				
				break;
			case 4:
				System.out.println("Previous Pan Id was : "+a.getPan());
				System.out.println("Enter New Pan Number :");
				String pn = sc.next();
				pn+=sc.nextLine();
				a.setPan(pn);
				System.out.println("Pan ID update successfully..");
				System.out.println("Pan Id after updating is : "+a.getPan());
				
				break;
			case 5:
				flag =false;
				break;
				default : 
					System.out.println("You Have Entered Wrong Choice ....");
			
			}
			
		}
		}
		if(check) {
			System.out.println("This Account Number Not exists in Bank.");
		}
		break;
		}
		}
		}
		catch(NumberFormatException e) {
			System.out.println("Sorry...You Have entered Alphabet..Please enter Number..");
		}
		
	
		break;
		}
	}

	@Override
	public void viewAccountDetails() {
		while(true) {
		try {
		System.out.println("Enter Account Number : ");
		String s = sc.next();
		s+=sc.nextLine();
		boolean flag = true;
		int acno =Integer.parseInt(s);
		for (Account a : aclist) {
			
			if(a.getAccountnumber()==acno) {
				System.out.println(a);
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println(acno+" : This Account Number Does not exist.");
		}
		break;
		}
		catch(NumberFormatException e) {
			System.out.println("Sorry...You Have entered Alphabet..Please enter Number..");
		}
		}

	}



	@Override
	public void addMultipleAccount() {

		System.out.println("Enter Number of Accounts To Be Added : ");
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			Account a = new Account();
			while (true) {
				boolean flag = true;
				
				while (flag) {
					try {

						System.out.println("Enter " + (i + 1) + " Account Number (only 5 digit allowed) : ");
						String s = sc.next();
						//s+=sc.nextLine();
						int acn = Integer.parseInt(s);
						boolean isCorrect = checkAccountDigit(acn);
						
						if(isCorrect){
						boolean inside = true;
						for(Account a1:aclist) {
							if(a1.getAccountnumber()==acn) {
								System.out.println("This Account Number Already Exists.");
								System.out.println("Enter Different Account Number.");
								inside=false;
							}
						}
						if(aclist.isEmpty()) {
							a.setAccountnumber(acn);
							flag = false;
						}
						if(inside) {
							a.setAccountnumber(acn);
							flag = false;
						}
					}
						
					} catch (NumberFormatException e) {
						System.out.println("Sorry...You Have entered Alphabet..Please enter Number..");
					}
				}

				System.out.println("Enter  " + (i + 1) + " Account Holder Name :  ");
				String anm = sc.next();
				anm += sc.nextLine();
				a.setName(anm);

				System.out.println("Enter " + (i + 1) + " Account Holder Address : ");
				String adr = sc.next();
				adr += sc.nextLine();
				a.setAddress(adr);

				System.out.println("Enter " + (i + 1) + " Account Holder Pan ID : ");
				String apn = sc.next();
				apn += sc.nextLine();
				a.setPan(apn);
				while (true) {

					try {
						System.out.println("Enter " + (i + 1) + " Account Holder Balance : ");
						String s1 = sc.next();
						s1 += sc.nextLine();

						double abl = Double.parseDouble(s1);
						a.setBalance(abl);

						aclist.add(a);

						System.out.println((i + 1) + "  Account added successfully...");
						break;
					} catch (NumberFormatException e) {
						System.out.println("Amount must be added as Number format...");
					}
					
				}
				break;
			}

		}

	}

	@Override
	public void viewAllAccountDetails() {
	

		boolean flag=false;
		int i = 0;
		if(aclist.isEmpty()) {
			System.out.println("No Account in Bank.");
		}
		else {
		for(Account a:aclist) {
			System.out.println(a);
			System.out.println("--------------------------------------------------------------------");
			i++;
			flag=true;
		}
		}
		if(flag) {
		System.out.println("Total Account in Bank : "+i);
		}
		
	}
	
	public boolean checkAccountDigit(int AccountNumber) {
		
		
		
		boolean isCountEqual =false;

		int count0 = 0;
		int accNum = AccountNumber;
		int rem = 0;
		for (int i = 0; i < 20; i++) {  // Here 20 just take for safely purspose
			rem = accNum / 10;
			accNum = rem;
			count0++;
			if (accNum == 0) {
				break;
			}
		}
		if (count0 < 5 || count0 > 5) {  // Enter Your Number Limit Here

			// throw new SBIException("Please enter 5 digit account number");
			System.out.println("Please enter 5 digit account number ");
			System.out.println("You have Entered : " + AccountNumber);
		}
		if (count0 == 5) {     // Enter Your Limit Here
			isCountEqual=true;
		}
		
		return isCountEqual;
	}

	@Override
	public void transactionHistory() {
		System.out.println("Enter 5 Digit Correct Account Number : ");
		String s=sc.next();
		s+=sc.nextLine();
		int acn = Integer.parseInt(s);
		boolean isCorrect = checkAccountDigit(acn);
		boolean inside=true;
		boolean flag=true;
		if(isCorrect) {
			
			for(Account a:aclist) {
				flag=false;
				if(a.getAccountnumber()==acn) {
					
					for(String s1:a.getStatemennt()) {
						inside=false;
							System.out.println(s1);
					}
				}
			}
			if(flag) {
				System.out.println("This Account Number Does not exist in Bank.");
			}
			if(inside) {
				System.out.println("No Transaction Done Yet..");
			}
		}
	}

	@Override
	public void deleteAccount() {
		try {
		System.out.println("Enter correct 5 digit Account Number : ");
		String s = sc.next();
		s+=sc.nextLine();
		int acn = Integer.parseInt(s);
		boolean isCorrect= checkAccountDigit(acn);
		boolean flag=true;
		if(isCorrect) {
		for(Account a:aclist) {
			if(a.getAccountnumber()==acn) {
				flag=false;
				int indexOf = aclist.indexOf(a);
				aclist.remove(indexOf);
				System.out.println("Account Remove Successfully.");
			}
		}
		if(flag) {
			System.out.println(acn+" : This Account Number is Not Available");
		}
		}
		}
		catch(NumberFormatException e) {
			System.out.println("Sorry...You Have entered Alphabet..Please enter Number..");
		}
	}

}
