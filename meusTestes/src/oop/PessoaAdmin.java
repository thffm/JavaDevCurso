package oop;

import java.util.Objects;

public class PessoaAdmin  extends Pessoa implements Acesso{
	
	private Integer horario;
	private Boolean acesso;

	public PessoaAdmin(String name, String number, Integer horario) {
		super(name, number);
		this.horario = horario;
	}
	
	@Override
	public Boolean Admin(Boolean access) {
		// TODO Auto-generated method stub
		return access;
	}
	
	public void setAdmin(Boolean access) {
		acesso =  Admin(access);
	}
	
	public  Boolean getAccessAdmin() {
		return acesso;
	}
	

	public Integer getHorario() {
		return horario;
	}

	public void setHorario(Integer horario) {
		this.horario = horario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(horario);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaAdmin other = (PessoaAdmin) obj;
		return Objects.equals(horario, other.horario);
	}

	@Override
	public String toString() {
		
		return super.toString()+ "  Admin [getHorario()=" + getHorario() + "]";
	}

	
	
	
	
	

}
