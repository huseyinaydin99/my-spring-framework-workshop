package tr.com.huseyinaydin;

import org.springframework.context.*;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class CustomOlayIsleyicisi implements ApplicationListener<CustomOlay> {

	public void onApplicationEvent(CustomOlay event) {
		System.out.println(event.toString() + " İşlendi");
	}
}