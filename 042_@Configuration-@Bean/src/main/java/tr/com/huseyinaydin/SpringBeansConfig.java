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
public class SpringBeansConfig {

	@Bean
	public Sehir getSehir() {
		Sehir sehir = new Sehir();
		sehir.setSehirAdi("Niğde");
		sehir.setPlakaNo(51);
		return sehir;
	}

	/*
	 * <bean id="sehir" class="tr.com.huseyinaydin.Sehir">
	 * 		<property name="sehirAdi" value="Niğde"/>
	 * 		<property name="plakaNo" value="51"/>
	 * </bean>
	 */

	@Bean
	public Ogrenci getStudent() {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setSehir(getSehir());
		return ogrenci;
	}

	/*
	 * <bean id="ogrenci" class="tr.com.huseyinaydin.Ogrenci">
	 * <property name="sehir">
	 * <ref bean=" sehir" />
	 * </property>
	 * </bean>
	 */
}