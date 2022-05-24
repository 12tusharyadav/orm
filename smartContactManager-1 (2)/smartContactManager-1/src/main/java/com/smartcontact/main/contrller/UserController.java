package com.smartcontact.main.contrller;



import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartcontact.main.model.User;
import com.smartcontact.main.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	@RequestMapping("/index")
	public String dashBoard(Model model, Principal principal)
	{
		
		
		
		String name = principal.getName();
		User user = this.userRepository.getUserByUserName(name);
		System.out.println(user);
		model.addAttribute("user",user);
		  
		System.out.println(name);
		
		return "normal/user_dashboard";
	}
}
