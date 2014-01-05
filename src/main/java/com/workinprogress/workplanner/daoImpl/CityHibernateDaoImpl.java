package com.workinprogress.workplanner.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.PreparedStatement;
import com.workinprogress.workplanner.dao.CityDao;
import com.workinprogress.workplanner.dao.HibernateUtils;
import com.workinprogress.workplanner.model.City;

@Repository
public class CityHibernateDaoImpl implements CityDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Long saveCity(City city) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session sess = sessionFactory.getCurrentSession();
		Transaction tx = sess.beginTransaction();
		sess.save(city);
		System.out.println("City saved.. :" + city.toString());
		sess.flush();
		tx.commit();
		return city.getId();
	}

	@Override
	public Collection<City> loadCities() {
		return jdbcTemplate.query("select * from hbn_location", new RowMapper<City>() {

			@Override
			public City mapRow(ResultSet rs, int rowNum) throws SQLException {
				City city = new City();
				city.setId(rs.getLong("id"));
				city.setTitle(rs.getNString("title"));
				return city;
			}

		});
	}

}
