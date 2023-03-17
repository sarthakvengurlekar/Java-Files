package com.l2c.springdemo;

public class RandomFortune implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = {"Good life", "Bad life", "Moderate life"};
		
		int rand = (int)(Math.random() *3);
		return fortunes[rand];
	}

}
