package tr.com.huseyinaydin;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class B {

	private A aNesnesi;

	public B(A aNesnesi) {
		System.out.println("B sınıfının hazırlayıcı metodu.");
		this.aNesnesi = aNesnesi;
	}

	public void sonucuGoster() {
		System.out.println("B sınıfına ait normal bir metot.");
		aNesnesi.konsolaYaz();
	}
}