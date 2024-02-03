package tr.com.huseyinaydin.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

@Aspect
public class MetotCagiriOncesiYapilacaklar {
	
	@Before("execution(* tr.com.huseyinaydin.IPersonelServis.selamVer(..))")
	public void ilkGorev(JoinPoint joinPoint) {                       		   				      
	    System.out.println("--- AOP <aop:before> XML ETİKETİ --- "
	    + joinPoint.getSignature().getName() + " isimli metottan"
	    		+ " ÖNCE çalışan ilkGorev() metodu." );	 
	}
}






























