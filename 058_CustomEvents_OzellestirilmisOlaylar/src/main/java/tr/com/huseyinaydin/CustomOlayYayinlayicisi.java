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

public class CustomOlayYayinlayicisi implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void yayinla() {
		CustomOlay customOlay = new CustomOlay(this);
		publisher.publishEvent(customOlay);
	}
}