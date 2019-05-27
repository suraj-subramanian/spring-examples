/**
 * 
 */
package com.jpm.spring_boot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jpm.spring_boot.entity.User;

/**
 * @author Smita B Kumar
 *
 */
//prep-work - annotate Dao with Repository
@Repository
public class UserDao implements IUserDao {
	//peristenceContext autowired
	//prep-work 2 -> @PersistenceContext EnttityManager Object
	@PersistenceContext
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see com.jpm.spring_boot.dao.IUserDao#getUserById(int)
	 */
	@Override
	public User getUserById(Long userId) {
		//User user = new User(userId, "Mona", "password", "admin");
		//return user;
		return entityManager.find(User.class, userId);		
	}

	@Override
	public User addUser(User user) {
		System.out.println("User Added in Database : "+user);
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		System.out.println("User Update in Database : "+user);
		return entityManager.merge(user);
	}
/*
 * listUser
 *public List<User> getUserList() {
		Query query = entityManager.createQuery("from Employee");
		return query.getResultList();
	}
	//delete user
	 public boolean deleteUser(Long userId) throws EmployeeException {
		User user =getUserById(userId);
		if(user!=null)
			return false;
		else {
			entityManager.remove(user);
			return true;
		}
	}
 */
}
