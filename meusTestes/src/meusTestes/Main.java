package meusTestes;

import java.time.LocalDate;


import banco.BancoFrancis;
import entityBanco.PenDrive;
import entityBanco.UserAccount;
import entityBanco.UserAdmin;
import entityBanco.nuBank;
import interfaceBanco.KeyAdmin;
import oop.Pessoa;
import oop.PessoaAdmin;

public class Main {

	public static void main(String[] args) {
		Pessoa user = new Pessoa("thiago", "314789");
		PessoaAdmin userAdmin = new PessoaAdmin("th Admin", "707070", 44);
		System.out.println(user.toString());
		System.out.println(userAdmin.toString());
		
		userAdmin.Admin(true);
		Pessoa th = userAdmin;
		userAdmin.setAdmin(false);
		
		if(userAdmin.getAccessAdmin()) {
			System.out.println("Quebrei o codigo kkkk");
			
		}
		
		nuBank nu = new nuBank();
		BancoFrancis francisco = new BancoFrancis(nu);
		
		System.out.println(francisco.TaxValue(2000));
		
		KeyAdmin penDrive = new PenDrive();
		
		UserAdmin banco = new UserAdmin("thiago", "215115", LocalDate.now(), penDrive);
		banco.setToken(true);
		
		if(!banco.getToken() || banco.getToken() == null) {
			System.out.println("Token invalido");
		}else {
			System.out.println("Voce tem acesso ao token");
			System.out.println(banco.toString());
		}
		
		
	}

}
