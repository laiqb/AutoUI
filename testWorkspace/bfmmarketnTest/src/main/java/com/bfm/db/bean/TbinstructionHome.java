package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.bfm.util.HibernateUtil;

/**
 * Home object for domain model class Tbinstruction.
 * @see com.bfm.db.bean.Tbinstruction
 * @author Hibernate Tools
 */

public class TbinstructionHome {

	private static final Log log = LogFactory.getLog(TbinstructionHome.class);

	public void attachDirty(Tbinstruction instance) {
		log.debug("attaching dirty Tbinstruction instance");
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}finally{
			session.close();
		}
	}

	public void attachClean(Tbinstruction instance) {
		log.debug("attaching clean Tbinstruction instance");
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}finally{
			session.close();
		}
	}

	public void delete(Tbinstruction persistentInstance) {
		log.debug("deleting Tbinstruction instance");
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}finally{
			session.close();
		}
	}

	public Tbinstruction merge(Tbinstruction detachedInstance) {
		log.debug("merging Tbinstruction instance");
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			Tbinstruction result = (Tbinstruction) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}finally{
			session.close();
		}
	}

	public Tbinstruction findById(TbinstructionId id) {
		log.debug("getting Tbinstruction instance with id: " + id);
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			Tbinstruction instance = (Tbinstruction) session.get("com.bfm.db.bean.Tbinstruction",id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}finally{
			session.close();
		}
	}

	public List findByExample(Tbinstruction instance) {
		log.debug("finding Tbinstruction instance by example");
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			List results = session.createCriteria("com.bfm.db.bean.Tbinstruction")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}finally{
			session.close();
		}
	}
}
