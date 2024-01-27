package tr.com.huseyinaydin;

import org.springframework.beans.factory.BeanFactory;
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

public class Cizim {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring.xml" });

		BeanFactory beanFactory = context;

		Ucgen ucgen = (Ucgen) beanFactory.getBean("ucgen");
		ucgen.ciz();
	}
}