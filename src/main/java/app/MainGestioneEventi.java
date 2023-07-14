package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import ENUM.TipoConcerto;
import ENUM.TipoEvento;
import ENUM.TipoGenere;
import dao.EventoDAO;
import entities.Concerto;
import entities.GaraDiAtletica;
import entities.PartitaDiCalcio;
import entities.Persona;
import util.JpaUtil;

public class MainGestioneEventi {
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		System.out.println("DATABASE COLLEGATO CON SUCCESSO!!!!");
		EventoDAO ad = new EventoDAO(em);
		dao.PersonaDAO pd = new dao.PersonaDAO(em);

		Concerto concerto1 = new Concerto("Titolo concerto", "2023-07-15", "Descrizione concerto", TipoEvento.PRIVATO,
				100, TipoConcerto.ROCK, true);

		Persona persona1 = new Persona("Luca", "Guerra", "Luca@yahoo.it", "1992-11-05", TipoGenere.MASCHIO);

		GaraDiAtletica gara1 = new GaraDiAtletica("Titolo gara", "2023-07-16", "Descrizione gara", TipoEvento.PUBBLICO,
				50, persona1);

		PartitaDiCalcio partita1 = new PartitaDiCalcio("Champions League", "1992-11-05", "Partita di coppa",
				TipoEvento.PRIVATO, 60000, " As Roma", "Barcellona", "Roma", 3, 0);

		ad.save(concerto1);
		ad.save(gara1);
		ad.save(partita1);

		em.close();
		emf.close();
	}
}