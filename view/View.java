package view;

import java.util.List;

import model.Agents.CounterAgent;

public class View {
    public void showCounterAgents(List<CounterAgent> counterAgents) {
        for (CounterAgent CounterAgent : counterAgents) {
            System.out.println(CounterAgent.toString());
        }
    }
}
