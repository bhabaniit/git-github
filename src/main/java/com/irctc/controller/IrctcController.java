package com.irctc.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.form.IrctcForm;
import com.irctc.service.IrctcServiceImpl;

@RestController
@RequestMapping("/irctc")
public class IrctcController {

	@Autowired
	IrctcServiceImpl irctcServiceImpl;

	@GetMapping
	public String showIrctcRegdForm(@ModelAttribute(value = "irctcForm") IrctcForm irctcForm) {
		return "irctc-registration";
	}

	@PostMapping(value = "/registration")
	public String processIrctcRegdForm(@RequestBody IrctcForm irctcForm) throws ParseException {

		int id = irctcServiceImpl.addIrctcUser(irctcForm);
		System.out.println(id);
		if (id == 0) {
			return "This is failure";
		}
		return "This is success";
	}

}
