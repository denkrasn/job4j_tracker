package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Show all Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] ss = tracker.findAll();
        for (int index = 0; index < ss.length; index++) {
            out.println(ss[index]);
        }
        return true;
    }
}
