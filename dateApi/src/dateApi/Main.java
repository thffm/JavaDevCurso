package dateApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;



public class Main {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		
		/*SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");banco de dados*/
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat fmtSql = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Date em milisegundos["+date.getTime()+"]");
		System.out.println("Dia do mes ["+date.getDate()+"]");
		/*JOptionPane.showMessageDialog(null, "Dia da semana["+date.getDay()+"]");*/
		System.out.println(date.getYear());
		System.out.println("Data formatada [" + fmt.format(date) + "]");
		System.out.println("Data para sql ["+fmtSql.format(date)+"]");
		System.out.println(fmtSql.parse("1987-10-18"));

	}

}
