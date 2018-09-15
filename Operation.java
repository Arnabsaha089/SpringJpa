package com.cg.dao;

import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Repository;

import com.cg.entities.Trainee;
@Repository
public class Operation
{
	@PersistenceContext
	EntityManager em;
	public void addtoTableDao(Trainee t)
	{
		
		
		//em.getTransaction().begin();
		em.merge(t);
		//em.getTransaction().commit();
		em.close();
		
	}
	
	public void deleteFromTableDao(int id)
	{
		Trainee tr=em.find(Trainee.class, id);
		em.remove(tr);
	}

	@SuppressWarnings("unchecked")
	public List<Trainee> retriveFromTableDao() 
	{
		
		
		Query query = em.createNamedQuery("selectAll");
		List<Trainee> ls=query.getResultList();
		
		return ls;
	}
	
	public Trainee retriveFromTableByIdDao(int id)
	{
		Trainee tr=em.find(Trainee.class, id);
		
		
		return tr;
	}
}
