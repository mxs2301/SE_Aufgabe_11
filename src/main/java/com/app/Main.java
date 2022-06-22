package com.app;
public class Main{
	public static void main(String[] args) {
		

		Ordner level1 = new Ordner("level1", 2);
		Ordner level2 = new Ordner("level2", 3);
		Ordner level3 = new Ordner("level3", 4);

		level2.add(level3);
		level1.add(level2);

		level1.ausgabe("");


	}
}