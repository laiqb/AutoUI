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
 * Home object for domain model class Tbinstructionstockfx.
 * @see com.bfm.db.bean.Tbinstructionstockfx
 * @author Hibernate Tools
 */
public class TbinstructionstockfxHome {

	private static final Log log = LogFactory
			.getLog(TbinstructionstockfxHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(Tbinstructionstockfx transientInstance) {
		log.debug("persisting Tbinstructionstockfx instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbinstructionstockfx instance) {
		log.debug("attaching dirty Tbinstructionstockfx instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbinstructionstockfx instance) {
		log.debug("attaching clean Tbinstructionstockfx instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tbinstructionstockfx persistentInstance) {
		log.debug("deleting Tbinstructionstockfx instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbinstructionstockfx merge(Tbinstructionstockfx detachedInstance) {
		log.debug("merging Tbinstructionstockfx instance");
		try {
			Tbinstructionstockfx result = (Tbinstructionstockfx) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tbinstructionstockfx findById(
			com.bfm.db.bean.TbinstructionstockfxId id) {
		log.debug("getting Tbinstructionstockfx instance with id: " + id);
		try {
			Tbinstructionstockfx instance = (Tbinstructionstockfx) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.Tbinstructionstockfx", id);
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

	public List findByExample(Tbinstructionstockfx instance) {
		log.debug("finding Tbinstructionstockfx instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.Tbinstructionstockfx")
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
