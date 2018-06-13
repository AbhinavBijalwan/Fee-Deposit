package com.fee.controller;

import java.util.Scanner;

import com.fee.utilities.FeeOperations;

public class Driver {
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		double deposit;
		System.out.print("Enter fees amount to deposit : ");
		deposit=scan.nextDouble();
		FeeOperations feeOp = new FeeOperations();
		feeOp.submitFee(deposit);
		feeOp.balanceFee();
		scan.close();
	}

}
