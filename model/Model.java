package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        List<CounterAgent> foundAgents = new ArrayList<>();
        for (CounterAgent counterAgent : counterAgents) {
            if (counterAgent.getName().equalsIgnoreCase(name)) {
                foundAgents.add(counterAgent);
            }
        }
        scan.close();
        return foundAgents;
    }
}   
