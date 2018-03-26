package com.cn24.member.service;

import com.cn24.member.dao.MemberDao;
import com.cn24.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService{
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public boolean createMember(MemberVO memberVO) {
		return memberDao.insertMember(memberVO) > 0;
	}
	
	@Override
	public MemberVO readMember(MemberVO memberVO) {
		// salt logic 추가
		
		return memberDao.selectMember(memberVO);
	}
}
