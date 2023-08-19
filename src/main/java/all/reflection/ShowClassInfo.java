package all.reflection;

import java.lang.reflect.*;

public class ShowClassInfo {
    private final Class someClass;

    public void showFields(){
        Field[] fields = someClass.getDeclaredFields();
        System.out.println("fields");
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));
        }
    }
    public void showMethod(){
        Method[] methods = someClass.getDeclaredMethods();
        System.out.println("methods");
        for (Method method : methods) {
            System.out.println(method.getName());
            showParameters(method.getParameters());
        }
    }

    public void showConstructor(){
        Constructor[] constructors = someClass.getDeclaredConstructors();
        System.out.println("constructors");
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            showParameters(constructor.getParameters());
        }
    }

    private void showParameters(Parameter[] parameters){
        System.out.println("parameters");
        for (Parameter parameter : parameters) {
            System.out.println(parameter.getName());
            System.out.println(parameter.getType().getName());
        }
        System.out.println();
    }

    public ShowClassInfo(Class someClass) {
        this.someClass = someClass;
    }
}
