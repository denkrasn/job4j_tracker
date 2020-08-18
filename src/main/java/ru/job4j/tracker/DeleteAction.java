package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("=== Item was delete ===");
        } else {
            System.out.println("=== Item was not delete ===");
        }
        return true;
    }
}
