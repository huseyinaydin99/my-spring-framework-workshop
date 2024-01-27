package tr.com.huseyinaydin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework.
 * 
 */

@Configuration
public class App {

	//@Bean(name = "selam")
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ISelam obj = (ISelam) context.getBean("selam");
		obj.mesajYaz(
				"Bilişim, yazılım teknolojileri insanoğlunun şu ana kadar ki elde edebildiği"
				+ " en üstün şey ve süper güce en yakın şeydir.");
	}
}
