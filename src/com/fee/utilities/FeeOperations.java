package com.fee.utilities;

public class FeeOperations{
	private double deposited=0;
	private double universityfee=106500;
	
	public void submitFee(double amount){
		deposited+=amount;
	}
	
	public void balanceFee(){
		System.out.println("Your balance fee is : "+(universityfee-deposited));
		if(universityfee-deposited<=1000){
			System.out.println("Your admit card has been issued.");
		}else{
			System.out.println("Your admit card could not be issued due to balanced fees more than 1000");
		}
	}
}
