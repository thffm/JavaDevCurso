package dateApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Parcelas {

	public static void main(String[] args)  throws ParseException{
		Date date  = new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2021");
		
		Calendar cl =Calendar.getInstance();
		cl.setTime(date);
		
		for(int i = 0;i <= 12;i++) {
			cl.add(Calendar.MONTH, 1);
			
			/*long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-04-08"), LocalDate.parse(valor)); deixa queto */
			
			System.out.println("Parcela numero [ "+(i+1)+" ] = "+new SimpleDateFormat("dd/MM/yyyy").format(cl.getTime()));
		}
		

	}

}
