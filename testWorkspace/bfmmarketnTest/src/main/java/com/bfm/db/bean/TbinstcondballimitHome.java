package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.bfm.util.HibernateUtil;

/**
 * Home object for domain model class Tbinstcondballimit.
 * @see com.bfm.db.bean.Tbinstcondballimit
 * @author Hibernate Tools
 */
public class TbinstcondballimitHome {

	private static final Log log = LogFactory
			.getLog(TbinstcondballimitHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(Tbinstcondballimit transientInstance) {
		log.debug("persisting Tbinstcondballimit instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbinstcondballimit instance) {
		log.debug("attaching dirty Tbinstcondballimit instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbinstcondballimit instance) {
		log.debug("attaching clean Tbinstcondballimit instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tbinstcondballimit persistentInstance) {
		log.debug("deleting Tbinstcondballimit instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbinstcondballimit merge(Tbinstcondballimit detachedInstance) {
		log.debug("merging Tbinstcondballimit instance");
		try {
			Tbinstcondballimit result = (Tbinstcondballimit) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tbinstcondballimit findById(com.bfm.db.bean.TbinstcondballimitId id) {
		log.debug("getting Tbinstcondballimit instance with id: " + id);
		try {
			Tbinstcondballimit instance = (Tbinstcondballimit) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.Tbinstcondballimit", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tbinstcondballimit instance) {
		log.debug("finding Tbinstcondballimit instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.Tbinstcondballimit")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
