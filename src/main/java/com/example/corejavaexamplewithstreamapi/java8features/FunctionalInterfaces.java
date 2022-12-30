package com.example.corejavaexamplewithstreamapi.java8features;



public class FunctionalInterfaces {

	public static void main(String[] args) {
		
		
		Inter1 i1=()->System.out.println("hemant");//{};
		i1.show();
		
		Inter2 i2=x->{
			System.out.println("wifey :"+x);
		};
		
		i2.show("sarita");
		
		Inter3 i3 =(x,y)-> {return x+y;};
		
		System.out.println(i3.show(7, 8));
		
	}

}

@FunctionalInterface // annotation is optional its ensure defined interface is functional interface
interface Inter1{
	
	void show();

   // @Override
    public String toString();                //Overridden from Object class
    
    public int hashCode();
 
   // @Override
    public boolean equals(Object obj);//allowed
	
	
}

interface Inter2{
	
	void show(String name);
	
	
}

interface Inter3{
	
	int show(int x, int y);
	
	
}

interface Inter4{
	
	int show(int x, int y);
	
	
}