package com.arc.s1.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	
	//db 연동
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		
		
		memberDTO= memberDAO.login(memberDTO);
		
		
		return memberDTO;
		
	}
	
	
	public int memberJoin(MemberDTO memberDTO) throws Exception{
		
		return memberDAO.memberJoin(memberDTO);
		
	}
	
	
}
