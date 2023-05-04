package com.pravin.webservices.skills.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pravin.webservices.skills.model.People;
import com.pravin.webservices.skills.repository.PeopleSkillRepository;
import com.pravin.webservices.skills.util.PeopleSkillUtil;

@Service
//@Transactional
public class PeopleSkillService {

	@Autowired
	PeopleSkillRepository peopleSkillRepository;

	static PeopleSkillUtil peopleSkillUtil = new PeopleSkillUtil();

	static {
		peopleSkillUtil.populatePeopleWithSkills();
	}

	public List<People> getAllPeoples() {
		// return peopleSkillRepository.findAll();
		return peopleSkillUtil.getPeoples(); // handcrafted data
	}

	public People getPeopleById(long id) {
		// return peopleSkillRepository.getReferenceById(id);
		People people = peopleSkillUtil.getPeoples().stream().filter(p -> p.getPeopleId() == id).findAny().orElse(null); // handcrafted
																															// data
		return people;
	}

	public People addPeopleWithSkills(People people) {
		// return peopleSkillRepository.save(people);

		// handcrafted data
		long maxKey = peopleSkillUtil.getPeoples().stream().map(p -> p.getPeopleId()).max(Long::compareTo).orElse(null);

		People newPeople = new People();
		newPeople.setPeopleId(++maxKey);
		newPeople.setPeopleName(people.getPeopleName());
		newPeople.setSkills(people.getSkills());

		peopleSkillUtil.getPeoples().add(newPeople);

		return newPeople;
	}

	public People updatePeopleById(long id, People people) {
		// People updatedPeople = peopleSkillRepository.getReferenceById(id);
		// updatedPeople.setPeopleName(people.getPeopleName());
		// updatedPeople.setSkills(people.getSkills());
		// peopleSkillRepository.save(people);
		// handcrafted data
		peopleSkillUtil.getPeoples().stream().filter(p -> p.getPeopleId() == id)
				.forEach(p -> p.setPeopleName(people.getPeopleName()));

		peopleSkillUtil.getPeoples().stream().filter(p -> p.getPeopleId() == id)
				.forEach(p -> p.setSkills(people.getSkills()));

		return peopleSkillUtil.getPeoples().stream().filter(p -> p.getPeopleId() == id).findAny().orElse(null);
	}

	public void deletePeopleById(long id) {
		// peopleSkillRepository.deleteById(id);
		peopleSkillUtil.getPeoples().removeIf(p -> p.getPeopleId() == id);// handcrafted data

	}

	public void deleteAllPeoples() {
		// peopleSkillRepository.deleteAll();
		peopleSkillUtil.getPeoples().clear();// handcrafted data

	}
}
