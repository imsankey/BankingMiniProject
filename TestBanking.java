package miniproject;

import java.util.Scanner;

public class TestBanking 
{
	public static void main(String [] arg)
	{
		Banking b[]=new Banking[10];
		int accnum,choice=0,count=0;
		String acchname,bname,typeofacc;
		double bal;
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.println("1.add account detail \n2.Get all account details \n3.Update account detail by account number. \n4.Delete account details by account number\n5.Search Account by number\n6. Exit");
		System.out.println("Enter the choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter Account number");
			accnum=sc.nextInt();
			
			System.out.println("Enter Account holder number");
			acchname=sc.next();
			
			System.out.println("Enter Bank name");
			bname=sc.next();
			
			System.out.println("Enter Type of account");
			typeofacc=sc.next();
			
			System.out.println("Enter Account balance ");
			bal=sc.nextDouble();
			
			b[count]=new Banking(accnum,acchname,bname,typeofacc,bal);
			count++;
			System.out.println("added succesfully");
			break;
			
		case 2:
			System.out.println("---------------------bank account details-----------------------------");
			for(int i=0;i<=count;i++)
			{
				System.out.println(b[i]);
			}
			break;
		case 3:
			System.out.println("Enter bank account details to update ");
			accnum=sc.nextInt();
			for(int i=0;i<=count;i++)
			{
				if(b[i]!=null && b[i].getAccountNumber()==accnum)
				{
					System.out.println("Enter new account holder name");
					acchname=sc.next();
					b[i].setAccountHolderName(acchname);
					System.out.println("Enter new bank name");
					bname=sc.next();
					b[i].setBankName(bname);
					System.out.println("Enter new account holder type of account");
					typeofacc=sc.next();
					b[i].setTypeOfAccount(typeofacc);
					System.out.println("Enter new account balance");
					bal=sc.nextDouble();
					b[i].setBalance(bal);
					
					System.out.println("Bank details updated succesfully");
				}
			}
			break;
		case 4:
			System.out.println("Enter the account number to delete details");
			accnum=sc.nextInt();
			for(int i=0;i<=count;i++)
			{
				if(b[i]!=null&&b[i].getAccountNumber()==accnum)
				{ 
					b[i]=null;
					System.out.println("book deleted succesfully");
				}
			}
			break;
			
		case 5:
			System.out.println("Enter the acoount number to get details");
			accnum=sc.nextInt();
			for(int i=0;i<=count;i++)
			{
				if(b[i]!=null && b[i].getAccountNumber()==accnum)
				{
					System.out.println(b[i]);
				}
			}
		case 6:
			System.out.println("thank you for using this visit again");
			System.exit(0);
			break;
		default:
			System.out.println("invalid choice");
		
	}
		
	}while(choice!=6);
	}
	

}
