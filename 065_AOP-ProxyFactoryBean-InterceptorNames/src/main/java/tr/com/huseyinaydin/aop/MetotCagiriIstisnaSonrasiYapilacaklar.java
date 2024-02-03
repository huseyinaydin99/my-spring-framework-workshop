package tr.com.huseyinaydin.aop;

import org.springframework.aop.ThrowsAdvice;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class MetotCagiriIstisnaSonrasiYapilacaklar implements ThrowsAdvice {

	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println(
				"---Spring AOP ile " + "metotlardaki bir İSTİSNADAN SONRA " + "çalışan afterThrowing metodu.---\n");
	}
}