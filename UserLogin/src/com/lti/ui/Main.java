package com.lti.ui;

import java.util.Scanner;

import com.lti.model.Credentials;
import com.lti.service.CredentialsService;
import com.lti.service.CredentialsServiceImpl;

public class Main {

	public static void main(String[] args) {
		Credentials cred=new Credentials();
		CredentialsService service= new CredentialsServiceImpl();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the username");
		String username=scan.next();
		System.out.println("enter the password");
		String password=scan.next();
		
		int value=service.readPassenger(username,password);
		if(value==1){
			System.out.println("login successfull");
		}else{
			System.out.println("Sorry! Please try again");
		}
	}

}
