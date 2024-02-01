package tr.com.huseyinaydin.aop;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class MetotCagiriOncesiYapilacaklar implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("\n---Spring AOP ile " + "her metottan ÖNCE devreye giren before metodu.---");
	}
}