package pe.edu.java.galaxy.fechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AppFecha {
	
	public static void main(String[] args) {
		
		
		Date fecha = new Date();
		System.out.println(fecha);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(fecha));
		
		
		
	}

}
