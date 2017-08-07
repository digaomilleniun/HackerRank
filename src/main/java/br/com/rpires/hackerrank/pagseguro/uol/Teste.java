/**
 * 
 */
package br.com.rpires.hackerrank.pagseguro.uol;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Rodrigo Pires
 *
 */
public class Teste {
	public static void main(String [] args) throws InterruptedException, ExecutionException {
		int x = 0;
		/*
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
            Runnable worker = new WorkerThread(x);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads:" + x);*/
		ExecutorService executor = Executors.newFixedThreadPool(5);
		WorkerThread2 work = new WorkerThread2(x);
		Future<Integer> future = executor.submit(work);
        while (!future.isDone()) {
              System.out.println("A tarefa ainda não foi processada!");
              Thread.sleep(1); // sleep for 1 millisecond before checking again
        }
        System.out.println("Tarefa completa!");
        long factorial = future.get();
        System.out.println("O número gerado foi: " + factorial);
        executor.shutdown();
	}

}
 class WorkerThread implements Runnable {
	 int x;
	 public WorkerThread(int x) {
		 this.x = x;
	 }
	
	 public void run(){
		 for (int i = 0; i < 10000000; i++) {
			x = x+1;
		}
	 }
}
 
 class WorkerThread2 implements Callable<Integer> {
	 int x;
	 
	 public WorkerThread2(int x) {
		 this.x = x;
	 }
	
	@Override
	public Integer call() throws Exception {
		
		 for (int i = 0; i < 10000000; i++) {
				x = x+1;
		}
		 return x;
	}
}
