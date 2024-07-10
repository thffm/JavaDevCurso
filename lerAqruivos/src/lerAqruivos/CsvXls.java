package lerAqruivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvXls {
	public static void main(String[] args) throws IOException{
		File arquivo = new File("/home/ltth/eclipse-workspace/lerAqruivos/src/lerAqruivos/arquivo.csv");
		File nota = new File("/home/ltth/eclipse-workspace/lerAqruivos/src/lerAqruivos/nota.txt");
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		p1.setNome("Thiago");
		p2.setNome("Vitoria");
		p1.setEmail("th@gmail");
		p2.setEmail("VitoriaAnjoDeThiago@gmail.com");
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		if(!nota.exists()) {
			nota.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		FileWriter escreva = new FileWriter(nota);
		pessoas.add(p1);
		pessoas.add(p2);
		/*escrever_no_arquivo.write("Meu texto do arquivo");
		escrever_no_arquivo.write("\n");
		escrever_no_arquivo.write("Minha segunda linha \n");
		*/
		
		
		for(Pessoa p: pessoas) {
			escreva.write(p.getNome()+","+p.getEmail()+"\n");
		}
		
		/*for(int i = 0;i<=10;i++) {
			escrever_no_arquivo.write("Texto da minha linha ["+i+"]\n");
		}
		*/
		
		for(Pessoa p: pessoas) {
			escrever_no_arquivo.write(p.getNome()+";"+p.getEmail()+"\n");
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
		escreva.flush();
		escreva.close();
	}
}
