package com.epam.newYearGift;

public abstract class Chocolate implements Comparable<Chocolate>{
	protected int id = -1;
	private String name = null;
	private int cost = -1;
	private int weight = -1;
	
	public Chocolate(int i,String n, int p, int w){
		this.id = i;
		this.name = n;
		this.cost = p;
		this.weight = w;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}


	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int compareTo(Chocolate c){
		return this.id - c.id; 
	}
	public String toString() {
        return "Chocolate : " + id + " - " + name + " - " + cost + " - " + weight + "\n";
    }
}
