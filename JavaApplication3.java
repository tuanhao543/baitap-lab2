
package javaapplication3;

 import java.util.Scanner;
public class JavaApplication3 {

    
    public static void main(String[] args) {
      
 


	{
		Scanner input = new Scanner(System.in);

		System.out.println("Moi nhap so dien: ");
		double soDien = input.nextDouble();
		
		if(soDien < 50)
		{
			System.out.println("Tien dien cua ban la:" + ( soDien*1000 ));
		}
		else
		{
			System.out.println("Tien dien cua ban la:" + (50*1000+(soDien-50)*1200));
		}
	}
}
    }
    

