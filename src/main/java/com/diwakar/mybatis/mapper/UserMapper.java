package com.diwakar.mybatis.mapper;

import java.util.List;

import com.diwakar.beans.User;

public interface UserMapper {
	List<User> fetchAllUsers();

	User fetchUserById(int id);

	void addUser(User user);

}
