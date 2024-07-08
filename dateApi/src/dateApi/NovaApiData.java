package dateApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NovaApiData {
	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		LocalTime horaAtual = LocalTime.now();
		LocalDateTime fullDate = LocalDateTime.now();
		
		System.out.println(dataAtual);
		System.out.println(horaAtual);
		System.out.println(fullDate);
		System.out.println(fullDate.format(DateTimeFormatter.ISO_DATE));
		System.out.println(fullDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
	}
}
