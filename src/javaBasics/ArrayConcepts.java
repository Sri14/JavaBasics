package javaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		
		
	// Single dimensional String array - only takes string data type 	
		String s[] = new String [3];
		s[0] = "Hi";
		s[1] = "Hello";
		s[2] = "What";
		System.out.println(s.length);
		System.out.println(s[0]);
		for(int x=0; x<s.length; x++ ) {
		System.out.println(s[x]);	
		
	
		// int i = 10;	
		// int i =20; 	
		
		//int array - only takes int data type
		int i[] = new int [4];	
		i[0] = 100;	
		i[1] = 200;	
		i[2] = 300;	
		i[3] = 400;	
		// i[4] = 500;	
		//System.out.println(i[3]);	
		//System.out.println(i.length);	
		for(int k =0; k<i.length; k++) {	
		System.out.println(i[k]);	
		}	
	
		//double array - only takes double data type
		double d[] = new double [3];	
		d[0] = 10.3;	
		d[1] = 20.5;	
		d[2] = 30.6;	
		System.out.println(d[2]);	
		System.out.println(d.length);	
		for(int h = 0 ; h<d.length; h++) {	
		System.out.println(d[h]);	
		}	
		
		
		//object array - this can take any data type
		Object a [] = new Object [3];	
		a[0] = "Tom";	
		a[1] =7;	
		a[2] = 3.5;	
		//System.out.println(a.length);	
		for(int t =0; t<a.length; t++) {	
		System.out.println(a[t]);	
		}	
		Object a1 [] = new Object [3];	
		a1[0] = "Sam";	
		a1[1] =7;	
		a1[2] = 3.5;	
	}
		
	//Two / Multi dimensional array 
		
		int i[][] = new int [3] [4];
				
		i[0][0] = 10;
		i[0][1] = 20;
		i[0][2] = 30;
		i[0][3] = 40;
		
		i[1][0] = 50;
		i[1][1] = 60;
		i[1][2] = 70;
		i[1][3] = 80;
			
		i[2][0] = 90;
		i[2][1] = 100;
		i[2][2] = 110;
		i[2][3] = 120;
			
			
	//	System.out.println(i[2][2]);
				
		System.out.println(i.length); // row length
		System.out.println(i[0].length); // column length
		System.out.println("*******************");
		for(int row = 0; row< i.length; row++) {
			for(int col = 0; col<i[0].length; col++) {
				System.out.println(i[row][col]);
					}
				}
	
	}
}
