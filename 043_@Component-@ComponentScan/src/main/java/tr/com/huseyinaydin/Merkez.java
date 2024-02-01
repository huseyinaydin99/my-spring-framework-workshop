package tr.com.huseyinaydin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tr.com.huseyinaydin.matematik.HesapMakinesi;

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
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		HesapMakinesi hesapMakinesi = context.getBean("hesapMakinesiBeanComponent", HesapMakinesi.class);
		hesapMakinesi.sonuclariGetir(571, 632);
		((ConfigurableApplicationContext) context).close();
	}
}