package tr.com.huseyinaydin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

@Configuration
public class AppConfig {
	
	@Bean(name="selam")
    public ISelam mesajYaz() {
        return new SelamImpl();
    }
}