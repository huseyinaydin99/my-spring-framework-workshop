package tr.com.huseyinaydin;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class ContextOlayBaslatmaIsleyicisi implements ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("ContextStartedEvent " + "(Context Olay Başlatma)");
	}
}