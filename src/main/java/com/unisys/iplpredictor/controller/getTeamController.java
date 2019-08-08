package com.unisys.iplpredictor.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.CheckedOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unisys.iplpredictor.model.Team;
import com.unisys.iplpredictor.serviceimpl.teamServices;


@RestController
public class getTeamController {
	
	@Autowired
	teamServices teamservice;

	@RequestMapping("/getTeams")
	public List<Team> getTeamName(){
		return teamservice.iplTeams();
	}
	
}
