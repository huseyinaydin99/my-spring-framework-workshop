package tr.com.huseyinaydin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tr.com.huseyinaydin.config.MerkezAppConfig;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class MerkezApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MerkezAppConfig.class);

		A aNesnesi = (A) context.getBean("beana");
		aNesnesi.yaz("Selamun");

		B bNesnesi = (B) context.getBean("beanb");
		bNesnesi.yaz("Aleyküm");
	}
}