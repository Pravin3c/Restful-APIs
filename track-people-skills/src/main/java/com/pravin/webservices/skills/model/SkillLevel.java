package com.pravin.webservices.skills.model;

public class SkillLevel {

	private String skillName;

	private String skillLevel;

	public SkillLevel(String skillName, String skillLevel) {
		super();
		this.skillName = skillName;
		this.skillLevel = skillLevel;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public SkillLevel() {

	}

	public String getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}

	@Override
	public String toString() {
		return "SkillLevel [skillName=" + skillName + ", skillLevel=" + skillLevel + "]";
	}

}
