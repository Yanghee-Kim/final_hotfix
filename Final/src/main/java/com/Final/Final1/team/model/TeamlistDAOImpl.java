package com.Final.Final1.team.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeamlistDAOImpl implements TeamlistDAO {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate; //root-context�� ����

	
	@Override
	public List<TeamlistDTO> list(Map<String, Object> map) {
		
		return sqlSessionTemplate.selectList("team.list", map);
	}

	@Override
	public List<Map<String, Object>> taglist(Map<String, Object> map) {	

		return sqlSessionTemplate.selectList("team.taglist", map);
	}

	@Override
	public int teammake(Map<String, Object> map) {
		
		return sqlSessionTemplate.insert("team.teammake", map);
	}

	@Override
	public List<Map<String, Object>> tags(Map<String, Object> map) {
		return sqlSessionTemplate.selectList("team.tags", map);
	}

	@Override
	public int teamjoin(Map<String, Object> map) {
		System.out.println(map.toString());
		return sqlSessionTemplate.update("team.teamjoin", map);
	}

	@Override
	public Map<String, Object> teammakecheck(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("team.teammakecheck", map);
	}

	@Override
	public Map<String, Object> teammakecheck2(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("team.teammakecheck2", map);
	}

	@Override
	public int teammakeupdate(Map<String, Object> map) {
		return sqlSessionTemplate.update("team.teammakeupdate", map);
	}

	@Override
	public int teamsecession(Map<String, Object> map) {
		return sqlSessionTemplate.update("team.teamsecession", map);
	}
	
	@Override
	public int teamsecessiondelete(Map<String, Object> map) {
		return sqlSessionTemplate.update("team.teamsecessiondelete", map);
	}

	@Override
	public String teamsecession_teamleader(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("team.teamsecession_teamleader", map);
	}

	@Override
	public void teamsecession_teamleaderdelete(Map<String, Object> map) {
		sqlSessionTemplate.delete("team.teamsecession_teamleaderdelete", map);
	}

	@Override
	public String teamjoin_team(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("team.teamjoin_team", map);
	}

	@Override
	public void teamjoininsert(Map<String, Object> map) {
		sqlSessionTemplate.insert("team.teamjoininsert", map);
	}

	@Override
	public List<Map<String, Object>> teaminfo_notice(Map<String, Object> map) {

		return sqlSessionTemplate.selectList("team.teaminfo_notice", map);
	}

	@Override
	public List<Map<String, Object>> teaminfo_teamleader(Map<String, Object> map) {
		
		return sqlSessionTemplate.selectList("team.teaminfo_teamleader", map);
	}

	@Override
	public List<Map<String, Object>> teaminfo_members(Map<String, Object> map) {
		
		return sqlSessionTemplate.selectList("team.teaminfo_members", map);
	}


}
