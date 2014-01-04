package com.workinprogress.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.workinprogress.dao.HibernateUtils;
import com.workinprogress.dao.UserDao;
import com.workinprogress.model.Country;
import com.workinprogress.model.User;

public class UserHibernateDaoImpl implements UserDao {

	@Override
	public User loadUser(long userId) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session sess = sessionFactory.getCurrentSession();
		Transaction tx = sess.beginTransaction();
		User u = (User) sess.load(User.class, 1L);
		System.out.println("User:"+u.toString());
		sess.flush();
		tx.rollback();
		return u;
	}
	
	@Override
	public Long saveNewUser(User user)
	{
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session sess = sessionFactory.getCurrentSession();
		Transaction tx = sess.beginTransaction();
		sess.save(user);
		System.out.println("User saved.. :"+user.toString());
		sess.flush();
		tx.rollback();
		return user.getId();
	}

}





