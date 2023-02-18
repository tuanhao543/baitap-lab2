
package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {

    
    public static void main(String[] args) {
       

		Scanner input = new Scanner(System.in);
		double x;

		System.out.println("Nhap so a bat ky: "); float a = input.nextFloat();
		System.out.println("Nhap so b bat ky: "); float b = input.nextFloat();
		if (a==0)
		if(b==0)
		{

			System.out.println("Phuong trinh vo so nghiem");
		}
		else
		{
			System.out.println("Phuong trinh vo nghiem");
		}
		else
		{
			x= -b/a;	
			System.out.println("Phuong trinh bac nhat co nghiem x = " + x);
		}
	}
}
    
    

