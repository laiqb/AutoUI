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
 * Home object for domain model class Tbinstrtenderbasic.
 * @see com.bfm.db.bean.Tbinstrtenderbasic
 * @author Hibernate Tools
 */
public class TbinstrtenderbasicHome {

	private static final Log log = LogFactory
			.getLog(TbinstrtenderbasicHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(Tbinstrtenderbasic transientInstance) {
		log.debug("persisting Tbinstrtenderbasic instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbinstrtenderbasic instance) {
		log.debug("attaching dirty Tbinstrtenderbasic instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbinstrtenderbasic instance) {
		log.debug("attaching clean Tbinstrtenderbasic instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tbinstrtenderbasic persistentInstance) {
		log.debug("deleting Tbinstrtenderbasic instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbinstrtenderbasic merge(Tbinstrtenderbasic detachedInstance) {
		log.debug("merging Tbinstrtenderbasic instance");
		try {
			Tbinstrtenderbasic result = (Tbinstrtenderbasic) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tbinstrtenderbasic findById(com.bfm.db.bean.TbinstrtenderbasicId id) {
		log.debug("getting Tbinstrtenderbasic instance with id: " + id);
		try {
			Tbinstrtenderbasic instance = (Tbinstrtenderbasic) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.Tbinstrtenderbasic", id);
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

	public List findByExample(Tbinstrtenderbasic instance) {
		log.debug("finding Tbinstrtenderbasic instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.Tbinstrtenderbasic")
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
