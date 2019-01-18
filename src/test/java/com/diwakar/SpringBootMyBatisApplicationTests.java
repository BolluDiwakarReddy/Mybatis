package com.diwakar;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.diwakar.beans.User;
import com.diwakar.mybatis.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringBootMyBatisApplication.class)
public class SpringBootMyBatisApplicationTests {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	  public void testForAddUser() {
		  User user=new User();
		  user.setName("bharath");
		  user.setEmailId("bharath@gmail.com");
		  userMapper.addUser(user);
	  }

	
	@Test
  public void testForFetchingData() {
	  List<User> list=userMapper.fetchAllUsers();
	  for(User user:list) {
		  System.out.println(user.getName()+", "+user.getEmailId());
	  }
  }
	

}

