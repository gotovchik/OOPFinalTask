package model.Agents;

import java.util.List;

import model.Contacts.Contact;

public class Person extends CounterAgent {
    public Person(String name, List<Contact> contacts) {
        super(name, contacts);
    }
    
}
