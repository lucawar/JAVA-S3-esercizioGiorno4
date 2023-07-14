package dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import entities.Concerto;
import entities.Evento;

public class EventoDAO {

	private final EntityManager em;

	public EventoDAO(EntityManager em) {
		this.em = em;
	}

	public void save(Evento s) {
		EntityTransaction t = em.getTransaction();
		t.begin();

		em.persist(s);

		t.commit();

		System.out.println("Evento salvato correttamente");
	}

	public Evento findById(long id) {
		Evento found = em.find(Evento.class, id);
		return found;
	}

	public void findByIdAndDelete(long id) {

		Evento found = em.find(Evento.class, id);
		if (found != null) {

			EntityTransaction t = em.getTransaction();

			t.begin();

			em.remove(found);

			t.commit();
			System.out.println("Evento eliminato correttamente");
		} else {
			System.out.println("Evento non trovato");
		}
	}

	public void refresh(long id) {
		Evento found = em.find(Evento.class, id);
		found.setTitolo("");

		System.out.println("PRE REFRESH");
		System.out.println(found);

		em.refresh(found);
		System.out.println("POST REFRESH");
		System.out.println(found);

	}

	public Set<Concerto> getConcertoInStreaming(boolean inStreaming) {
		String queryStr = "SELECT c FROM Concerto c WHERE c.inStreaming = :inStreaming";
		TypedQuery<Concerto> getAllQuery = em.createQuery(queryStr, Concerto.class);
		getAllQuery.setParameter("inStreaming", inStreaming);
		List<Concerto> resultList = getAllQuery.getResultList();
		return new HashSet<>(resultList);
	}

}
