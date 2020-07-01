package emailapp;
import java.util.Scanner;

public class Email
{
private String firstName;
private String lastName;
private String password;
private String department;
private String email;
private int mailboxCapacity=500;
private int defaultPasswordLenghth=10;
private String alternateEmail;
private String companySuffix="aeycompany.com";

public Email(String firstName, String lastName)
{
this.firstName=firstName;
this.lastName=lastName;
System.out.println("EMAIL CREATED:" + this.firstName + " " + this.lastName);

this.department=setDepartment();
System.out.println("Department: " + this.department);

this.password = randomPassword(defaultPasswordLength);
System.out.println("your password is: " + this.password);


email=firstName.tolowerCase() + "." + lastName.tolowerCase() + "@" + department + "." + companyStuff;
System.out.println("your email is: " + email);
}
private String setDepartment(){
System.out.print("New worker:" + firstName + "DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accouting\n0 for none\nEnter department codes: ");
Scanner in = new Scanner(System.in);
int depChoice = in.nextInt();
if (depChoice==1)
{
return "sales";
}
else if (depChoice==2)
{
	return "dev";
}
else if(depChoice==3)
{
	return "acct";
}
else { 
return "";
}
}




private String randomPassword(int length)
{
	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
char[] password = new char [length];
int rand = (int) (Math.rondom() * passwordSet.Length());
password[i] = passwordSet.charAt(rand);
}
return new String(password);
}


public void setMailboxCapacity(int capacity)
{
	this.mailboxCapacity = capacity;
}

public void setAlternateEmail(String altEmail)
{
	this.alternateEmail = altEmail;
}

public void changePassword(String password)
{
	this.password = password;
}

public int getMailboxCapacity()
{
	return mailboxCapacity;
}


public String getAlternateEmail()
{
	return alternateEmail;
}


public String getPassword() 
{
	return password;
}
public String showInfo()
{
	return "DISPLAY NAME: "+ firstName + " " + lastName +
	"\nCOMPANY EMAIL: " + email +
	"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	
}
}











