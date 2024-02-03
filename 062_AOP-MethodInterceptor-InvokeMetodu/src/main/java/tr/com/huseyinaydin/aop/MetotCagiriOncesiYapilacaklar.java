package tr.com.huseyinaydin.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class MetotCagiriOncesiYapilacaklar implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("---Spring AOP ile " + "her metottan ÖNCE devreye giren before metodu.---");
	}
}