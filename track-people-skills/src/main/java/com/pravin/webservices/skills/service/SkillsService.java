package com.pravin.webservices.skills.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pravin.webservices.skills.model.Skill;
import com.pravin.webservices.skills.repository.SkillRepository;
import com.pravin.webservices.skills.util.SkillUtil;

@Service
//@Transactional
public class SkillsService {

	@Autowired
	SkillRepository skillRepository;

	
	static SkillUtil skillUtil = new SkillUtil();

	static {
		skillUtil.populateAllSkills();//populated handcrafted data for Skills
	}

	public List<Skill> getAllSkills() {
		// return skillRepository.findAll();
		
		return skillUtil.getSkills(); // handcrafted data
	}

	public Skill getSkillById(long id) {
		// return skillRepository.getReferenceById(id);
		
		Skill skill = skillUtil.getSkills().stream().filter(sk -> sk.getSkillId() == id).findAny().orElse(null);// handcrafted
																												// data
		return skill;
	}

	public Skill addSkill(Skill skill) {
		// return skillRepository.save(skill);
		
		long maxKey = skillUtil.getSkills().stream().map(sk -> sk.getSkillId()).max(Long::compareTo).orElse(null);
		Skill newSkill = new Skill();
		newSkill.setSkillId(++maxKey);
		newSkill.setSkillName(skill.getSkillName());
		skillUtil.getSkills().add(newSkill);
		// handcrafted data
		return newSkill;
	}

	public Skill updateSkillById(long id, Skill skill) {
		// Skill skill = skillRepository.getReferenceById(id);
		// skill.setSkillName("updated skill");
		// skillRepository.save(skill);
		
		// handcrafted data
		skillUtil.getSkills().stream().filter(sk -> sk.getSkillId() == id)
				.forEach(sk1 -> sk1.setSkillName(skill.getSkillName()));

		return skillUtil.getSkills().stream().filter(sk -> sk.getSkillId() == id).findAny().orElse(null);
	}

	public void deleteSkillById(long id) {
		// skillRepository.deleteById(id);//handcrafted data
		
		skillUtil.getSkills().removeIf(skill -> skill.getSkillId() == id);

	}

	public void deleteAllSkills() {
		// skillRepository.deleteAll();//handcrafted data
		
		skillUtil.getSkills().clear();

	}
}
