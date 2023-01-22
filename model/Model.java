package model;

import java.util.ArrayList;
import java.util.List;

import model.Agents.Company;
import model.Agents.CounterAgent;
import model.Agents.Person;

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

    public void addContact(int choise, String name) {
        if (choise == 1) {
            counterAgents.add(new Person(name));
        }
        else if (choise == 2) {
            counterAgents.add(new Company(name));
        }
    }
}
