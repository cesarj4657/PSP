package Practica1;
import java.io.*;
import java.lang.ProcessBuilder.*;
import java.util.*;
public class Main {
	public static void main(String[]args){
		ArrayList<String> programas = new ArrayList<String>();
		ArrayList<String> rutas = new ArrayList<String>();
		
		Procesos lp = new Procesos();
		
		programas.add("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		
		rutas.add("google.com");
		rutas.add("facebook.com");
		rutas.add("https://sasr.educamos.com/");
		
		for(String x : rutas) {
			lp.ejecutar(programas.get(0),x);
		}
		

		System.out.println("Finalizado");
	}
}

