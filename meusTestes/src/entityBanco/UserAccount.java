package entityBanco;

import java.time.LocalDate;
import java.util.Objects;

public class UserAccount {
	private String name;
	private String number;
	private LocalDate createdAt;
	
	public UserAccount(String name, String number, LocalDate createdAt) {
		super();
		this.name = name;
		this.number = number;
		this.createdAt = createdAt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "UserAccount [name=" + name + ", number=" + number + ", createdAt=" + createdAt + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdAt, name, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAccount other = (UserAccount) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(name, other.name)
				&& Objects.equals(number, other.number);
	}
	
	
	
	
}
