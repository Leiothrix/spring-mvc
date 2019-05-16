package com.paprika.dao;

import com.paprika.model.EmployeeVO;

import java.util.List;

public interface EmployeeDAO 
{
	public List<EmployeeVO> getAllEmployees();
}