package com.irctc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.irctc.dto.IrctcDTO;
import com.irctc.service.IrctcServiceImpl;

@Controller
@RequestMapping(value = "/list-user")
public class GetListOfUserController {

	@Autowired
	IrctcServiceImpl irctcServiceImpl;

	@GetMapping
	public String getAllUser(Model model) {
		List<IrctcDTO> users = irctcServiceImpl.getAllUsers();

		if (users != null) {
			model.addAttribute("users", users);
			System.out.println("Inside getAllUser()");
			return "list-user";
		} else {
			return "empty";
		}

	}
}
