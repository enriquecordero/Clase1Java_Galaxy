package pe.edu.java.galaxy.cadenas;

public class AppRendimiento {

	public static void main(String[] args) {
		long inicio;
		long fin;
		final long CAN = 5_000_000; // Constante;

		
		
		String s = new String("");
		inicio = System.currentTimeMillis();
		for (int i = 0; i < CAN; i++) {
			s.concat("x");
		}
		fin = System.currentTimeMillis();
		System.out.println("String :"+(fin - inicio));
		
		
		
		
		StringBuffer sb = new StringBuffer("");
		inicio = System.currentTimeMillis();
		for (int i = 0; i < CAN; i++) {
			sb.append("x");
		}
		fin = System.currentTimeMillis();
		System.out.println("StringBuffer :"+(fin - inicio));
		
		StringBuilder sbi = new StringBuilder("");
		inicio = System.currentTimeMillis();
		for (int i = 0; i < CAN; i++) {
			sbi.append("x");
		}
		fin = System.currentTimeMillis();
		System.out.println("StringBuilder :"+(fin - inicio));


	}

}
