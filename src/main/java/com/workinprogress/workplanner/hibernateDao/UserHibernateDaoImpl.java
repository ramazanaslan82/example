package com.workinprogress.workplanner.hibernateDao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.workinprogress.workplanner.dao.HibernateUtils;
import com.workinprogress.workplanner.dao.UserDao;
import com.workinprogress.workplanner.model.User;

@Repository
public class UserHibernateDaoImpl implements UserDao {

	//@Autowired
	private SessionFactory sessionFactory;

	//@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public User loadUserOldType(long userId) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session sess = sessionFactory.getCurrentSession();
		Transaction tx = sess.beginTransaction();
		User u = (User) sess.load(User.class, 1L);
		System.out.println("User:" + u.toString());
		sess.flush();
		tx.rollback();
		return u;
	}

	@Override
	public Long saveNewUser(User user) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session sess = sessionFactory.getCurrentSession();
		Transaction tx = sess.beginTransaction();
		sess.save(user);
		System.out.println("User saved.. :" + user.toString());
		sess.flush();
		tx.rollback();
		return user.getId();
	}

	@Override
	public Long saveUser(User user) {
		Session currentSession = sessionFactory.getCurrentSession();
		Transaction transaction = currentSession.beginTransaction();
		transaction.begin();
		currentSession.save(user);
		return user.getId();
	}

	@Override
	public User loadUser(Long id) {
		Session currentSession = sessionFactory.getCurrentSession();
		List<User> list = (List<User>) currentSession.createQuery("from User")
				.list();
		return list.get(0);
	}

}
