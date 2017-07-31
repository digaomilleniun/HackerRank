/**
 * 
 */
package br.com.rpires.hackerrank.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Rodrigo Pires
 *
 *         EX: Is This a Binary Search Tree?
 *
 */
public class Trees {

	static boolean checkBST(Node root) {
		boolean result = true;
		
		result = checkBSTLeft(root, root.data, result);
		
		return result;
	}
	
	static boolean checkBSTLeft(Node node, int data, boolean result) {
		while (result == true) {
			if (node.left != null) {
				if (node.left.data >= data) {
					result = false;
					break;
				} else if (node.left.data < data) {
					//checkBSTLeft(node.left);
					
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Digite o numero que sera o node master.\n");
		String master = in.readLine();			
		System.out.print("Digite os numeros separados por virgula para montar a arvore binaria:\n");
		String str = in.readLine();
		String[] valores = str.split(",");
		
		Node node = criarNode(master, str, valores);
		boolean result = checkBST(node);
		System.out.println(result);
	}

	private static Node criarNode(String master, String str, String[] valores) {
		Node nodeMaster = new Node(Integer.parseInt(master));
		for (int i = 0; i < str.length(); i++) {
			nodeMaster.inserirNode(Integer.parseInt(valores[i]));
		}
		return nodeMaster;
	}
}

class Node {
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void inserirNode(int data) {
		inserirNode(this, data);
	}
	
	private void inserirNode(Node node, int data) {
		if (data < node.data) {
			if (node.left != null) {
				inserirNode(node.left, data);
			} else {
				node.left = new Node(data);
			}
		} else {
			if (node.right != null) {
				inserirNode(node.right, data);
			} else {
				node.right = new Node(data);
			}
		}
	}
}
