package tr.com.huseyinaydin;

import java.util.Properties;															

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Ayar {

	private Properties properties;

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "SONUÇ : " + properties;
	}

	public void sonucuYaz() {
		System.out.println(properties.toString());
	}
}