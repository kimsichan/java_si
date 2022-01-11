package kr.green.green.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.green.dao.MemberDAO;
import kr.green.green.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService {

	@Autowired
	MemberDAO memberDao;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public boolean singup(MemberVO user) {
		//회원가입 안되는 경우 확인해서 회원가입 진행
		if(user == null)
			return false;
		//가능한 아이디인지 확인
		if(user.getMe_id() == null || user.getMe_id().trim().length() == 0)
			return false;
		//가능한 비밀번호 인지 확인
		
		//성별 확인
		
		//가능하다면 회원가입을 진행
		//비밀번호 암호화
		String encPw = passwordEncoder.encode(user.getMe_pw());
		user.setMe_pw(encPw);
		memberDao.insertMember(user);
		return true;
	}

	@Override
	public MemberVO login(MemberVO user) {
		if(user == null || user.getMe_id() == null || user.getMe_id().trim().length() == 0)
			return null;
		MemberVO dbUser = memberDao.selectMember(user.getMe_id());
		if(dbUser == null)
			return null;
		//matches(원래 비번, 암호화된 비번) : 같으면(비번이 맞으면) true 다르면 false
		if(!passwordEncoder.matches(user.getMe_pw(), dbUser.getMe_pw()))
			return null;
		return dbUser;
	}

}
