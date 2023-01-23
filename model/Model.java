package model;

import java.util.ArrayList;
import java.util.List;

import model.Agents.Company;
import model.Agents.CounterAgent;
import model.Agents.Person;
import model.Contacts.Contact;

public class Model {
    private List<CounterAgent> counterAgents;

    public List<CounterAgent> getCounterAgents() {
        return counterAgents;
    }

    public Model(List<CounterAgent> counterAgents) {
        this.counterAgents = counterAgents;
    }

    public List<CounterAgent> findAgentByName(String name) {
        List<CounterAgent> foundAgents = new ArrayList<>();
        for (CounterAgent counterAgent : counterAgents) {
            if (counterAgent.getName().equalsIgnoreCase(name)) {
                foundAgents.add(counterAgent);
            }
        }
        return foundAgents;
    }

    public void addAgent(int choise, String name, Contact contact) {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(contact);
        if (choise == 1) {
            counterAgents.add(new Person(name, contacts));
        } else if (choise == 2) {
            counterAgents.add(new Company(name, contacts));
        }
    }

    public void removeAgent(String name) {
        counterAgents.removeAll(findAgentByName(name));
    }

    public void addNewContact(String name, Contact contact) {
        for (CounterAgent counterAgent : findAgentByName(name)) {
            counterAgent.addContact(contact);
        }
    }

    public void removeContact(String name, String value) {

        for (CounterAgent counterAgent : findAgentByName(name)) {
            Contact contactForRemove = null;
            for (Contact contact : counterAgent.getContacts()) {
                if (contact.getName().equalsIgnoreCase(value)) {
                    contactForRemove = contact;
                    break;
                } 
            }
            counterAgent.getContacts().remove(contactForRemove);
        }

    }
}
