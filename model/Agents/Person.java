package model.Agents;

import java.time.LocalDate;
import java.util.List;

import model.Contacts.Contact;

public class Person extends CounterAgent {
    private String name;
    private LocalDate birthday;
    private List<Contact> contacts;

    public Person(String name, LocalDate birthday, List<Contact> contacts) {
        this.name = name;
        this.birthday = birthday;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Имя: " + name + " | Дата рождения: " + birthday + "\n");
        for (Contact contact : contacts) {
            sb.append("  " + contact.toString() + "\n");
        }
        return sb.toString();
    }

    
    
}
