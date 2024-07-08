package banco;

import java.util.ArrayList;
import java.util.List;

import entityBanco.UserAccount;
import interfaceBanco.Tax;

public class BancoFrancis {
	private Tax taxService;
	private List<UserAccount> userAccounts = new ArrayList<UserAccount>();
	
	public BancoFrancis(Tax tax) {
		super();
		this.taxService = tax;
	}
	
	public double TaxValue(double amount) {
		double taxa = taxService.taxService(amount);
		return amount - taxa;
	}
	
	
	
	
	
	
}
