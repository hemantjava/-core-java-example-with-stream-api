package com.example.corejavaexamplewithstreamapi.labda;

public class Operation {

	public static void main(String[] args) {
		//with type
		MathOperation addition = (int a,int b)->a+b; //Definition
		//without type
		MathOperation subtraction = (a,b)->a-b;
		//Multiplication with curly braces and return
		MathOperation multiplication= (a,b)-> {return a*b;};
		
		System.out.println(addition.operation(12, 13)); //calling
		System.out.println(subtraction.operation(12, 13));
		System.out.println(multiplication.operation(12, 13));
		
		
	/*	MathOperation oo=new MathOperation() {

			@Override
			public int operation(int a, int b) {
				
				return a+b;
			}
			};
		
			System.out.println(oo.operation(10, 20));*/
			
			
		System.out.println("Addition: "+operation(10,20,addition));
		System.out.println("Subtration: "+operation(10,20,subtraction));
		System.out.println("Muliplication: "+operation(10,20,multiplication));
		

	}
	
	//this structure followed by oracle people
	private static int operation(int a, int b, MathOperation op) {
		
		return op.operation(a, b);
	}
	
	
}
