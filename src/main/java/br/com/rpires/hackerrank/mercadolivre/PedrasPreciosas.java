/**
 * 
 */
package br.com.rpires.hackerrank.mercadolivre;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Rodrigo Pires
 *
 */
public class PedrasPreciosas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numeroColecao = in.nextInt();
		List<String> colecoes = new ArrayList<String>();
		List<String> colecoesCompare = new ArrayList<String>();
		for(int i = 0; i < numeroColecao; i++) {
			String str = in.next();
			colecoes.add(str);
			colecoesCompare.add(str);
		}
		
		Set<String> pedrasEncontradas = new HashSet<String>();
		for (String pedra : colecoes) {
			colecoesCompare.remove(pedra);
			compararPedrasIguais(pedra, colecoesCompare, pedrasEncontradas);
		}
		System.out.println(pedrasEncontradas.size());
		pedrasEncontradas.clear();
	}
	
	public static void compararPedrasIguais(String pedraA, List<String> colecaoB, Set<String> pedrasEncontradas) {
		if (colecaoB.size() > 0) {
			for (int i = 0; i < pedraA.length(); i++) {
				String letraA = pedraA.substring(i, i+1);
				//boolean pedraPreciosa = false;
				int qtdEncontrada = 0;
				for (String pedraB : colecaoB) {
					for (int j = 0; j < pedraB.length(); j++) {
						String letraB = pedraB.substring(j, j+1);
						if (letraA.equals(letraB)) {
							//pedraPreciosa = true;
							qtdEncontrada++;
							break;
						}
					}
				}
				if (qtdEncontrada == colecaoB.size()) {
					pedrasEncontradas.add(letraA);
				}
			}
		}
	}

}
