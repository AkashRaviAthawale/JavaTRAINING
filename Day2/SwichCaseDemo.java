package com.Day2;

public class SwichCaseDemo {

	public static void main(String[] args) {
		char x='l' ;
		switch(x)
		{
		case 'l':
		case 'L':
			System.out.println(x+" is a Letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+" is a digit");
			break;
		case 's':
		case 'S':
			System.out.println(x+" is a Space");
		 default:
			 System.out.println(x+"is a ohter space");
			 break;

		}

	}

}
