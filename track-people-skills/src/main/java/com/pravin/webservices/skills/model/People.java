package com.pravin.webservices.skills.model;

import java.util.List;

/*import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;*/

//@Entity
public class People {

	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	public long peopleId;

	public String peopleName;

	public List<SkillLevel> skills;

	public People(long peopleId, String peopleName, List<SkillLevel> skills) {
		super();
		this.peopleId = peopleId;
		this.peopleName = peopleName;
		this.skills = skills;
	}
	
	public People() {
	}

	public List<SkillLevel> getSkills() {
		return skills;
	}

	public void setSkills(List<SkillLevel> skills) {
		this.skills = skills;
	}

	public long getPeopleId() {
		return peopleId;
	}

	public void setPeopleId(long peopleId) {
		this.peopleId = peopleId;
	}

	public String getPeopleName() {
		return peopleName;
	}

	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}

}
