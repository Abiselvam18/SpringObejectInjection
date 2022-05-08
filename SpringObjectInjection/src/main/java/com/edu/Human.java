package com.edu;

public class Human {
	private Heart heart;
	//generate setters and getters method

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void humanFunction() {
		if(heart!=null) {
			heart.pump();
		}
		else {
			System.out.println("Not Alive");
		}
	}

}
