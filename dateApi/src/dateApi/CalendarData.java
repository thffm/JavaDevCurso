package dateApi;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarData {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Calendar em milisegundos["+date.get(Calendar.MILLISECOND)+"]");
		System.out.println("Dia do mes ["+date.get(Calendar.DAY_OF_MONTH)+"]");
		/*JOptionPane.showMessageDialog(null, "Dia da semana["+date.getDay()+"]");*/
		System.out.println(date.get(Calendar.DAY_OF_WEEK ) -1);
		System.out.println(fmt.format(Calendar.getInstance().getTime()));
		
		/*System.out.println("Data formatada [" + fmt.format(date) + "]");
		System.out.println("Data para sql ["+fmtSql.format(date)+"]");
		System.out.println(fmtSql.parse("1987-10-18"));*/

	}

}
