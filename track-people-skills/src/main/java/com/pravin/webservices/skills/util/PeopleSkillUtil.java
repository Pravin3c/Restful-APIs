package com.pravin.webservices.skills.util;

import java.util.ArrayList;
import java.util.List;

import com.pravin.webservices.skills.model.People;
import com.pravin.webservices.skills.model.SkillLevel;
/**
 * 
 * @author pravin
 * Handcrafted data for People and associated skills for peopleskill api
 *
 */
public class PeopleSkillUtil {

	private List<People> peoples = new ArrayList<People>();

	public List<People> getPeoples() {
		return peoples;
	}

	public void setPeoples(List<People> peoples) {
		this.peoples = peoples;
	}

	public void populatePeopleWithSkills() {

		SkillLevel dockerExpert = new SkillLevel();
		dockerExpert.setSkillName("Docker");
		dockerExpert.setSkillLevel("Expert");

		SkillLevel javaExpert = new SkillLevel();
		javaExpert.setSkillName("Java");
		javaExpert.setSkillLevel("Expert");

		SkillLevel j2eeExpert = new SkillLevel();
		j2eeExpert.setSkillName("J2EE");
		j2eeExpert.setSkillLevel("Expert");

		SkillLevel springExpert = new SkillLevel();
		springExpert.setSkillName("Spring");
		springExpert.setSkillLevel("Expert");

		SkillLevel springPractitioner = new SkillLevel();
		springPractitioner.setSkillName("Spring");
		springPractitioner.setSkillLevel("Practitioner");

		SkillLevel sqlPractitioner = new SkillLevel();
		sqlPractitioner.setSkillName("SQL");
		sqlPractitioner.setSkillLevel("Practitioner");

		SkillLevel restPractitioner = new SkillLevel();
		restPractitioner.setSkillName("REST");
		restPractitioner.setSkillLevel("Practitioner");

		SkillLevel reactWorking = new SkillLevel();
		reactWorking.setSkillName("React");
		reactWorking.setSkillLevel("Working");

		SkillLevel springBootWorking = new SkillLevel();
		springBootWorking.setSkillName("SpringBoot");
		springBootWorking.setSkillLevel("Working");

		SkillLevel awsAwareness = new SkillLevel();
		awsAwareness.setSkillName("AWS");
		awsAwareness.setSkillLevel("Awareness");

		SkillLevel gcpAwareness = new SkillLevel();
		gcpAwareness.setSkillName("GCP");
		gcpAwareness.setSkillLevel("Awareness");

		SkillLevel dockerAwareness = new SkillLevel();
		dockerAwareness.setSkillName("Docker");
		dockerAwareness.setSkillLevel("Awareness");

		List<SkillLevel> markSkillList = new ArrayList<>();
		markSkillList.add(javaExpert);
		markSkillList.add(j2eeExpert);
		markSkillList.add(springExpert);
		getPeoples().add(new People(1, "Mark", markSkillList));

		List<SkillLevel> viratSkillList = new ArrayList<>();
		viratSkillList.add(dockerAwareness);
		viratSkillList.add(springBootWorking);
		getPeoples().add(new People(2, "Virat", viratSkillList));

		List<SkillLevel> shikharSkillList = new ArrayList<>();
		shikharSkillList.add(dockerAwareness);
		shikharSkillList.add(springBootWorking);
		getPeoples().add(new People(3, "Shikhar", shikharSkillList));

		List<SkillLevel> dhoniSkillList = new ArrayList<>();
		dhoniSkillList.add(awsAwareness);
		dhoniSkillList.add(gcpAwareness);
		getPeoples().add(new People(4, "Dhoni", dhoniSkillList));

		List<SkillLevel> joeSkillList = new ArrayList<>();
		joeSkillList.add(sqlPractitioner);
		joeSkillList.add(restPractitioner);
		getPeoples().add(new People(5, "Joe", joeSkillList));

		List<SkillLevel> modiSkillList = new ArrayList<>();
		modiSkillList.add(sqlPractitioner);
		modiSkillList.add(restPractitioner);
		getPeoples().add(new People(6, "Modi", modiSkillList));

		List<SkillLevel> msSkillList = new ArrayList<>();
		msSkillList.add(javaExpert);
		msSkillList.add(j2eeExpert);
		getPeoples().add(new People(7, "MS", msSkillList));
		
		List<SkillLevel> rajSkillList = new ArrayList<>();
		rajSkillList.add(javaExpert);
		rajSkillList.add(j2eeExpert);
		rajSkillList.add(springPractitioner);
		getPeoples().add(new People(8, "Raj", rajSkillList));
		
		List<SkillLevel> ramSkillList = new ArrayList<>();
		ramSkillList.add(restPractitioner);
		ramSkillList.add(sqlPractitioner);
		getPeoples().add(new People(9, "Ram", ramSkillList));
		
		List<SkillLevel> saranyaSkillList = new ArrayList<>();
		saranyaSkillList.add(restPractitioner);
		getPeoples().add(new People(10, "Saranya", saranyaSkillList));

	}

}
