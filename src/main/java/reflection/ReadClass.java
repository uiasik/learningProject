package main.java.reflection;

public class ReadClass {
    private Class someClass;

    public void read(Object object){
        someClass = object.getClass();
    }

    public void readPath(String path){
        try {
            someClass = Class.forName(path);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Class getSomeClass() {
        return someClass;
    }
}
