package thread;

import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;






public class Main {
	public  static void main(String[] args)  {
		System.out.println("Hello, World");
		Integer[][] array = {{1,2,3},{4,5,6}};
		
		
		
		
		
		
		Thread teste = new Thread(thd);
		teste.start();
		Thread teste2 = new Thread(thd2);
		teste2.start();
		
		new Thread() {
			
				public void run() {
					
				};
			
		}.start();
		
	
		
		for(int i = 0;i<array.length;i++) {
			System.out.println("Array pos["+i+"]");
			for(int j = 0;j < array[i].length;j++) {
				System.out.println("\tValor = "+array[i][j]);
			}
		}
		Integer[] l1 = array[0];
		/*List<String> listaInt = Arrays.asList(tex);*/
		
		
		
		JOptionPane.showMessageDialog(null, "Sistema continua executando");
	}
	
	private static Runnable thd2 = new Runnable() {
		Integer [] listas = {5,6,9,8};
		List<Integer> listaInta = Arrays.asList(listas);
		
		
		
		@Override
		public void run() {
			int c = 0;
			for(Integer num: listaInta) {
				c += 1;
				try {
					Thread.sleep(2000);
					System.out.println("TImer: "+c);
					System.out.println("Valor de ["+num+"] * ["+num+"] = "+num*num);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				
			}
			
		}
	};
	private static Runnable thd = new Runnable() {
		String[] tex =  {"Eu","Amo","Vitoria","Dos","Anjos"};
		
		
		@Override
		public void run() {
			for(int i = 0;i<tex.length;i++) {
				try {
					Thread.sleep(2000);
					System.out.println("["+tex[i]+"]");
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}

		
		
	};

}
