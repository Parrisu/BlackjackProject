package com.skilldistillery.blackjack.entities;

public enum Suit {
	HEARTS("Hearts"),
	SPADES("Spades"),
	CLUBS("Clubs"),
	DIAMONDS("Diamonds");
	// 0 - 3

	private String name;

	Suit(String suitName) {
		name = suitName;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
	
	
	
}
