package tr.com.huseyinaydin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework.
 * 
 */

public class SelamApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Selam nesne1 = (Selam) context.getBean("selam");

		nesne1.setMesaj("Bilişim, yazılım teknolojileri insanoğlunun şu ana kadar ki elde edebildiği "
				+ "en üstün şey ve süper güce en yakın şeydir.");
		nesne1.goster();

		Selam nesne2 = (Selam) context.getBean("selam");
		nesne2.getMesaj();
		nesne2.goster();
	}
}