package br.com.caelum.ingresso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class SessaoDao {

	@PersistenceContext
	private EntityManager manager;
	
	public void save(Sessao sessao){
		manager.persist(sessao);
	}
	
	public List<Sessao> buscaSessoesDaSala(Sala sala) {
		return manager.createQuery("select s from Sessao s where s.sla = :sala", Sessao.class)
				.setParameter("sala", sala)
				.getResultList();
	}
}
