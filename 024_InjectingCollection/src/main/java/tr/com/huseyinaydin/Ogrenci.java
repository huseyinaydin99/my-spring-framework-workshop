package tr.com.huseyinaydin;

import java.util.*;

//بسم الله الرحمن الرحيم

/**
 * 
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Framework.
 * 
 */

public class Ogrenci {
	private List<?> ogrenciList;
	private Set<?> ogrenciSet;
	private Map<?, ?> ogrenciMap;
	private Properties ogrenciProp;

	public void setOgrenciList(List<?> ogrenciList) {
		this.ogrenciList = ogrenciList;
	}

	public List<?> getOgrenciList() {
		System.out.println("List Elemanları :" + ogrenciList);
		return ogrenciList;
	}

	public void setOgrenciSet(Set<?> ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}

	public Set<?> getOgrenciSet() {
		System.out.println("Set Elemanları :" + ogrenciSet);
		return ogrenciSet;
	}

	public void setOgrenciMap(Map<?, ?> ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}

	public Map<?, ?> getOgrenciMap() {
		System.out.println("Map Elemanları :" + ogrenciMap);
		return ogrenciMap;
	}

	public void setOgrenciProp(Properties ogrenciProp) {
		this.ogrenciProp = ogrenciProp;
	}

	public Properties getOgrenciProp() {
		System.out.println("Property Elemanları :" + ogrenciProp);
		return ogrenciProp;
	}
}