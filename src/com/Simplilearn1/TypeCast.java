package com.Simplilearn1;

public class TypeCast {
	public static void main(String[] args) 
	{
		
	System.out.println("Implict");
	char a= 'A';
	System.out.println("a value"+a);
	int b=a;
	System.out.println("b value"+b);
	float c=a;
	System.out.println("c value"+c);
	long d=a;
	System.out.println("d value"+d);
	double e=a;
	System.out.println("e value"+e);
	
	System.out.println("Explict");
	
	double x=89.90;
	int y = (int)x;
	float z= (float)x;
	System.out.println("x value"+x);
	System.out.println("y value"+y);
	System.out.println("z value"+z);
	}


}
