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
 * Home object for domain model class Tbinstitutioncredit.
 * @see com.bfm.db.bean.Tbinstitutioncredit
 * @author Hibernate Tools
 */
public class TbinstitutioncreditHome {

	private static final Log log = LogFactory
			.getLog(TbinstitutioncreditHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(Tbinstitutioncredit transientInstance) {
		log.debug("persisting Tbinstitutioncredit instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbinstitutioncredit instance) {
		log.debug("attaching dirty Tbinstitutioncredit instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbinstitutioncredit instance) {
		log.debug("attaching clean Tbinstitutioncredit instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tbinstitutioncredit persistentInstance) {
		log.debug("deleting Tbinstitutioncredit instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbinstitutioncredit merge(Tbinstitutioncredit detachedInstance) {
		log.debug("merging Tbinstitutioncredit instance");
		try {
			Tbinstitutioncredit result = (Tbinstitutioncredit) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tbinstitutioncredit findById(com.bfm.db.bean.TbinstitutioncreditId id) {
		log.debug("getting Tbinstitutioncredit instance with id: " + id);
		try {
			Tbinstitutioncredit instance = (Tbinstitutioncredit) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.Tbinstitutioncredit", id);
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

	public List findByExample(Tbinstitutioncredit instance) {
		log.debug("finding Tbinstitutioncredit instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.Tbinstitutioncredit")
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
