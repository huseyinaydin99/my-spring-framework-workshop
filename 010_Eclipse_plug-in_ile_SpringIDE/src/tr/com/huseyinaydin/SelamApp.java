package tr.com.huseyinaydin;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class SelamApp {

	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Selam selam = (Selam) context.getBean("selam");
		selam.goster();

		/*Resource resource = new FileSystemResource("beans.xml");
		BeanFactory factory1 = new XmlBeanFactory(resource);
*/
		ClassPathResource resource2 = new ClassPathResource("beans.xml");
		BeanFactory factory2 = new XmlBeanFactory(resource2);
	}
}