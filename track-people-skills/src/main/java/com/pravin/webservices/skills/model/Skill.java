package com.pravin.webservices.skills.model;

/*import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;*/

//@Entity
public class Skill {

	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long skillId;

	private String skillName;

	public Skill() {

	}

	public Skill(long skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + "]";
	}

}
