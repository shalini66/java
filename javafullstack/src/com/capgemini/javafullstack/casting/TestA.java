package com.capgemini.javafullstack.casting;

public class TestA {
	public static void main(String[] args) {
		Animal a = new Cow();//up casting
		
		Cow c = (Cow)a;//down casting
		c.eat();
		c.drink();
	}
}
		