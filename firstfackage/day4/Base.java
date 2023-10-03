package com.firstfackage.day4;

public class Base {

//declare default, public,private, protected variables
int varDefault=10;
public int varPublic=20;
private int varPrivate=30;
protected int varProtected=40;

//declaring methods with default, public,private, protected types

void methodDefault()
{
	System.out.println("Default access base class");
	System.out.println("Default Variables :" +varDefault);
}

public void methodPublic()
{
	System.out.println("Public access base class");
	System.out.println("Public Variable:" +varPublic);
}

  public void methodPrivate()
{
	System.out.println("Private access base class");
	System.out.println("Private Variables :" +varPrivate);
}
  
  void methodProtected()
  {
  	System.out.println("Prtected access base class");
  	System.out.println("Protected Variables :" +varProtected);
  }


}

