package oop;

import java.util.Objects;

public class Pessoa {
	private String name;
	private String number;
	
	
	public Pessoa(String name, String number) {
		super();
		this.name = name;
		this.number = number;
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


	@Override
	public int hashCode() {
		return Objects.hash(name, number);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(name, other.name) && Objects.equals(number, other.number);
	}


	@Override
	public String toString() {
		return "Pessoa [getName()=" + getName() + ", getNumber()=" + getNumber() + "]";
	}
	
	
	
}
