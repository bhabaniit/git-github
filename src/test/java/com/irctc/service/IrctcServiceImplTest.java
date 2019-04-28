package com.irctc.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.irctc.dao.IrctcDAOImpl;
import com.irctc.dao.IrctcRepository;
import com.irctc.dto.IrctcDTO;
import com.irctc.form.IrctcForm;

import junit.framework.AssertionFailedError;

@RunWith(MockitoJUnitRunner.class)
public class IrctcServiceImplTest {
	@InjectMocks
	IrctcServiceImpl impl;
	@Mock
	IrctcDAOImpl dao;
	@Mock
	IrctcRepository irctcRepository;
	@Mock
	IrctcForm form;
	
	@Mock
	IrctcDTO irctcDTO;
	

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Before
	public void requestToAddUserMock() {
		form = new IrctcForm();
		form.setConfirmPassword("abc");
		form.setPassword("abc");
		form.setDob("1999-08-12");
		form.setEmailId("abc@gmail.com");
		form.setfName("bhabani");
		form.setlName("behera");
		form.setGender("male");
		form.setMobileNo(new BigInteger("6747838773"));
		form.setUsername("bhabanii");
	}
	@Before
	public void getAllUsersDetailsMock() throws ParseException {

		IrctcDTO irctcDTO=new IrctcDTO();
		irctcDTO.setFirstName("bhabani");
		irctcDTO.setLastName("behera");
		irctcDTO.setMobileNo(new BigInteger("8971273511"));
		irctcDTO.setUsername("bhabani@gmail.com");
		irctcDTO.setEmailId("geek.bhabani@gmail.com");
		irctcDTO.setDateOfBirth(new SimpleDateFormat("YYYY-MM-DD").parse("1992-07-12"));
		
		List<IrctcDTO> allUsers=new ArrayList<IrctcDTO>();
		allUsers.add(irctcDTO);
		
	}

	@Test
	public void addIrctcUserTest() throws ParseException {
		when(impl.addIrctcUser(form)).thenReturn(23);
		assertEquals(23, impl.addIrctcUser(form));
		assertNotSame("", impl.addIrctcUser(form));
		verify(dao, times(2)).registerUser(form);

	}
	@Test
	public void getAllUsernamesTest() {
		String userName[] = new String[] { "Lipu", "Bhabani", "Anil", "Khyama" }; 
		List<String> list = Arrays.asList(userName); 
		when(impl.getAllUsernames()).thenReturn(list);
		assertEquals(impl.getAllUsernames(), list);
		assertNotSame(null,impl.getAllUsernames());
		verify(irctcRepository, times(2)).findAllUsername();
		
	}
	@Test
	public void getAllUsersTest() throws ParseException {
		List<IrctcDTO> allUsers=new ArrayList<IrctcDTO>();
		allUsers.add(irctcDTO);
		
		when(impl.getAllUsers()).thenReturn(allUsers);
		assertEquals(impl.getAllUsers(), allUsers);
		assertNotSame(null, impl.getAllUsers());
		verify(dao, times(2)).getListOfUser();
		
		
	}
	
	
	

}
