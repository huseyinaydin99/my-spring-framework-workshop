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
		Ayar ayar = appCtx.getBean("AyarBean", Ayar.class);                         					
		System.out.println(ayar);														
		ayar.sonucuYaz();				
		((ConfigurableApplicationContext)appCtx).close(); 							
	}
}