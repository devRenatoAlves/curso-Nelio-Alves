package curso_programacao;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		//%f = Ponto Flutuante
		//%d = inteiro
		//%s = texto
		//%n = quebra de linha 
		//%c = usado para char
		
		
		/*int y = 32;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n" , x);
		System.out.println("Hello, World!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n" , x);
		System.out.println("Resultado = " + x + " METROS");
		System.out.printf("Resultado = %.2f METROS%n", x);
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d e ganha %.2f", nome, idade, renda);*/
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println ("Products: ");
		System.out.printf ("%s, which price is $ %.1f%n", product1, price1);
		System.out.printf ("%s, which price is $ %.2f%n", product2, price2);
		System.out.println ("");
		System.out.printf ("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println ("");
		System.out.printf ("Measue with eight decimal places: %f%n", measure);
		System.out.printf ("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf ("US decimal point: %.3f", measure);
		
		

	}

}
