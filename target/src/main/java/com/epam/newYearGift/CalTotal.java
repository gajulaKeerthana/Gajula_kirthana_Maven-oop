package com.epam.newYearGift;

import java.util.ArrayList;

public class CalTotal {
	public static int calTotalCost(ArrayList <Chocolate> chocolates){
		int cost = 0;
		for(Chocolate choco: chocolates){
			cost = cost + choco.getCost();
		}
		return cost;
		}
	public static int calTotalWeight(ArrayList <Chocolate> chocolates){
		int weight = 0;
		for(Chocolate choco: chocolates){
			weight = weight + choco.getWeight();
		}
		return weight;
		}
	
}
	


