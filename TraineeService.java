package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Operator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.Operation;
import com.cg.entities.Trainee;

@Service
@Transactional
public class TraineeService 
{
	@Autowired
	Operation op;
	
	public void addTraineeService(Trainee tr)
	{
		op.addtoTableDao(tr);
	}

	public void deleteTraineeService(Integer id)
	{
		op.deleteFromTableDao(id);
		
	}

	public List<Trainee> retriveAllService() 
	{
		
		List<Trainee> l=op.retriveFromTableDao();
		return l;
	}
	public Trainee retriveByIdService(int id)
	{
		return op.retriveFromTableByIdDao(id);
	}
	
}
