package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        Object a;
        app.add(10,20);
        System.out.println( "Hello World!" );
    }
    public int add(int a,int b)
    {
        return a+b;
    }
}
