package tr.org.huseyinaydin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import tr.org.huseyinaydin.model.Personel;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Framework.
* 
*/

@Repository
public class PersonelDAOImpl implements PersonelDAO {

	private static final Logger logger = LoggerFactory.getLogger(PersonelDAOImpl.class);

	private SessionFactory sessionFactory;
	Session session;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public String personelEkle(Personel p) {
		session = this.sessionFactory.openSession();
		session.persist(p);
		session.close();
		logger.info("Personel eklendi. Bilgisi: " + p);
		return "listele?faces-redirect=true";
	}

	@Override
	public List<Personel> personelAra() {
		session = this.sessionFactory.openSession();
		List<Personel> personelListesi = session.createQuery("FROM Personel").list();
		for (Personel p : personelListesi) {
			logger.info("Personel Bilgisi: " + p);
		}
		session.close();
		return personelListesi;
	}

	@Override
	public List<Personel> personelAra(Personel p) {
		session = this.sessionFactory.openSession();
		String hql = "FROM Personel P " + " WHERE P.adi    LIKE :personelAdi " + " AND   P.soyadi LIKE :personelSoyadi";
		Query sorgu = session.createQuery(hql);
		sorgu.setString("personelAdi", p.getAdi() + "%");
		sorgu.setString("personelSoyadi", p.getSoyadi() + "%");
		List<Personel> personelListesi2 = sorgu.list();
		for (Personel p2 : personelListesi2) {
			logger.info("Personel Bilgisi: " + p2);
		}
		session.close();
		return personelListesi2;
	}

	@Override
	public String personelDuzenle(Personel p) {
		session = this.sessionFactory.openSession();
		session.update(p);
		session.close();
		logger.info("Personel guncellendi. Bilgisi: " + p);
		return "listele?faces-redirect=true";
	}

	@Override
	public String personelSil(Personel p) {
		session = this.sessionFactory.openSession();
		session.delete(p);
		session.close();
		logger.info("Personel silindi. Bilgisi: " + p);
		return "listele?faces-redirect=true";
	}
}