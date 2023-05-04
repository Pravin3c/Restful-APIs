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

import com.pravin.webservices.skills.model.People;
import com.pravin.webservices.skills.service.PeopleSkillService;

@RestController
@RequestMapping("/peopleservice/api")
public class PeopleSkillController {
	
	@Autowired
	PeopleSkillService peopleSkillService;
	
	@GetMapping("/peoples")
	public ResponseEntity<List<People>> getAllPeoples() {

		try {
			return new ResponseEntity<>(peopleSkillService.getAllPeoples(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/peoples/{id}")
	public ResponseEntity<People> getPeopleById(@PathVariable long id) {

		People people = peopleSkillService.getPeopleById(id);

		if (people != null) {
			return new ResponseEntity<>(people, HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/peoples")
	public ResponseEntity<People> addPeople(@RequestBody People people) {

		try {
			People newPeople = peopleSkillService.addPeopleWithSkills(people);
			return new ResponseEntity<>(newPeople, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/peoples/{id}")
	public ResponseEntity<People> update(@RequestBody People people, @PathVariable long id) {
		try {
			People updatedPeople = peopleSkillService.updatePeopleById(id, people);
			return new ResponseEntity<>(updatedPeople, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/peoples")
	public ResponseEntity<HttpStatus> deleteAllPeople() {
		try {
			peopleSkillService.deleteAllPeoples();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/peoples/{id}")
	public ResponseEntity<HttpStatus> deletePeople(@PathVariable long id) {
		try {
			peopleSkillService.deletePeopleById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
