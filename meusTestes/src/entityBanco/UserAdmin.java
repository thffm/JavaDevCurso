package entityBanco;

import java.time.LocalDate;

import interfaceBanco.KeyAdmin;

public class UserAdmin extends UserAccount {
	private KeyAdmin keyAdmin;
	private Boolean token;
	public UserAdmin(String name, String number, LocalDate createdAt,KeyAdmin keyAdmin) {
		super(name, number, createdAt);
		this.keyAdmin = keyAdmin;
		// TODO Auto-generated constructor stub
	}
	
	
	public void setToken(Boolean key) {
		token = keyAdmin.token(key);
		
	}
	
	public Boolean getToken() {
		return this.token;
	}


	@Override
	public String toString() {
		
		return super.toString()+" -- UserAdmin [keyAdmin=" + keyAdmin+ ", token=" + token + "]";
	}
	

	

}
