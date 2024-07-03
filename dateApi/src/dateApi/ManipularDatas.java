package dateApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ManipularDatas {
	public static void main(String[] args) throws ParseException{
		Calendar cal = Calendar.getInstance();
		cal.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));
		
		cal.add(Calendar.DAY_OF_MONTH, 31);
		
		System.out.println("dia do mes Calendar get time: "+new SimpleDateFormat("dd-MM-yyyy").format(cal.getTime()) );
		
		cal.add(Calendar.MONTH, 1);
		
		System.out.println("Somando 1 mes  "+new SimpleDateFormat("dd-MM-yyyy").format(cal.getTime()) );
	}
}
