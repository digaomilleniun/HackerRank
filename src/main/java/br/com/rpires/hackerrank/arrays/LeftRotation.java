/**
 * 
 */
package br.com.rpires.hackerrank.arrays;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author rpires
 *
 */
/*
 * Deve-se renomear o nome da classe para Solution e remover o package para não dar erro na hora de fazer o upload no site Hacker Rank
 */
public class LeftRotation {

	public static void main(String[] args) throws IOException {
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.print("Digite a quantidade de números.");
		//String qtdNum = in.readLine();			
		//System.out.print("Digite a quantidade de rotações.");
		//String qtdRot = in.readLine();
		//System.out.print("Digite os números.");
		//String numeros = in.readLine();
		
		//String[] valores = numeros.split(",");
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
		
		//int n = Integer.parseInt(qtdNum);
		//int k = Integer.parseInt(qtdRot);
		//int a[] = new int[n];
		
		for (int a_i = 0; a_i < n; a_i++) {
			//a[a_i] = Integer.parseInt(valores[a_i]);
			a[a_i] = in.nextInt();
		}

		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		for (int i = 0; i < n; i++)
			System.out.print(output[i] + " ");

		System.out.println();
	}

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		int[] aux = new int[n];
		for (int i = 0; i < k; i++) {
			int posiAtual = a[0];
			for (int j = 1; j < n; j++) {
				aux[j-1] = a[j];
			}
			aux[n-1] = posiAtual;
			a = aux;
		}
		return a;
	}

}
