package testeJava;


import java.util.Arrays;
import java.util.List;

public class Main {
	public  static void main(String[] args) {
		System.out.println("Hello, World");
		Integer[][] array = {{1,2,3},{4,5,6}};
		Integer [] listas = {5,6,9,8};
		String[] tex =  {"Eu","Amo","Vitoria","Dos","Anjos"};
		
		for(int i = 0;i<array.length;i++) {
			System.out.println("Array pos["+i+"]");
			for(int j = 0;j < array[i].length;j++) {
				System.out.println("\tValor = "+array[i][j]);
			}
		}
		Integer[] l1 = array[0];
		List<String> listaInt = Arrays.asList(tex);
		List<Integer> listaInta = Arrays.asList(array[0]);
		for(Integer num: listaInta) {
			System.out.println("Valor de ["+num+"] * ["+num+"] = "+num*num);
		}
	}

}