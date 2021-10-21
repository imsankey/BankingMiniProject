package miniproject;

public class Banking 
{
	private int accountNumber;
	private String accountHolderName,bankName,typeOfAccount;
	private double balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getTypeOfAccount() {
		return typeOfAccount;
	}
	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	Banking(int accountNumber,String accountHolderName,String bankName,String typeOfAccount,double balance)
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.bankName=bankName;
		this.typeOfAccount=typeOfAccount;
		this.balance=balance;
	}
	@Override
	public String toString() {
		return "Banking [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", bankName="
				+ bankName + ", typeOfAccount=" + typeOfAccount + ", balance=" + balance + "]";
	}
	
	
	

}
