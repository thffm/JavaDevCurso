package dateApi;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MesAnoLocalDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(date.getDayOfMonth());
		System.out.println(date.plusDays(1));
		System.out.println(date.plusMonths(1));
	}

}
