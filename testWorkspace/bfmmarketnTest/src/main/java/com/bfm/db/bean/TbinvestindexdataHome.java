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
 * Home object for domain model class Tbinvestindexdata.
 * @see com.bfm.db.bean.Tbinvestindexdata
 * @author Hibernate Tools
 */
public class TbinvestindexdataHome {

	private static final Log log = LogFactory
			.getLog(TbinvestindexdataHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(Tbinvestindexdata transientInstance) {
		log.debug("persisting Tbinvestindexdata instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbinvestindexdata instance) {
		log.debug("attaching dirty Tbinvestindexdata instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbinvestindexdata instance) {
		log.debug("attaching clean Tbinvestindexdata instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tbinvestindexdata persistentInstance) {
		log.debug("deleting Tbinvestindexdata instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbinvestindexdata merge(Tbinvestindexdata detachedInstance) {
		log.debug("merging Tbinvestindexdata instance");
		try {
			Tbinvestindexdata result = (Tbinvestindexdata) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tbinvestindexdata findById(com.bfm.db.bean.TbinvestindexdataId id) {
		log.debug("getting Tbinvestindexdata instance with id: " + id);
		try {
			Tbinvestindexdata instance = (Tbinvestindexdata) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.Tbinvestindexdata", id);
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

	public List findByExample(Tbinvestindexdata instance) {
		log.debug("finding Tbinvestindexdata instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.Tbinvestindexdata")
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
