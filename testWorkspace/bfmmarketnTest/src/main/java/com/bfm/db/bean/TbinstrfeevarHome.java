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
 * Home object for domain model class Tbinstrfeevar.
 * @see com.bfm.db.bean.Tbinstrfeevar
 * @author Hibernate Tools
 */
public class TbinstrfeevarHome {

	private static final Log log = LogFactory.getLog(TbinstrfeevarHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(Tbinstrfeevar transientInstance) {
		log.debug("persisting Tbinstrfeevar instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbinstrfeevar instance) {
		log.debug("attaching dirty Tbinstrfeevar instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbinstrfeevar instance) {
		log.debug("attaching clean Tbinstrfeevar instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tbinstrfeevar persistentInstance) {
		log.debug("deleting Tbinstrfeevar instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbinstrfeevar merge(Tbinstrfeevar detachedInstance) {
		log.debug("merging Tbinstrfeevar instance");
		try {
			Tbinstrfeevar result = (Tbinstrfeevar) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tbinstrfeevar findById(com.bfm.db.bean.TbinstrfeevarId id) {
		log.debug("getting Tbinstrfeevar instance with id: " + id);
		try {
			Tbinstrfeevar instance = (Tbinstrfeevar) sessionFactory
					.getCurrentSession().get("com.bfm.db.bean.Tbinstrfeevar",
							id);
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

	public List findByExample(Tbinstrfeevar instance) {
		log.debug("finding Tbinstrfeevar instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.Tbinstrfeevar")
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
