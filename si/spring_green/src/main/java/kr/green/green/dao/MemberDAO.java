package kr.green.green.dao;

import org.apache.ibatis.annotations.Param;

import kr.green.green.vo.MemberVO;

public interface MemberDAO {
	MemberVO getMember(@Param("me_id")String me_id);
}
