package main.java.patterns.singleton;

public class Singleton {
    private final StringBuilder singletonValue = new StringBuilder();
    private static Singleton singleton;

    private Singleton() {
    }

    public void addSingletonValue(String singletonValue) {
        this.singletonValue.append(singletonValue);
    }

    public String getSingletonValue() {
        return singletonValue.toString();
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
