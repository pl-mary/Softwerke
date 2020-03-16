package impl;

import api.Greeting;

public class GreetingImpl implements Greeting {

    private final String m_name;

    public GreetingImpl(String name) {
        m_name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + m_name + "!");
    }
}