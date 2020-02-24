/*
 * @Author Capgemini
 * @Developer Shubham Jha
 * @Description Create Payment Account Wallet
 * @Created 19/02/2020
 * @Version 1.1
 * @Status release Beta
 */
package capgemini.online_payment_wallet.signup_signin.service;

import java.io.*;
import java.util.*;
import capgemini.online_payment_wallet.signup_signin.beans.Users;
import capgemini.online_payment_wallet.signup_signin.exception.MyException;

public class Authentication  {
	InputStreamReader isr;
	BufferedReader buff;
	int flag = 0;
	List<Users> userList;

	public void userRegistration() {
		//Authentication mObject = new Authentication();
		isr = new InputStreamReader(System.in);
		buff = new BufferedReader(isr);
		userList = new ArrayList<Users>();
		
		System.out.println(
				"\n*************************WELCOME TO ONLINE PAYMENT WALLET SYSTEM*******************************\n");
		System.out.println("Do you want to register?\n");

		do {
			System.out.print("Enter your choice: ");
			System.out.println("\n1. Register\n2. Login \n");
			
			try {
				int ch = Integer.parseInt(buff.readLine());
				switch (ch) {
				case 1:
					register();
					break;
				case 2:
					loginUser();
					break;
				default:
					break;
				}
			} catch (Exception e) {

			}
		} while (flag == 1);
	}

	public void register() {
		try {
			System.out.println("Create  your UserId:");
			int Uid = Integer.parseInt(buff.readLine());
			System.out.println("Create  your UserName:");
			String uname = buff.readLine();
			System.out.println("Create  your Password:");
			String pass = buff.readLine();
			System.out.println("Enter your Phone Number:");
			String no = buff.readLine();
			System.out.println("Create  your LoginName:");
			String Lname = buff.readLine();

			userList.add(new Users(Uid, uname, pass, no, Lname));
			System.out.println(" Your are Successfully Registered !!! \n ");
			flag++;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void loginUser() {  //throws MyException{

		try {
			System.out.println("Enter  your LoginName:");
			String s1 = buff.readLine();
			System.out.println("Enter  your Password:");
			String s2 = buff.readLine();

			for (Users u : userList) {
				if ((u.getLoginName().equals(s1)) && (u.getPassword().equals(s2))) {
					System.out.println("Successfully Logged In");
					flag++;
				} else
					//System.out.println(" Invaild LoginName or Password \n");
					throw new MyException("INVALID USER :(User defined Exception) ");              }

		    } catch (Exception e) {
			System.out.println(e);
		}
	       }

}
