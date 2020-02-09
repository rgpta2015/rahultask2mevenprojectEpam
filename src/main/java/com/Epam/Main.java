package com.Epam;
import java.io.*;

public class Main {
	public static void main(String args[])throws IOException{
		System.out.println("New Year Gift");
		int x;
		sweet a=new sweet();
		chocolate b=new chocolate();
		System.out.println("Enter the Sweet u want as New Year Gift : ");
		System.out.println("Press 1 for Ladoo");
		System.out.println("Press 2 for Gulab Jamun");
		System.out.println("Press 3 for Soan Papdi");
		System.out.println("Press 4 for Barfi");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		x=Integer.parseInt(br.readLine());
		switch (x){
			case 1:a.set_type(6,"Ladoo");
				break;
			case 2:a.set_type(10,"Gulab Jamun");
				break;
			case 3:a.set_type(8,"Soan Papdi");
				break;
			case 4:a.set_type(5,"Barfi");
				break;
		}
		System.out.println("Enter the Chocolate u want as New Year Gift : ");
		System.out.println("Press 1 for Dairy Milk");
		System.out.println("Press 2 for 5 Star");
		System.out.println("Press 3 for Kit-Kat");
		System.out.println("Press 4 for Ferrero Rocher");
		BufferedReader c=new BufferedReader(new InputStreamReader(System.in));
		x=Integer.parseInt(c.readLine());
		switch (x){
			case 1:b.set_type(20,"Dairy Milk");
				break;
			case 2:b.set_type(15,"5 Star");
				break;
			case 3:b.set_type(25,"Kit-Kat");
				break;
			case 4:b.set_type(35,"Ferrero Rocher");
				break;
		}
		System.out.println("You Recieved : ");
		System.out.println("Sweet : "+a.type );
		System.out.println("Chocolate : " +b.type);
		System.out.println("Sweet Weight : " +a.weight );
		System.out.println("Chocolate Weight : " + b.weight);
		System.out.println("Total Weight : "+(a.weight+b.weight));
		System.out.println("Sorted List of Gifts :");
		if(a.type.compareTo(b.type)>0)
			System.out.println(b.type +" -> "+a.type);
		else
			System.out.println(a.type +" -> "+ b.type);
 	
	}


}
