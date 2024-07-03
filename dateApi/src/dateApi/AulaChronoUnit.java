package dateApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class AulaChronoUnit {

	public static void main(String[] args)  throws ParseException{
		/*Date dataValue = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");*/
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2024-02-01"),LocalDate.now());
		

		System.out.println("Possui [ "+dias+" ]" +"entre a faixa de data");
	}

}
