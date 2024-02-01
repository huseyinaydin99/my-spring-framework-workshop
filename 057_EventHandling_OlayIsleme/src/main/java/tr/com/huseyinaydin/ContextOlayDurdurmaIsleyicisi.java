package tr.com.huseyinaydin;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class ContextOlayDurdurmaIsleyicisi implements ApplicationListener<ContextStoppedEvent> {

	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("ContextStoppedEvent " + "(Context Olay Durudurma)");
	}
}