package main.java.patterns.singleton;

import main.java.Start;

public class StartSingleton implements Start {
    @Override
    public void start() {
        Singleton singleton = Singleton.getSingleton();
        singleton.addSingletonValue("5678");
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2.getSingletonValue());
    }
}
