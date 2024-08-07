package AulaJanelaGrafica;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class implementacaoFilaThread  extends Thread{
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread obeFilaThread) {
		pilha_fila.add(obeFilaThread);
	}
	
	@Override
	public void run() {
		System.out.println("Ta rodando");
		while(true) {
			Iterator iteracao = pilha_fila.iterator();
			synchronized (iteracao) { /*Bloqueio */
				
				while(iteracao.hasNext()) {
					
					ObjetoFilaThread procesar = (ObjetoFilaThread) iteracao.next();
					
					System.out.println("--------------------------------");
					System.out.println(procesar.getEmail() + "-_----_- "+procesar.getNome());
					
					iteracao.remove();
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
			}
		}
		
		
		
		
		
		
		
	
	}
	
	

}
