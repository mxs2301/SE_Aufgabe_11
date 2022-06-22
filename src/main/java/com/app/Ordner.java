package com.app;

import java.util.ArrayList;
import java.util.List;

public class Ordner implements Datei{
	private List<Datei> dateien;
	private String Ordnername;
	private int size;

	public Ordner(String Ordnername, int size){
		this.Ordnername = Ordnername;
		this.size = size;
		dateien = new ArrayList<>();
	}


	public void ausgabe(String input){
		System.out.println(input + this.Ordnername);
		if(dateien.size() == 0){
			return;
		}
		for(Datei eingabe : this.dateien){
			eingabe.ausgabe("  " + input);
		}
	}

	public int zugriff(){
		if(dateien.size() == 0){
			return this.size;
		}
		int i = 0;
		for(Datei eingabe: dateien){
			i = i + eingabe.zugriff();
		}
		return this.size + i;
	}

	public void add(Datei datei){
		this.dateien.add(datei);
	}

	public void remove(Datei datei){
		this.dateien.remove(datei);
	}

	public Datei get(int index){
		return (Datei) this.dateien.get(index);
	}

}