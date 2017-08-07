/**
 * 
 */
package br.com.rpires.hackerrank.pagseguro.uol;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Rodrigo Pires
 *
 */

/*
 * 1 input: quantidade de pessoas
 * 2 input: quantidade de tipos de guardachuva
 * 
 * Dependendo da quantidade de tipos de guardachuvas você vai digitar.
 * Exemplo:
 *  se tenho 3 tipos de guarda-chuvas então vou receber 3 inteiros que representam o tanhao de cada tipo.
 *  
 *  Então tenho que saber a quantidade exata de guarda chuvas que tenho que comprar. A quantidade de pessoas deve ser exata dentro do guarda chuva
 *  EX: tenho 8 pessoas e 2 tipos de guarda chuvas, o primeiro cabem 2 pessoas, e o ultimo cabem 4 pessoas. Então o numero de guarda chuvas a ser comprado é 2 com 4 lugares.
 *  
 *  Caso a divisão não fique correta o retorn deve ser -1.
 */
public class Guardachuvas {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		//final String fileName = System.getenv("TMP");
		//BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		int res;
		int _n;
		_n = Integer.parseInt(in.nextLine().trim());
		
		int _p_size = 0;
		_p_size = Integer.parseInt(in.nextLine().trim());
		int[] _p = new int[_p_size];
		int _p_item;
		for (int _p_i = 0; _p_i < _p_size; _p_i++) {
			_p_item = Integer.parseInt(in.nextLine().trim());
			_p[_p_i] = _p_item;
		}
		
		res = getUmbrellas(_n, _p);
		//bw.write(String.valueOf(res));
		//bw.newLine();
		//bw.close();
		in.close();
		System.out.println(res);
	}

	private static int getUmbrellas(int _n, int[] _p) {
		int count = 0;
		for (int i = 0; i < _p.length; i++) {
			int tipo = _p[i];
			int qtd = (_n/tipo);
			if(qtd % _n == 0) {
				count++;
			}
		}
		return -1;
	}
	
}
