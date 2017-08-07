package br.com.rpires.hackerrank.pagseguro.uol;

public class Teste2 {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		//b = c;
		newPrint(b);
	}

	private static void newPrint(A a) {
		// TODO Auto-generated method stub
		
	}
}

class A {
	public void printName() {
		System.out.println("A");
	}
}

class B extends A {
	public void printName() {
		System.out.println("B");
	}
}

class C extends A {
	public void printName() {
		System.out.println("C");
	}
}
