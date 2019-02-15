package Bank;

public class Bank {
int accNo;
int balance ;

Bank(){
	System.out.println("constructor called");}
public Bank(int accNo, int balance){
	this();
	this.accNo = accNo;
	this.balance = balance;
	
	System.out.println(accNo+" "+balance);}


	public static void main(String[] args) {
		
Bank b1 = new Bank();
Bank b2 = new Bank(10,20);

	}

}
