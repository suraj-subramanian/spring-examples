/**
 * 
 */
package com.jpm.spring_boot.dao;

import com.jpm.spring_boot.entity.User;

/**
 * @author Smita B Kumar
 *
 */
public interface IUserDao {
	public User getUserById(Long userId);

	public User addUser(User user);

	public User updateUser(User user);
}
