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
 * Home object for domain model class Tbinstrtenderdetail.
 * @see com.bfm.db.bean.Tbinstrtenderdetail
 * @author Hibernate Tools
 */
public class TbinstrtenderdetailHome {

	private static final Log log = LogFactory
			.getLog(TbinstrtenderdetailHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(Tbinstrtenderdetail transientInstance) {
		log.debug("persisting Tbinstrtenderdetail instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbinstrtenderdetail instance) {
		log.debug("attaching dirty Tbinstrtenderdetail instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbinstrtenderdetail instance) {
		log.debug("attaching clean Tbinstrtenderdetail instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tbinstrtenderdetail persistentInstance) {
		log.debug("deleting Tbinstrtenderdetail instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbinstrtenderdetail merge(Tbinstrtenderdetail detachedInstance) {
		log.debug("merging Tbinstrtenderdetail instance");
		try {
			Tbinstrtenderdetail result = (Tbinstrtenderdetail) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tbinstrtenderdetail findById(com.bfm.db.bean.TbinstrtenderdetailId id) {
		log.debug("getting Tbinstrtenderdetail instance with id: " + id);
		try {
			Tbinstrtenderdetail instance = (Tbinstrtenderdetail) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.Tbinstrtenderdetail", id);
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

	public List findByExample(Tbinstrtenderdetail instance) {
		log.debug("finding Tbinstrtenderdetail instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.Tbinstrtenderdetail")
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
