package com.wilders.blackjack;

public class Card {
	
	private String color; // Karo, Herz, Pik, Kreuz
	private String type; // 2..10, J, Q, K, Ace
	private int value; // 1...11
	private boolean visibility;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean isVisibility() {
		return visibility;
	}
	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}
	
	public Card(String color, String type, int value, boolean visibility) {
		super();
		this.color = color;
		this.type = type;
		this.value = value;
		this.visibility = visibility;
	}
	
}
