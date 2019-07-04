package wwwww;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(dt));
		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.format(5464864135651.84415));
		
		DecimalFormat df = new DecimalFormat("\u00A4######000,000.00'Ôª'");
		// \u2030Ç§·Ö  \u00A4 »õ±Ò·ûºÅ
		System.out.println(df.format(5614.8818));
	}
}
