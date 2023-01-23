package model.Agents;

import java.util.List;

import model.Contacts.Contact;

public class Person extends CounterAgent {
    private String name;
    private List<Contact> contacts;
    
    public Person(String name, List<Contact> contacts) {
        super(name, contacts);
        //TODO Auto-generated constructor stub
    }
}
