package org.example;

public class Person {
    private String name;
    private String parent;

    public Person(String name, String parent) {
        this.name = name;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public String getParent() {
        return parent;
    }
}
