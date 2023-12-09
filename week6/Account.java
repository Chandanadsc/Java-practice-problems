package week6;

public class Account {
/*
 * The Account class was defined to model a bank account. An account has the properties account number, 
balance, annual interest rate, and date created, and methods to deposit and withdraw funds. Create two 
subclasses for checking and saving accounts. A checking account has an overdraft limit, but a savings 
account cannot be overdrawn. Draw the UML diagram for the classes and then implement them. Write a test 
program that creates objects of Account, SavingsAccount, and CheckingAccount and invokes their 
toString() methods.
 */
	private long accountnumber;
	private double balance;
	private double annualIrate;
	private int date;
	public Account(int accountNumber2, double balance2, double annualInterestRate,int date) {
		  this.accountnumber = accountNumber2;
	        this.balance = balance2;
	        this.annualIrate = annualInterestRate;
	        this.date = date;
		// TODO Auto-generated constructor stub
	}
	public void deposit(int dep)
	{
		this.balance=this.balance+dep;
	}
	public double Withdraw(int draw)
	{
		return (double)(this.balance-draw);
	}
	public long getAccountnumber() {
		return accountnumber;
	}////INCOMPLETE
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public double getAnnualIrate() {
		return annualIrate/12;
	}
	public void setAnnualIrate(double annualIrate) {
		this.annualIrate = annualIrate;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
}
