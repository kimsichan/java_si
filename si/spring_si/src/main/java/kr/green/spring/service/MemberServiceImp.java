package kr.green.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService {

		@Autowired
		MemberDAO memberDao;
		@Autowired
		BCryptPasswordEncoder passwordEncoder;
		
		@Override
		public MemberVO login(MemberVO member) {
			if(member == null || member.getMe_id() == null)
				return null;
			MemberVO user = memberDao.getMember(member.getMe_id());
			if(user == null)
				return null;
			//matches(원래 비번, 암호화된 비번) : 같으면(비번이 맞으면) true 다르면 false
			if(passwordEncoder.matches(member.getMe_pw(), user.getMe_pw()))
				return user;
			return null;
		}

		@Override
		public boolean signup(MemberVO user) {
			if(user == null)
				return false;
			if(user.getMe_id()== null)//필수항목 아이디가 null인지 체크
				return false;
			if(user.getMe_pw()== null)//필수항목 아이디가 null인지 체크
				return false;
			//이미 가입된 아이디인지 체크. 아이디 중복검사
			if(memberDao.getMember(user.getMe_id()) != null)
				return false;
			//암호환된 비밀번호
			String encPw = passwordEncoder.encode(user.getMe_pw());
			user.setMe_pw(encPw);
			memberDao.insertMember(user);
			return true;
		}
}
