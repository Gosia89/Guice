package pl.altkom.injection;

public class Person {
	
	String name;
	String nazwisko;
	int wiek;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNazwisko() {
		return nazwisko;
	}


	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}


	public int getWiek() {
		return wiek;
	}


	public void setWiek(int wiek) {
		this.wiek = wiek;
	}


	
	@Override
	public String toString() {
		return "ModelPerson [name=" + name + ", nazwisko=" + nazwisko
				+ ", wiek=" + wiek + "]";
	}
	
	
	
	
}