package com.cc.java;

public class App {

	public static void main(String[] args) {

		Mitarbeiter m001 = new Mitarbeiter("Schmidt", "Julia", "Personalmanagerin", 2015);
		Mitarbeiter m002 = new Mitarbeiter("Müller", "Andreas", "Vertriebsleiter", 2018);
		Mitarbeiter m003 = new Mitarbeiter("Wagner", "Laura", "Finanzbuchhalterin", 2019);
		output(m001.getInfo(m001.getRole()));
		output(m002.getInfo(m001.getRole()));
		output(m003.getInfo(m002.getRole()));

	}

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
