package tr.com.huseyinaydin.aop;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class MetotCagiriSonrasiYapilacaklar implements AfterReturningAdvice {
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("---Spring AOP ile " + "her metottan SONRA devreye giren afterReturning metodu.---\n\n");
	}
}