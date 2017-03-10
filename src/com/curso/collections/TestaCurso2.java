package com.curso.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaCollections = new Curso("Java 8", "Paulo Silveira");
		System.out.println(javaCollections.getAulas());

		javaCollections.adiciona(new Aula("Comecando com colecoes", 15));
		javaCollections.adiciona(new Aula("Aprendendo Listas", 20));
		javaCollections.adiciona(new Aula("Ordenando Listas", 25));
		
		System.out.println(javaCollections.getAulas());
		
		List<Aula> aulasImutaveis = javaCollections.getAulas();
		ArrayList<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		
		System.out.println(aulas);
		System.out.println("Duracao total das aulas é de: " + javaCollections.getTempoTotal());
		
		//metodo usando o Java 8
		System.out.println("Duracao total das aulas é de: " + javaCollections.getTempoAulas());
		
		System.out.println(javaCollections);
		
	}
}
