package com.curso.collections;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaCollections = new Curso("Java 8", "Paulo Silveira");

		javaCollections.adiciona(new Aula("Comecando com colecoes", 15));
		javaCollections.adiciona(new Aula("Aprendendo Listas", 20));
		javaCollections.adiciona(new Aula("Ordenando Listas", 25));
		
		javaCollections.matricula(new Aluno("Jonatas", 88));
		javaCollections.matricula(new Aluno("Paulo", 22));
		javaCollections.matricula(new Aluno("Pedro", 43));
		javaCollections.matricula(new Aluno("Fernando", 55));
		
		System.out.println(javaCollections.getAlunos());
		
		System.out.println("");

		//iterando com Lambda do Java 8 
		javaCollections.getAlunos().forEach(aluno -> System.out.println(aluno));
		
		Aluno turini = new Aluno("Jonatas", 34672);
		System.out.println("\nE esse Jonatas, esta matriculado?");
		System.out.println(javaCollections.estaMatriculado(turini));
		
	}
}
