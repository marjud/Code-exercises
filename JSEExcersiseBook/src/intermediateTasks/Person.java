package intermediateTasks;

public class Person {
	String name;
	int person_age;
	String person_jobTitle;
	
	public Person(String name) {
		System.out.println("Name: " + name);
	}

	public static void main(String[] args) {
		Person newPerson = new Person("Ronald");
		newPerson.setAge(55);
		newPerson.getAge();
		newPerson.setJobTitle("Builder");
		newPerson.getJobtitle();
	}
	
	private void setAge(int age) {
		person_age = age;
	}
	private int getAge() {
		System.out.println("Age: "+ person_age);
		return person_age;
	}
	
	private void setJobTitle(String jobTitle) {
		person_jobTitle = jobTitle;
	}
	private String getJobtitle() {
		System.out.println("Occupation:   " + person_jobTitle);
		return person_jobTitle;
	}
	
	
}
