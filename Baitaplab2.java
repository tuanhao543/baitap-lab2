package Baitaplab2;
import java.util.Scanner;
public class Baitaplab2 {
     public static void main(String[] args){
      double a,b,c,x,x1,x2,delta;
      int sd,tien;
        do {            
        
        System.out.println("1. Giai phuong trinh bac 1");
        System.out.println("2. Giai phuong trinh bac 2");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
     
         
        System.out.print(" Chon chuc nang: ");
        Scanner n = new Scanner(System.in);
        int nhapchucnang = n.nextInt();
        Scanner nhap= new Scanner(System.in);
        
        switch (nhapchucnang) {
            case 1: 
            
		Scanner input = new Scanner(System.in);
     

		System.out.print(" Nhap a: ");             
                a = nhap.nextDouble();
                
                System.out.print(" Nhap b: ");              
                b = nhap.nextDouble();
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

                break;
               case 2:
                
                
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
    

                             
                break;
            case 3:
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
	

                break;
            default:
                throw new AssertionError();
        
        
      } while (true);
    }
}