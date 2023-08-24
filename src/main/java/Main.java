package main.java;

import main.java.patterns.singleton.StartSingleton;
import main.java.patterns.state.StartState;
import main.java.reflection.StartReflection;

public class Main
{
    public static void main( String[] args )
    {
       Start start = new StartReflection();
       start.start();
    }
}
