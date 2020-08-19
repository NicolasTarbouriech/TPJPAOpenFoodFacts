package utils;
import org.apache.commons.lang3.math.NumberUtils;
public class Convertisseur {

	
	public static Double toDouble(String value) {
		if (NumberUtils.isDigits(value)) {
			return Double.parseDouble(value);
		}
		return null;
	}
	
	public static Integer toInt(String value) {
		if (NumberUtils.isDigits(value)) {
			return Integer.parseInt(value);
		}
		return null;
	}

}
