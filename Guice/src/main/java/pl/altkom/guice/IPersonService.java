package pl.altkom.injection;

import java.util.List;

public interface IPersonService {
	
	public void savePersons(Person persons);
	public void savePersons(List<Person> persons);
	public List<Person> getTeenagers();
	public List<Person> getAdults();

}
