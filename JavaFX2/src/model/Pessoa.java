package model;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Pessoa {

	private final StringProperty firstName;
	private final StringProperty Lastname;
	private final StringProperty street;
	private final IntegerProperty postalcode;
	private final StringProperty city;
	//private final ObjectProperty<LocalDate> birthday;

	public Pessoa(){
		this(null, null);
	}




	public Pessoa(String firstName, String lastName) {

		this.firstName = new SimpleStringProperty(firstName);
		this.Lastname = new SimpleStringProperty(lastName);
		this.street = new SimpleStringProperty(" ");
		this.postalcode = new SimpleIntegerProperty();
		this.city = new SimpleStringProperty(" ");
	}


	public StringProperty getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}



	public StringProperty getLastname() {
		return Lastname;
	}

	public void setLastname(String Lastname) {
		this.Lastname.set(Lastname);
	}


	public StringProperty getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street.set(street);
	}


	public IntegerProperty getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(Integer code) {
		this.postalcode.set(code);
	}


	public StringProperty getCity() {
		return city;
	}

	public void setCity(String cit) {
		this.city.set(cit);
	}


}
