package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("anna","bernd","clara");
		
		
		//Aufgabe 1 (mit Methodenreferenz)
		List<String> namesInUpperCase = names.stream()
										.map(String :: toUpperCase)
										.collect(Collectors.toList());
		
		//Aufgabe 1 (mit Lambda)
		List<String> namesInUpperCaseLambda = names.stream()
												.map(name -> name.toUpperCase())
												.collect(Collectors.toList());
		
		
	System.out.println(namesInUpperCase);
	System.out.println(namesInUpperCaseLambda);
	
	
	
	// Aufgabe 2
	
	
		List<Integer> zahlen = Arrays.asList(1,2,3,4,5);
		
		List<Integer> geradeZahlen = zahlen.stream()
										.filter( n -> n % 2 != 0)
										.collect(Collectors.toList());

		System.out.println(geradeZahlen);
	
		
		
	// Aufgabe 3
		int produkt = zahlen.stream()
						    .reduce(1, (a, b) -> a * b );
		
		System.out.println(produkt);
		
		
		
	// Aufgabe 4
		
		List<Product> produkte = Arrays.asList(
			    new Product("Laptop", 1200),
			    new Product("Tastatur", 45),
			    new Product("Monitor", 250),
			    new Product("Maus", 30),
			    new Product("Headset", 80)
			);
		
	List<Product> Products = produkte.stream()
				.filter( n -> n.getPrice() >= 50)
				.collect(Collectors.toList());
	
	System.out.println(Products);
		

		
	}



}
