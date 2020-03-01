package com.epam.newYearGift;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Chocolate> arraylist = new ArrayList<Chocolate>();
		   arraylist.add(new Gift(1, "kit-kat", 30, 10));
		   arraylist.add(new Gift(2, "gems", 20, 15));
		   arraylist.add(new Gift(3, "perk", 10, 20));
		   System.out.println("1. Sort by Id of the gifts/n2. Calculate total Cost of gifts/n3. Calculate total weight/n");
		   int choice = sc.nextInt();
		   switch(choice){
		   case 1:
			   System.out.println(CalTotal.calTotalCost(arraylist));
			   break;
		   case 2:
			   System.out.println(Sorting.sortById(arraylist));
			   break;
		   case 3:
			   System.out.println(CalTotal.calTotalWeight(arraylist));
		   default:
			   System.out.println("INVALID INPUT");
		   }
		   
		   
		   


	}

}
