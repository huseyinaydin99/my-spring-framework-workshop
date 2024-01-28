package tr.com.huseyinaydin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class Merkez {
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Calisan calisan = (Calisan) appCtx.getBean("calisan", Calisan.class);
		System.out.println(calisan);
		((ConfigurableApplicationContext) appCtx).close();
	}
}