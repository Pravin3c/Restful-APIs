package com.pravin.webservices.skills.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pravin.webservices.skills.model.Skill;
import com.pravin.webservices.skills.service.SkillsService;

@RestController
@RequestMapping("/skillsservice/api")
public class SkillsController {

	@Autowired
	SkillsService skillsService;

	@GetMapping("/skills")
	public ResponseEntity<List<Skill>> getAllSkills() {

		try {
			return new ResponseEntity<>(skillsService.getAllSkills(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/skills/{id}")
	public ResponseEntity<Skill> getSkillById(@PathVariable long id) {

		Skill skill = skillsService.getSkillById(id);

		if (skill != null) {
			return new ResponseEntity<>(skill, HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PostMapping("/skills")
	public ResponseEntity<Skill> addSkill(@RequestBody Skill skill) {

		try {
			Skill createdSkill = skillsService.addSkill(skill);
			return new ResponseEntity<>(createdSkill, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/skills/{id}")
	public ResponseEntity<Skill> update(@RequestBody Skill skill, @PathVariable long id) {
		try {
			Skill updatedSkill = skillsService.updateSkillById(id, skill);
			return new ResponseEntity<>(updatedSkill, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/skills")
	public ResponseEntity<HttpStatus> deleteAllSkill() {
		try {
			skillsService.deleteAllSkills();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/skills/{id}")
	public ResponseEntity<HttpStatus> deleteSkill(@PathVariable long id) {
		try {
			skillsService.deleteSkillById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
