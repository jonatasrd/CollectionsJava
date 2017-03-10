package com.curso.collections;

public class TestaCursos {

	public static void main(String[] args) {
		// crie um novo curso passando o nome e instrutor no construtor
		// chame o getter da lista de aulas do curso e imprima o resultado
		
		Curso javaCollections = new Curso("Java 8", "Paulo Silveira");
		System.out.println(javaCollections.getAulas());
		
		
		javaCollections.adiciona(new Aula("Comecando com colecoes", 15));
		javaCollections.adiciona(new Aula("Aprendendo Listas", 20));
		javaCollections.adiciona(new Aula("Ordenando Listas", 25));
		
		System.out.println(javaCollections.getAulas());
	}
}
