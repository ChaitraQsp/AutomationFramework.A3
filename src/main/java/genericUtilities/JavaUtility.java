package genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class conists of generic methods related to Java
 * @author Chaitra M
 *
 */
public class JavaUtility {
	
	/**
	 * this method will generate system date in a given format
	 * @return
	 */
	public String getDate()
	{
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
		String date = f.format(d);
		return date;
	}

}
