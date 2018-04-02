/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr1, 2018
*/

public class P9_ATMDispenser {

	public static void main(String[] args) {
		String dispenseAmount = amountOfBillsToDispense(83);
		System.out.println(dispenseAmount);
	}
	
	public static String amountOfBillsToDispense(double amount) {
		
		int oneDollarBillsToDispense =  (int)amount % 10;
		
		int tenDollarBillsToDispense  = (int) Math.floor(amount / 10);
		
		return "Dispense " + oneDollarBillsToDispense  +  " $1 bills and " + tenDollarBillsToDispense  +  " $10 bills";
	}

}