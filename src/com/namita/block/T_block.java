package com.namita.block;

public class T_block {
	String name="namita";
	static {//static block
		System.out.println("static block");
	}
	T_block(){//we have created constructor//default constructor
		//this("abc");we can use only at first line of  constructor
		
		System.out.println("constructor created");
		System.out.println(name);//this is also there hidden
		System.out.println(this.name);//this is used for current object
		//this("abc");we cant use this("abc") anywhere in constructor
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T_block("abc");//object creation
		//T_block obj=new T_block();//object creation
		//System.out.println(obj.name);
		

	}
	
	
	
	
	//instance block
	
	{
		System.out.println("Istance block");
		
		}
	//parameter constructor
	T_block (String a){
		this();
		System.out.println(a);
		
	}
	
	
	
	
	
	
	

}
