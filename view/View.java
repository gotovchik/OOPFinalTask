package view;

import java.util.List;

import model.Agents.CounterAgent;

public class View {
    public void showCounterAgents(List<CounterAgent> counterAgents) {
        if (counterAgents.isEmpty()) {
            System.out.println("Список пуст/контактов по запросу не найдено.");
        } else {
            for (CounterAgent CounterAgent : counterAgents) {
                System.out.println(CounterAgent.toString());
                System.out.println("--------------------------------");
            }
        }
    }

    public void showMenu() {
        System.out.println("Выберите пункт меню: ");
        System.out.println("  [1 + Enter] - Посмотреть список всех контактов");
        System.out.println("  [2 + Enter] - Найти контакт");
        System.out.println("  [3 + Enter] - Добавить контакт");
        System.out.println("  [4 + Enter] - Удалить контакт");
        System.out.println("  [5 + Enter] - Добавить новый способ связи с контактом");
        System.out.println("  [6 + Enter] - Удалить способ связи с контактом");
        System.out.println("  [0 + Enter] - Выход из приложения");
    }

    public void greeting() {
        System.out.println("Вас приветствует приложение \"Мои контакты\"!");
    }

    public void goodBye() {
        System.out.println("Спасибо, что воспользовались приложением \"Мои контакты\".\n Всего доброго!");
    }
}
