package lerAqruivos;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class TabelaExcelApache {
	public static void main(String[] args) throws Exception{
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		
		
		p1.setNome("Thiago");
		p2.setNome("Vitoria");
		p1.setEmail("th@gmail");
		p2.setEmail("VitoriaAnjoDeThiago@gmail.com");
		
		File file = new File("/home/ltth/eclipse-workspace/lerAqruivos/src/lerAqruivos/arquivo.xls");
		
		if(! file.exists()) {
			file.createNewFile();
		}
		int numeroLinha =0;
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
		HSSFSheet linhasPessoas = hssfWorkbook.createSheet("Planilha de Pessoas");
		Row linhax = linhasPessoas.createRow(numeroLinha++);
		Cell celNomeHead = linhax.createCell(0);
		celNomeHead.setCellValue("Nome");
		Cell celEmailHead = linhax.createCell(1);
		celEmailHead.setCellValue("Email");
		for(Pessoa p: pessoas) {
			Row linha = linhasPessoas.createRow(numeroLinha++);/*cria linha*/
			
			int celula = 0;
			Cell celNome = linha.createCell(celula++);
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula++);
			celEmail.setCellValue(p.getEmail());
			
		}
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		System.out.println("Planilha foi criada");
		
	}
}
