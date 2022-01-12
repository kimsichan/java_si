package kr.green.green.service;


import kr.green.green.vo.MemberVO;

public interface MemberService {


	boolean singup(MemberVO user);

	MemberVO login(MemberVO user);


}
