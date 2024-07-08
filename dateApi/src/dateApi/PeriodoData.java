package dateApi;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PeriodoData {
	public static void main(String[] args)  throws ParseException, InterruptedException{
		
			LocalDate dataAntiga = LocalDate.of(2020, 2, 7);
			LocalDate dataNova = LocalDate.of(2021, 7, 4);
			LocalDate data = LocalDate.parse("2020-01-10");
			List<LocalDate> parcelas = new ArrayList<>();
			
			System.out.println("Data antiga maior que a data nova: "+dataAntiga.isAfter(dataNova));
			System.out.println("Data antiga menor que a nova: "+dataAntiga.isBefore(dataNova));
			
			Period periodo = Period.between(dataAntiga, dataNova);
			System.out.println(periodo.getDays());
			System.out.println(periodo.getMonths());
			System.out.println(data.plusDays(5));
			System.out.println(data.plusMonths(1));
			
			for(int i = 0;i<=11;i++) {
				parcelas.add(data.plusMonths(i));
			}
			
			for(LocalDate parcela: parcelas) {
				System.out.println(parcela.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			}
		
	}
}
