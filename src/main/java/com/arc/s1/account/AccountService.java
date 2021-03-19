package com.arc.s1.account;

import java.util.List;

public class AccountService {

	private AccountDAO accountDAO;
	
	
	public List<AccountDTO> accountList() throws Exception{
		
		
		List<AccountDTO> ar = accountDAO.getList();
		
		return ar;
		
	}
	
	
}
