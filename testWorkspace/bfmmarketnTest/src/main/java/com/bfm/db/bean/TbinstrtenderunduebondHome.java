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
 * Home object for domain model class Tbinstrtenderunduebond.
 * @see com.bfm.db.bean.Tbinstrtenderunduebond
 * @author Hibernate Tools
 */
public class TbinstrtenderunduebondHome {

	private static final Log log = LogFactory
			.getLog(TbinstrtenderunduebondHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(Tbinstrtenderunduebond transientInstance) {
		log.debug("persisting Tbinstrtenderunduebond instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbinstrtenderunduebond instance) {
		log.debug("attaching dirty Tbinstrtenderunduebond instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbinstrtenderunduebond instance) {
		log.debug("attaching clean Tbinstrtenderunduebond instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tbinstrtenderunduebond persistentInstance) {
		log.debug("deleting Tbinstrtenderunduebond instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbinstrtenderunduebond merge(Tbinstrtenderunduebond detachedInstance) {
		log.debug("merging Tbinstrtenderunduebond instance");
		try {
			Tbinstrtenderunduebond result = (Tbinstrtenderunduebond) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tbinstrtenderunduebond findById(
			com.bfm.db.bean.TbinstrtenderunduebondId id) {
		log.debug("getting Tbinstrtenderunduebond instance with id: " + id);
		try {
			Tbinstrtenderunduebond instance = (Tbinstrtenderunduebond) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.Tbinstrtenderunduebond", id);
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

	public List findByExample(Tbinstrtenderunduebond instance) {
		log.debug("finding Tbinstrtenderunduebond instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.Tbinstrtenderunduebond")
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
