package com.irctc.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.irctc.dto.IrctcDTO;
import com.irctc.entity.IrctcEntity;
import com.irctc.form.IrctcForm;

@Repository
public class IrctcDAOImpl implements IrctcDAO {

	@Autowired
	IrctcRepository irctcRepository;

	@Override
	public int registerUser(IrctcForm irctcForm) throws ParseException {
		IrctcEntity irctcEntity = new IrctcEntity();

		irctcEntity.setfName(irctcForm.getfName());
		irctcEntity.setlName(irctcForm.getlName());
		irctcEntity.setGender(irctcForm.getGender());
		irctcEntity.setDob(new SimpleDateFormat("YYYY-MM-DD").parse(irctcForm.getDob()));
		irctcEntity.setEmailId(irctcForm.getEmailId());
		irctcEntity.setMobileNo(irctcForm.getMobileNo());
		irctcEntity.setUsername(irctcForm.getUsername());
		irctcEntity.setPassword(irctcForm.getPassword());

		int id = (int) irctcRepository.save(irctcEntity).getIrctcId();

		return id;
	}

	@Override
	public List<IrctcDTO> getListOfUser() {
		List<IrctcEntity> result = irctcRepository.findAll();

		List<IrctcDTO> list = new ArrayList<IrctcDTO>();

		for (IrctcEntity objs : result) {
			IrctcDTO irctcDTO = new IrctcDTO();

			irctcDTO.setFirstName(objs.getfName());
			irctcDTO.setLastName(objs.getlName());
			irctcDTO.setDateOfBirth(objs.getDob());
			irctcDTO.setEmailId(objs.getEmailId());
			irctcDTO.setUsername(objs.getUsername());
			irctcDTO.setMobileNo(objs.getMobileNo());

			list.add(irctcDTO);
		}
		System.out.println("list of user" + list);
		return list;
	}

}
