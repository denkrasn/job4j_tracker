package ru.job4j.tracker;

public class FindByNameAction implements UserAction{
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Enter name: ");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        for (int index = 0; index < items.length; index++) {
            System.out.println(items[index]);
        }
        return true;
    }
}
