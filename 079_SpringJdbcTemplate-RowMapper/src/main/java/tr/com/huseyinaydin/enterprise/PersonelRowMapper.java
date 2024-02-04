package tr.com.huseyinaydin.enterprise;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

public class PersonelRowMapper implements RowMapper<Personel> {

	@Override
	public Personel mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Personel personel = new Personel();
		personel.setId(resultSet.getInt("id"));
		personel.setAdi(resultSet.getString("adi"));
		personel.setSoyadi(resultSet.getString("soyadi"));
		personel.setTecrube(resultSet.getInt("tecrübe"));
		return personel;
	}
}