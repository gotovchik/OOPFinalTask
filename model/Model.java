package model;

import java.util.ArrayList;
import java.util.List;

import model.Agents.CounterAgent;

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
}   
