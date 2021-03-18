package com.arc.s1.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

	
	@Autowired
	private MemberService memberService;
	
	
	
	//객체 어노테이션으로 만
	@RequestMapping(value = "/member/memberLogin")
	public String memberLogin() {
		//		parameter 도 HttpServletrequest requeset에서 String name으
//		String name = request.getParameter("name");
//		int age =Integer.parseInt(request.getParameter("age"));
		
		System.out.println("login");
//		System.out.println(name);
		
		return "/member/memberLogin";
		//servlet-context에서 prefix, suffix를 통해 jsp파일로 가라고함
	}
	
	@RequestMapping(value="/member/memberLogin", method = RequestMethod.POST)
	public void memberLogin2(HttpServletRequest request) throws Exception {
		
		String id =request.getParameter("id");
		String pw =request.getParameter("pw");
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		memberDTO.setPw(pw);
		
		
		memberService.memberLogin(memberDTO);
		System.out.println(memberDTO.getEmail());
		
	}
	
	
	
	//memberJoin /member/memberJoin get
	//memberJoin2 /member/memberJoin Post
	
	@RequestMapping(value = "/member/memberJoin")
	public String memberJoin() {
		return "/member/memberJoin";
	}
	
	@RequestMapping(value = "/member/memberJoin", method = RequestMethod.POST)
	public void memberJoin2(String id, String pw, String name,String phone, String email) throws Exception {
		
		MemberDTO mDTO = new MemberDTO();
		mDTO.setId(id);
		mDTO.setPw(pw);
		mDTO.setEmail(email);
		mDTO.setName(name);
		mDTO.setPhone(phone);
		
		int result =memberService.memberJoin(mDTO);
		
		System.out.println(mDTO.getId());
		System.out.println(mDTO.getPw());
		System.out.println(mDTO.getName());
		System.out.println(mDTO.getEmail());
		
	}
	
	
}
