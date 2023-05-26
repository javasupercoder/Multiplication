package com.demo;

public class Multi {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		System.out.println("Multiplication : "+(a*b));
		a=30;
		a=40;
		System.out.println("Multiplication : "+(a*b));
		//Added from github by sujit
		a=50;
		a=60;
		System.out.println("Multiplication : "+(a*b));
		//added from local by Ajit
		a=70;
		a=80;
		System.out.println("Multiplication : "+(a*b));

		//added from local by Ajit for conflict example
		//bcz sujit have added some code
		//but we have not pulled those changes in our eclipse
		//and we are trying push our some changes to github
		a=90;
		a=100;

		//Added from github by sujit--this is conflict example
		a=50;
		a=60;

		System.out.println("Multiplication : "+(a*b));
	}

}
