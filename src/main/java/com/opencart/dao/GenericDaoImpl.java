package com.opencart.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class GenericDaoImpl implements GenericDao {
	static final private String UNITNAME = "test";
	private static Log logger = LogFactory.getLog(GenericDaoImpl.class);
	EntityManagerFactory factory;
	EntityManager em;

    public GenericDaoImpl() {
    	factory = Persistence.createEntityManagerFactory(UNITNAME);
    	em = factory.createEntityManager();
    }
    
    public <E> E create(E e) {
    	em.getTransaction().begin();
//    	logger.info("persisting " + e);
        em.persist(e);
        em.getTransaction().commit();
        return e;
    }

    public <E> E update(E e) {
        return em.merge(e);
    }
    
    public <E> List<E> selectAll(String query) {
    	List<E> result = new ArrayList<E>();
    	em.createQuery(query);
    	return result;
    }

}
