package com.irctc.service;

import java.text.ParseException;
import java.util.List;

import com.irctc.dto.IrctcDTO;
import com.irctc.form.IrctcForm;

public interface IrctcService {
	public int addIrctcUser(IrctcForm irctcForm) throws ParseException;

	public List<String> getAllUsernames();
	public List<IrctcDTO> getAllUsers();
}
