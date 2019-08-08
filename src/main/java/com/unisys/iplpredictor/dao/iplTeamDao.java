package com.unisys.iplpredictor.dao;

import java.util.List;
import java.util.zip.CheckedOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.unisys.iplpredictor.model.Team;
import com.unisys.iplpredictor.queries.TeamQueries;


@Repository
public class iplTeamDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Team> iplTeams(){
		return jdbcTemplate.query(TeamQueries.GET_ALL_TEAM_NAMES,  (rs,i)->{
			return new Team(rs.getString(1));
		});
	}

}
