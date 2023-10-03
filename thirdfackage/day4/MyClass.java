package com.thirdfackage.day4;

public class MyClass {
	
	private static MyClass obj =new MyClass();
	private int id;
	
	public int getId()
	{
		return id;
	}
	
    private void setId(int id)
    {
    	this.id=id;
    }
    
    private MyClass() {
    	System.out.println("Myclass obj created");
    }
    
    public static MyClass getObject()
    {
    	return obj;
    }
    
    @Override
    public String toString() {
    	return "MyClass[id="+id+"]";
    }
}
