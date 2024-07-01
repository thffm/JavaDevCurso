package dateApi;

import java.util.Date;

import javax.swing.JOptionPane;



public class Main {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("Date em milisegundos["+date.getTime()+"]");
		System.out.println("Dia do mes ["+date.getDate()+"]");
		JOptionPane.showMessageDialog(null, "Dia da semana["+date.getDay()+"]");
		System.out.println(date.getYear());

	}

}
