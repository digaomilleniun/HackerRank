/**
 * 
 */
package br.com.rpires.pessoal.arvore.binaria;

/**
 * @author rpires
 *
 */
public class ArvoreBinaria {

	private Node nodeRaiz;
	
	public ArvoreBinaria(int nodeRaiz) {
		this.nodeRaiz = new Node(nodeRaiz);
	}
	
	public void inserirNode(int valor) {
		inserir(nodeRaiz, valor);
	}
	
	private void inserir(Node node, int valor) {
		if (valor < node.getValor()) {
			if (node.getEsquerdo() != null) {
				inserir(node.getEsquerdo(), valor);
			} else {
				System.out.println("  Inserindo " + valor + " a esqueda de " + node.getValor());
                node.setEsquerdo(new Node(valor));
			}
		} else if (valor > node.getValor()) {
			if (node.getDireitor() != null) {
                inserir(node.getDireitor(), valor);
            } else {
                System.out.println("  Inserindo " + valor + " a direita de " + node.getValor());
                node.setDireitor(new Node(valor));
            }
		}
	}
	
	public void imprimir() {
		System.out.println("------Imprimindo Node pré-fixado------");
		imprimirNodePreFixado(nodeRaiz);
		System.out.println("------Imprimindo Node pós-fixado------");
		imprimirNodePosFixado(nodeRaiz);
		System.out.println("------Imprimindo Node em Ordem------");
		imprimirNodeEmOrdem(nodeRaiz);
	}

	private void imprimirNodePreFixado(Node node) {
		if (node != null) {
			System.out.println(node.getValor());
			imprimirNodePreFixado(node.getEsquerdo());
			imprimirNodePreFixado(node.getDireitor());
		}
	}
	
	public void imprimirNodePosFixado(Node node) {
        if(node != null){
        	imprimirNodePosFixado(node.getEsquerdo());
        	imprimirNodePosFixado(node.getDireitor());
        	System.out.println(node.getValor());
        }
    }
	
	public void imprimirNodeEmOrdem(Node node) {
        if(node != null){
        	imprimirNodeEmOrdem(node.getEsquerdo());
        	System.out.print(node.getValor() + " ");
        	imprimirNodeEmOrdem(node.getDireitor());
        }
    }

}
