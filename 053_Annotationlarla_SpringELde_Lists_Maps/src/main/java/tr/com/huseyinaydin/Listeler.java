package tr.com.huseyinaydin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

@Component("listelerBean")
public class Listeler {

	@Value("#{kaynakBean.map['Hibernate']}")
	private String mapElemani;

	@Value("#{kaynakBean.list[1]}")
	private String listElemani;

	@Override
	public String toString() {
		return "SEÇİLEN MAP  ELEMANI = " + mapElemani + "\nSEÇİLEN LIST ELEMANI = " + listElemani;
	}

	public String getMapElemani() {
		return mapElemani;
	}

	public void setMapElemani(String mapElemani) {
		this.mapElemani = mapElemani;
	}

	public String getListElemani() {
		return listElemani;
	}

	public void setListElemani(String listElemani) {
		this.listElemani = listElemani;
	}
}