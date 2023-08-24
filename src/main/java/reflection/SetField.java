package main.java.reflection;

import java.lang.reflect.Field;

public class SetField {
    private final Class someClass;
    private final Object obj;

    public void setField(String fieldName, String value) {
        Field field;

        try {
            field = someClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        field.setAccessible(true);
        try {
            field.set(obj, value);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public SetField(Class someClass, Object obj) {
        this.someClass = someClass;
        this.obj = obj;
    }
}
