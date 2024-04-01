package treinamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listas {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>(); //list amarelo variavel
		
		list.add("maria");// add a lista
		list.add("carlos");
		list.add("walter");
		list.add("tulio");
		list.add("pietro");
		list.add("ana");
		list.add(2,"marco");// add a posição 2 e os outros vão para baixo
		
		System.out.println(list.size());// ver tamanho da lista
		
		list.remove("maria"); //remover
		list.remove(3);
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------");
		list.removeIf(x -> x.charAt(0) == 'p'); //remove todos que tenha p no inicio
		
		System.out.println(list.indexOf("tulio"));// mostra a posição do tulio
		
		
		
		
		// cria uma nova lista e deixa só quem começar com c
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'c').collect(Collectors.toList());
		
		// primeiro elemento que começa com c
		String name = list.stream().filter(x -> x.charAt(0) == 'c').findFirst().orElse(null);
		
		sc.close();

	}

}
