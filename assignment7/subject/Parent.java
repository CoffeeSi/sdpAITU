package subject;

import java.util.ArrayList;
import java.util.List;

import interfaces.IUser;

public class Parent implements IUser {
    private String name;
    private List<Student> children;

    public Parent(String name, Student child) {
        this.name = name;
        children = new ArrayList<>();
        this.children.add(child);
    }

    public String getName() { return name; }
    public List<Student> getChildren() { return children; }

    public void addChild(Student child) {
        if (!children.contains(child)) {
            children.add(child);
        }
    }

    @Override
    public void update(String message) {
        for (Student child : children) {
            System.out.println(name + " (" + child.getName() + "'s parent) got message: " + message);
        }
    }

    @Override
    public String toString() {
        return "Parent " + name;
    }
}
