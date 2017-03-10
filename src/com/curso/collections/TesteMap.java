package com.curso.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		
		//iterando apenas nas chaves
		Set<String> chaves = nomesParaIdade.keySet();    
		for (String nome : chaves) {
		    System.out.println(nome);
		}
		
		//iterando apenas nos valores
		Collection<Integer> values = nomesParaIdade.values();
		for (Integer idade : values) {
			System.out.println(idade);
		}
		
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		for (Entry<String, Integer> associacao : associacoes) {
			System.out.println(associacao.getKey() + " : " + associacao.getValue());
		}
	}

}
