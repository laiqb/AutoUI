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
 * Home object for domain model class Tbinstpaydatelist.
 * @see com.bfm.db.bean.Tbinstpaydatelist
 * @author Hibernate Tools
 */
public class TbinstpaydatelistHome {

	private static final Log log = LogFactory
			.getLog(TbinstpaydatelistHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(Tbinstpaydatelist transientInstance) {
		log.debug("persisting Tbinstpaydatelist instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbinstpaydatelist instance) {
		log.debug("attaching dirty Tbinstpaydatelist instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbinstpaydatelist instance) {
		log.debug("attaching clean Tbinstpaydatelist instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tbinstpaydatelist persistentInstance) {
		log.debug("deleting Tbinstpaydatelist instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbinstpaydatelist merge(Tbinstpaydatelist detachedInstance) {
		log.debug("merging Tbinstpaydatelist instance");
		try {
			Tbinstpaydatelist result = (Tbinstpaydatelist) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tbinstpaydatelist findById(com.bfm.db.bean.TbinstpaydatelistId id) {
		log.debug("getting Tbinstpaydatelist instance with id: " + id);
		try {
			Tbinstpaydatelist instance = (Tbinstpaydatelist) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.Tbinstpaydatelist", id);
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

	public List findByExample(Tbinstpaydatelist instance) {
		log.debug("finding Tbinstpaydatelist instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.Tbinstpaydatelist")
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
