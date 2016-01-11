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
 * Home object for domain model class Tbinstructionstock.
 * @see com.bfm.db.bean.Tbinstructionstock
 * @author Hibernate Tools
 */
public class TbinstructionstockHome {

	private static final Log log = LogFactory.getLog(TbinstructionstockHome.class);

	public void attachDirty(Tbinstructionstock instance) {
		log.debug("attaching dirty Tbinstructionstock instance");
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

	public void attachClean(Tbinstructionstock instance) {
		log.debug("attaching clean Tbinstructionstock instance");
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

	public void delete(Tbinstructionstock persistentInstance) {
		log.debug("deleting Tbinstructionstock instance");
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

	public Tbinstructionstock merge(Tbinstructionstock detachedInstance) {
		log.debug("merging Tbinstructionstock instance");
		Session session = null;

		try {
			session = HibernateUtil.openSession();
			Tbinstructionstock result = (Tbinstructionstock) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}finally{
			session.close();
		}
	}

	public Tbinstructionstock findById(TbinstructionstockId id) {
		log.debug("getting Tbinstructionstock instance with id: " + id);
		Session session = null;

		try {
			session = HibernateUtil.openSession();
			Tbinstructionstock instance = (Tbinstructionstock) session.get(
							"com.bfm.db.bean.Tbinstructionstock", id);
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

	public List findByExample(Tbinstructionstock instance) {
		log.debug("finding Tbinstructionstock instance by example");
		Session session = null;

		try {
			session = HibernateUtil.openSession();
			List results = session.createCriteria("com.bfm.db.bean.Tbinstructionstock")
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
