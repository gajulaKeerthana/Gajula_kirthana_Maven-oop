package com.epam.newYearGift;

import java.util.ArrayList;

public  class Gift extends Chocolate {

	public Gift(int i, String n, int p, int w) {
		super(i, n, p, w);
	}
	static int calWeight(ArrayList<Chocolate> g1){
		int tot = 0;
		for(int i = 0; i < g1.size(); i++){
			tot = tot + g1.get(i).getWeight();
		}
		return tot;
		
	}
}