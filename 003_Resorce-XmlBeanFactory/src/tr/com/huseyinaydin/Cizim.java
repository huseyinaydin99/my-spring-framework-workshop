package tr.com.huseyinaydin;

import org.springframework.beans.factory.xml.XmlBeanFactory;
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

@SuppressWarnings("deprecation")
public class Cizim {

	public static void main(String[] args) {
		
		
		Resource resource = new FileSystemResource("spring.xml");
			
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);         
	
		Ucgen ucgen = (Ucgen) xmlBeanFactory.getBean("ucgen");
		ucgen.ciz();
	}
}
