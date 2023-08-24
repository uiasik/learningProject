package main.java.interfaceExample;

import main.java.Start;

public class StartInterface implements Start {
    @Override
    public void start() {
        Info info = new Person("vasya");
        System.out.println(info.showInfo());
        info = new Wino();
        System.out.println(info.showInfo());
    }
}
