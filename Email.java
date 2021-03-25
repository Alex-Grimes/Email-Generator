package emailApp;

import java.util.Scanner;

public class Email {
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String companySuffix = "testCompany.com";
	
	//Receive first and last name.
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: "+ this.firstName + " " + this.lastName);
		this.department = setDepartment();
		System.out.println("Department is: " + this.department);
		this.password = randomPass(defaultPasswordLength);
		System.out.println("Your password in: " + this.password);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("Your email is: " + email);
		
		}
	// ask for department.
	
	private String setDepartment() {
		System.out.println("Enter department\n1 for Sales\n2 for development\n3 for accounting\n0 to exit ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "Sales";}
		else if (depChoice == 2 ) { return "Development";}
		else if (depChoice == 3 ) { return "Accounting";}
		else { return "Exiting Program";}
}
	
	
	private String randomPass(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	

	public void setMailboxCap(int capacity) {
		this.mailboxCapacity = capacity;
		}
	
	public void setAltEmail(String email) {
		this.alternateEmail = email;
	}
	public void passChange(String newPass) {
		this.password = newPass;
	}
	public int getMailboxCap() {
		return mailboxCapacity;
		
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	
		
		
	}
	

