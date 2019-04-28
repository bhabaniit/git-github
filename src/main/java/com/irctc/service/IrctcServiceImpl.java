package com.irctc.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.dao.IrctcDAOImpl;
import com.irctc.dao.IrctcRepository;
import com.irctc.dto.IrctcDTO;
import com.irctc.form.IrctcForm;

@Service
public class IrctcServiceImpl implements IrctcService {

	@Autowired
	IrctcDAOImpl irctcDAOImpl;

	@Autowired
	IrctcRepository irctcRepository;

	@Override
	public int addIrctcUser(IrctcForm irctcForm) throws ParseException {

		return irctcDAOImpl.registerUser(irctcForm);
	}

	@Override
	public List<String> getAllUsernames() {

		return irctcRepository.findAllUsername();
	}

	@Override
	public List<IrctcDTO> getAllUsers() {
		return irctcDAOImpl.getListOfUser();
	}

}
