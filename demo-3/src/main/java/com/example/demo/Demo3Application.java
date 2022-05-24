package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo3Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user = new User();
//		user.setName("aman");
//		user.setId(3);
//		user.setCity("daurala");
//		userRepository.save(user);
//		
//		User user2 = new User();
//		user2.setName("vinay yadav");
//		user2.setId(4);
//		user2.setCity("daurala");
//		userRepository.save(user);
//		
//		
//		List<User> list = List.of(user,user2); // java 9 method
//		List<User> saveAll = userRepository.saveAll(list);
//		System.out.println(saveAll);
//		saveAll.forEach(e-> {
//			System.out.print(e);
//			
//		});
		

		
		// update the user
		
		Optional<User> findById = userRepository.findById(3);
		System.out.println(findById);// find the 
		
		      User userUpdate = findById.get();
		      System.out.println(userUpdate);
		      userUpdate.setName("tushar yadav");
		      userUpdate.setCity("daurala meerut");
		      userRepository.save(userUpdate);
		      
		      //findall
		      List<User> findAll = userRepository.findAll();
		      System.out.println(findAll);
		      
		      
		      // delete
		      userRepository.deleteById(2);
		      System.out.println("deleted");
		
	}

}
