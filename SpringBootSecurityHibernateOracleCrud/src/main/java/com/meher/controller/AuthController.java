package com.meher.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.meher.models.Users;
import com.meher.repo.UsersRepository;
import com.meher.services.UsersService;


@Controller
public class AuthController {
	
	@Autowired
	UsersService userService;
	
	@GetMapping({"/","/login"})
	public String getLogin() {
		return "auth/login";
	}
	
	@PostMapping({"/login"})
	public String postLogin(Model m, @ModelAttribute("UserLogin") Users request, RedirectAttributes redirectAttributes, HttpServletRequest req) {
		
		Users dbUser = userService.getUserByUsername(request.getUsername());
		
		if (request.getUsername().equals(dbUser.getUsername()) && request.getPassword().equals(dbUser.getPassword()) ) {
			return "view/home";
		}else {
			return "auth/login";
		}
		
	}
	
}
