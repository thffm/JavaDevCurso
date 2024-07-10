package entityWork;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
	private String name;
	private LocalDateTime date;
	private int priority;
	private Boolean check = false;
	
	public Task(String name, LocalDateTime date, int priority) {
		super();
		this.name = name;
		this.date = date;
		this.priority = priority;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Boolean getCheck() {
		return check;
	}

	public void setCheck(Boolean check) {
		this.check = check;
	}
	
	
	public void info() {
		String dataf = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		if(!getCheck()) {
			System.out.println( String.format("Nome: %S | Prioridade: %d | Criado em: %s []",getName(),getPriority(),dataf));
		}else {
			System.out.println( String.format("Nome: %S | Prioridade: %d | Criado em: %s [x]",getName(),getPriority(),dataf));
		}
		
	}
	
	
	
}
