package tr.com.huseyinaydin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

@Configuration
@Import({AConfig.class, BConfig.class})
public class MerkezAppConfig {

}