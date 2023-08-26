package main.java;


import main.java.patterns.abstractFactory.StartAbstractFactory;

public class Main
{
    public static void main( String[] args )
    {
       main.java.Start start = new StartAbstractFactory();
       start.start();
    }
}
