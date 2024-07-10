package lerAqruivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt  {

	public static void main(String[] args)  throws FileNotFoundException{
		FileInputStream entradaAr = new FileInputStream(new File("/home/ltth/eclipse-workspace/lerAqruivos/src/lerAqruivos/arquivo.txt"));
		FileInputStream inputFrined = new FileInputStream(new File("/home/ltth/eclipse-workspace/lerAqruivos/src/lerAqruivos/nota.txt"));
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Scanner lerArquivo = new Scanner(entradaAr,"UTF-8");
		Scanner lerinput = new Scanner(inputFrined,"UTF-8");
		
		
		while(lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			
			if(linha != null && ! linha.isEmpty()) {
				String[] dados = linha.split(";");
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoas.add(pessoa);
				
			}
			
			
		}
		
		
		while(lerinput.hasNext()) {
			String linha = lerinput.nextLine();
			
			
			if(linha != null && ! linha.isEmpty()) {
				String[] dados = linha.split(",");
				for(String text : dados) {
					System.out.printf(text+" ");
				}
				System.out.println();
					
				
			}
		}

	}

}
