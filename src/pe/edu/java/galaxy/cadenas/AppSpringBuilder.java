package pe.edu.java.galaxy.cadenas;

public class AppSpringBuilder {
	
	public static void main(String[] args) {
		
		
		
		StringBuilder s = new StringBuilder("Java ");
		
		System.out.println(s.append("11"));
		
		
		System.out.println(s.insert(5, " Web "));
		
		System.out.println(s.replace(5,9, "Movil"));
		
		System.out.println(s.delete(5, 11));
		
		System.out.println(s.reverse());
		
		
		
		
	
}

}
