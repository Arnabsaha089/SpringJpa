package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.Trainee;
import com.cg.service.TraineeService;

import java.util.List;

@Controller
public class ControlTrainee
{
	
	@Autowired
	TraineeService trs;
	
	
	
	@RequestMapping("login")
	public String loginCheck(@RequestParam("uname")String name,@RequestParam("upass")String pass)
	{
		if(name.equals("admin") && pass.equals("1234"))
		
			return "Choice";
		else
			
			return "Login";	
		
	}
	
	@RequestMapping("add")
	public String addTrainee(Model m)
	{
		Trainee t=new Trainee();
		m.addAttribute("t", t);
		return "addT";
	}
	
	
	@RequestMapping("addService")
	public String addServiceControl(@ModelAttribute("t")Trainee t,Model m)
	{
		
		m.addAttribute("t",t);
		trs.addTraineeService(t);
		//System.out.print("GGGGGGGGGGGGG");
		return "success";
	}
	
	@RequestMapping("delete")
	public String deleteTrainee()
	{
		
		return "delete";
		
	}
	
	@RequestMapping("deleteService")
	public String deleteTraineeControl(@RequestParam("id") Integer id, Model m)
	{
		trs.deleteTraineeService(id);
		return "success";
	}
	
	@RequestMapping("retriveall")
	public String retriveAllControl(Model m)
	{
		
		List <Trainee> ls=trs.retriveAllService();
		m.addAttribute("list",ls);
		return "RetriveAll";
	}
	
	@RequestMapping("retrive")
	public String retriveOne()
	{
		return "RetriveById";
	}
	
	@RequestMapping("retriveById")
	public String retriveById(@RequestParam("id") Integer id,Model m)
	{
		Trainee t=trs.retriveByIdService(id);
		m.addAttribute("t",t);
		return "RetriveOne";
	}
	
	
	@RequestMapping("modify")
	public String  modifyById()
	{
		
		return "Modify";
	}
	
	
	@RequestMapping("ModifybuId")
	public String Modify(@RequestParam("id") Integer id,Model m)
	{
		trs.deleteTraineeService(id);
		
		return addTrainee(m);
	}
	
	
}
