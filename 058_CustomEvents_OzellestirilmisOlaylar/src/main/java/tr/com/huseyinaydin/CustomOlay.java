package tr.com.huseyinaydin;

import org.springframework.context.ApplicationEvent;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class CustomOlay extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public CustomOlay(Object source) {
		super(source);
	}

	public String toString() {
		return "Custom Event (Özelliştirilmiş Olay)";
	}
}