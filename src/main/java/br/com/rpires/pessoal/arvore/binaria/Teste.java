/**
 * 
 */
package br.com.rpires.pessoal.arvore.binaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rpires
 *
 */
public class Teste {

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		ArvoreBinaria ar = construirArvore();
		ar.imprimir();
	}

	private static ArvoreBinaria construirArvore() {
		ArvoreBinaria ar = null;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Digite o número que será o node master.\n");
			String master = in.readLine();			
			System.out.print("Digite os números separados por vírgula para montar a árvore binária:\n");
			String str = in.readLine();
			String[] valores = str.split(",");
			
			ar = new ArvoreBinaria(Integer.valueOf(master));
			for (int i = 0; i < valores.length; i++) {
				ar.inserirNode(Integer.parseInt(valores[i]));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ar;
	}

}
