package intermediateTasks;

import java.util.ArrayList;

public class Person {
	String person_name;
	int person_age;
	String person_jobTitle;
	
	public static void main(String[] args) {
		Person newPerson = new Person();
		newPerson.getName();
		newPerson.setName("Bob");		
		newPerson.setAge(55);
		newPerson.getAge();
		newPerson.setJobTitle("Builder");
		newPerson.getJobtitle();
		
		Person secondPerson = new Person();
		secondPerson.getName();
		secondPerson.setName("Tracey");
		secondPerson.setAge(53);
		secondPerson.getAge();
		secondPerson.setJobTitle("Administrator");
		secondPerson.getJobtitle();
		
		Person thirdPerson = new Person();
		thirdPerson.getName();
		thirdPerson.setName("Simon");
		thirdPerson.setAge(12);
		thirdPerson.getAge();
		thirdPerson.setJobTitle("Fireman");
		thirdPerson.getJobtitle();
		
		ArrayList<Person> personObjects = new ArrayList<Person>();
		personObjects.add(newPerson);
		personObjects.add(secondPerson);
		personObjects.add(thirdPerson);
		
		for(Person i : personObjects) {
			System.out.println(i.getName());
			System.out.println(i.getAge());
			System.out.println(i.getJobtitle());
			
		}
	}
	
	private void setAge(int age) {
		person_age = age;
	}
	private int getAge() {
		//System.out.println("Age: "+ person_age);
		return person_age;
	}
	
	private void setJobTitle(String jobTitle) {
		person_jobTitle = jobTitle;
	}
	private String getJobtitle() {
		//System.out.println("Occupation: " + person_jobTitle);
		return person_jobTitle;
	}
	
	public String getName() {
		//System.out.println("Name: " + person_name);
		return person_name;
	}

	public void setName(String person_name) {
		this.person_name = person_name;
	}
	
	public void personSearcher(String person1, String person2, String person3) {
		
		
	}
	
}
