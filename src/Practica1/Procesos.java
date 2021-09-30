package Practica1;

import java.io.*;

public class Procesos {
	public void ejecutar(String ruta,String link){

		ProcessBuilder pb;
		
		try {
			
			pb = new ProcessBuilder(ruta,link);
			
			Process start=pb.start();;


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void ejecutar(String ruta){

		ProcessBuilder pb;
		
		try {
			
			pb = new ProcessBuilder(ruta);
			
			Process start=pb.start();;


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}