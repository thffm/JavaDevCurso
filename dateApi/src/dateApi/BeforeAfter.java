package dateApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BeforeAfter {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimento = fmt.parse("10/04/2021");
		
		Date dataHoje = fmt.parse("07/04/2021");
		
		if(dataVencimento.after(dataHoje)) {
			System.out.println("nao passou da data ");
		}
		else {
			System.out.println("Boleto  vencido");
		}
	}

}