package meusTestes;

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
		
		
		
	}

}
