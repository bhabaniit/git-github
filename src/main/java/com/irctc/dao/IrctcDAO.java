package com.irctc.dao;

import java.text.ParseException;
import java.util.List;

import com.irctc.dto.IrctcDTO;
import com.irctc.form.IrctcForm;

public interface IrctcDAO {
	public int registerUser(IrctcForm irctcForm) throws ParseException;

	public List<IrctcDTO> getListOfUser();
}
