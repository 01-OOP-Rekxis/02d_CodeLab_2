package com.cc.java;

public class App {

	public static void main(String[] args) {

		Mitarbeiter m001 = new Mitarbeiter("Schmidt", "Peter", "Dozent", 2015);

		output(m001.getInfo());

	}

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
