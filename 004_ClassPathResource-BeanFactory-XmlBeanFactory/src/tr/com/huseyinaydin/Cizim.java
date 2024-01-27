package tr.com.huseyinaydin;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework.
 * 
 */

@SuppressWarnings("deprecation")
public class Cizim {

	public static void main(String[] args) {
		ClassPathResource classPathResource = new ClassPathResource("spring.xml");

		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);

		Ucgen ucgen = (Ucgen) beanFactory.getBean("ucgen");
		ucgen.ciz();
	}
}