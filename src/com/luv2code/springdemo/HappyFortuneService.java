package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	private final String[] fortunes = new String[] {"Today is your lucky day!", "You will meet someone interesting today", "You will meet a goal today"};
	
	@Override
	public String getFortune() {
		Random r = new Random();
		return fortunes[r.nextInt(3) + 0];
	}

}
