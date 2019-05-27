/**
 * 
 */
package com.jpm.spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpm.spring_boot.dao.IUserDao;
import com.jpm.spring_boot.entity.User;

/**
 * @author Smita B Kumar
 *
 */
//prep-work -> annotate Service component
@Service("userService")
public class UserService implements IUserService {
	
//prep work 2-> inject Dao Object
	@Autowired
	private IUserDao userDao;
	
	@Override
	public User getUserById(Long userId) {
//prep work 4-> call and return dao method in specific service method
		return userDao.getUserById(userId);
	}
	

	
	@Override
	@Transactional
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	@Transactional
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

}
