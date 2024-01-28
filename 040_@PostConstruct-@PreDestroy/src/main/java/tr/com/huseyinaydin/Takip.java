package tr.com.huseyinaydin;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework.
 * 
 */

public class Takip {
	private String mesaj;

	public Takip() {
		super();
		System.out.println("Hazırlayıcı metot");
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		System.out.println(mesaj + "\n(Hüseyin-i Aydın Niğdevi Hazeretleri :-D)");
		return mesaj;
	}

	@PostConstruct
	public void init() {
		System.out.println("init metodu.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy metodu.");
	}
}