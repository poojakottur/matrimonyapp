package com.matrimony;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.matrimony.entity.User;
import com.matrimony.repository.UserRepository;
import com.matrimony.service.UserDetailsServiceImpl;



@RunWith(SpringRunner.class)
@SpringBootTest
public class MatrimonyCgApplicationTests {


	@Autowired
	@MockBean
	private UserRepository repository;
	
	@Autowired
	private UserDetailsServiceImpl service;

	@Test
	public void getUserTest(String username) {
		User user = new User("pooja", "pooja@gmail.com", "jaanu");
		when(repository.save(user)).thenReturn(user);
		assertEquals(user, service.loadUserByUsername(username));
		verify(repository, times(1)).findByUsername(username);
		


		
//		when(repository.findAll()).thenReturn(Stream
//				.of(new User( "pooja", "pooja@gmail.com", "jaanu")).collect(Collectors.toList()));
//		assertEquals(1, repository.findByUsername(username));
	}

	

}
