package dateApi;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class Instante {
	public static void main(String[] args) throws ParseException, InterruptedException {
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		Instant end = Instant.now();
		Duration duracao = Duration.between(inicio, end);
		
		System.out.println("Duracao em nano segundos: "+duracao.toNanos());
		System.out.println("Duracao em segundos: "+duracao.toSeconds());
	}
}
