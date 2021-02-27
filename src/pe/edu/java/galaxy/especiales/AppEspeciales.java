package pe.edu.java.galaxy.especiales;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AppEspeciales {

	public static void main(String[] args) {
		
	
	boolean sw = false;
	Boolean sw1 = true;
	Boolean sw2 = new Boolean(true);
	
	System.out.println(sw);
	System.out.println(!sw1);

	BigInteger be = new BigInteger("4554785222112");
	System.out.println(be);

	BigDecimal bd = new BigDecimal("4554785222112.145552522");
	System.out.println(bd);

	int cantidad= 634_787_427;
	int cantidad1= 634_787_427;
	
	System.out.println(cantidad);
	System.out.println(cantidad1);

}
}