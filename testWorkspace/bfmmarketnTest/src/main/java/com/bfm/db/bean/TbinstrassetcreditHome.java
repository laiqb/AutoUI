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
 * Home object for domain model class Tbinstrassetcredit.
 * @see com.bfm.db.bean.Tbinstrassetcredit
 * @author Hibernate Tools
 */
public class TbinstrassetcreditHome {

	private static final Log log = LogFactory
			.getLog(TbinstrassetcreditHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(Tbinstrassetcredit transientInstance) {
		log.debug("persisting Tbinstrassetcredit instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbinstrassetcredit instance) {
		log.debug("attaching dirty Tbinstrassetcredit instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbinstrassetcredit instance) {
		log.debug("attaching clean Tbinstrassetcredit instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tbinstrassetcredit persistentInstance) {
		log.debug("deleting Tbinstrassetcredit instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbinstrassetcredit merge(Tbinstrassetcredit detachedInstance) {
		log.debug("merging Tbinstrassetcredit instance");
		try {
			Tbinstrassetcredit result = (Tbinstrassetcredit) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tbinstrassetcredit findById(com.bfm.db.bean.TbinstrassetcreditId id) {
		log.debug("getting Tbinstrassetcredit instance with id: " + id);
		try {
			Tbinstrassetcredit instance = (Tbinstrassetcredit) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.Tbinstrassetcredit", id);
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

	public List findByExample(Tbinstrassetcredit instance) {
		log.debug("finding Tbinstrassetcredit instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.Tbinstrassetcredit")
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
