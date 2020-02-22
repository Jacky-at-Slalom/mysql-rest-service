package com.javaproject.mysqlrestservice;

import com.javaproject.restservice.entity.*;
import com.javaproject.restservice.repository.*;
import org.junit.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.*;
import org.mockito.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.orm.jpa.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.*;


public class MysqlRestServiceApplicationTests {

	 @RunWith(SpringRunner.class)
	 @DataJpaTest
	 public class UserRepositoryTest {


		 @Autowired
		 private UserRepository userRepository;


		 @Test
		 public void testFindByName() {
			 Optional<User> user = UserRepository.find
			 assertEquals("Foo", User.get().getName());
		 }
	 }

}

