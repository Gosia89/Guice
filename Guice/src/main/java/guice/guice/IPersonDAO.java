package guice.guice;

import java.util.List;

public interface IPersonDAO {
	
	public void savePersons(Person persons);
	public void savePersons(List<Person> persons);
	public List<Person> getPersons();
	
	

}
