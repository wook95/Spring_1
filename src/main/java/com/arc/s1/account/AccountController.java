package com.arc.s1.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arc.s1.member.MemberController;

@Controller
public class AccountController {

	@Autowired
	private MemberController memberController;
	
	
	
	@RequestMapping(value = "/account/accountAdd")
	public void accountAdd() {
		
		
		
	}
	
	@RequestMapping(value = "/account/accountAdd", method = RequestMethod.POST)
	public void accountAdd2() {
		
		
		
	}
	
	//-----------------------------------------------
	
	@RequestMapping(value = "/account/accountList")
	public void accountList() {
		
		
		
	}
	
	
	//------------------------------------------
	@RequestMapping(value = "/account/accountSelect")
	public void accountSelect() {
		
		
	
	}
	//------------------------------------------------
	
	@RequestMapping(value = "/account/accountUpdate")
	public void accountUpdate() {
		
	}
	@RequestMapping(value = "/account/accountUpdate",method = RequestMethod.POST)
	public void accountUpdate2() {
		
	}
	
	//-----------------------------------------------
	
	@RequestMapping(value="/account/accountDelete")
	public void accountDelete() {
		
		
		
	}
}
