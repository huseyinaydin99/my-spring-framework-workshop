package tr.com.huseyinaydin;

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
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Listeler list = context.getBean("listelerBean", Listeler.class);
		System.out.println(list);
		RegExKontrol regExKontrol = context.getBean("regExKontrolBean", RegExKontrol.class);
		System.out.println(regExKontrol);
		context.close();
	}
}