package com.main.person;

public interface PersonService {

	void InsertData(Person person);

	void DisplayData();

	void DeleteData(Person p);

	Person FindPerson(int pid);

	void UpdateData(Person p);
}
