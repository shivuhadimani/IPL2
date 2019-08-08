package com.unisys.iplpredictor.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unisys.iplpredictor.dao.iplTeamDao;
import com.unisys.iplpredictor.model.*;

@Service
public class teamServices {

	@Autowired
	iplTeamDao iplTeam;
	
	public List<Team> iplTeams(){
		return iplTeam.iplTeams();
	}
}
