
package javaapplication2;

import java.util.Scanner;
public class JavaApplication2 {

    
    public static void main(String[] args) {


	
	Scanner input = new Scanner(System.in);
	double x1, x2, del;
	
	System.out.print("Nhap so a bat ky = ");double a = input.nextDouble();
	System.out.print("Nhap so b bat ky = ");double b = input.nextDouble();
	System.out.print("Nhap so c bat ky = ");double c = input.nextDouble();
	
	if (a == 0) 
	{
	    if (b == 0) 
	    {
			if (c == 0) 
			{
		    	System.out.println("Phuong trinh vo so nghiem");
			} 
			else 
			{
		    	System.out.println("Phuong trinh vo nghiem");
			}
	    } 
	    else 
	    {
			System.out.println("Phuong trinh co nghiem = " + (-c / b));
	    }
	} 
	else 
	{ 
	    del = b * b - 4 * a * c;
	    if (del < 0) {
		System.out.println("Phuong trinh vo nghiem");
	    } else if (del == 0) {
		x1 = x2 = -b / (2 * a);
		System.out.println("Phuong trinh co nghiem kep: " + x1);
	    } else {
		x1 = (-b + Math.sqrt(del)) / (2 * a);
		x2 = (-b - Math.sqrt(del)) / (2 * a);
		System.out.println("Phuong trinh co 2 nghiem phan biet la: x1 = " + x1 + "\nx2 = " + x2);
	    }
	}
		
	input.close();
    }

}
    
    

