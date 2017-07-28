/**
 * 
 */
package br.com.rpires.pessoal.arvore.binaria;

/**
 * @author rpires
 *
 */
/**
 * @author rpires
 *
 */
public class Node {
	
	private Node esquerdo;
	private Node direitor;
	private int valor;

	public Node(int valor) {
		this.valor = valor;
	}

	public Node getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(Node esquerdo) {
		this.esquerdo = esquerdo;
	}

	public Node getDireitor() {
		return direitor;
	}

	public void setDireitor(Node direitor) {
		this.direitor = direitor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	

}
