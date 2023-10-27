package com.skilldistillery.blackjack.entities;

import java.util.List;

public abstract class Hand {
	protected List<Card> cards;
	
	public Hand() {
		
	}
	
	public void addCard() {
		
	}
	
	public void clear() {
		
	}
	
	public abstract int getHandValue();
	
	public String toString() {
		return null;
		
	}
}
