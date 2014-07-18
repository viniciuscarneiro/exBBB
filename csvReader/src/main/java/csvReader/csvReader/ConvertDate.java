package csvReader.csvReader;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ConvertDate {

	public static void main( String[] args )
    {
    	ConvertDate obj = new ConvertDate();
    	obj.run();
    }

	private void run() {
		
		Date endDate = new Date();
		
		System.out.println("Data sem formatação: " + endDate);
		
		Locale localeBR = new Locale("pt", "BR");    
		SimpleDateFormat fmt = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", localeBR);    
		System.out.println("Data com formatação: " + fmt.format(endDate) );
	}
}
