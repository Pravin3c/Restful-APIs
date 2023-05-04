package com.pravin.webservices.skills.util;

import java.util.ArrayList;
import java.util.List;

import com.pravin.webservices.skills.model.Skill;

/**
 * 
 * @author pravin
 * Handcrafted data for skills api
 *
 */
public class SkillUtil {

	private List<Skill> skills = new ArrayList<Skill>();

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public void populateAllSkills() {
		getSkills().add(new Skill(1, "Java"));
		getSkills().add(new Skill(2, "J2EE"));
		getSkills().add(new Skill(3, "Spring"));
		getSkills().add(new Skill(4, "SpringBoot"));
		getSkills().add(new Skill(5, "SQL"));
		getSkills().add(new Skill(6, "REST"));
		getSkills().add(new Skill(7, "React"));
		getSkills().add(new Skill(8, "AWS"));
		getSkills().add(new Skill(9, "GCP"));
		getSkills().add(new Skill(10, "Docker"));
	}
}
