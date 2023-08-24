package main.java.interfaceExample;

public class Person implements Info{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String showInfo() {
        return "Hello! I'm " + name;
    }
}