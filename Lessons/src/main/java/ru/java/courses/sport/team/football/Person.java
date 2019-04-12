package ru.java.courses.sport.team.football;

public abstract class Person {
    protected String name;

    public Person(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("У спортсмена всегда должно быть имя!");
        } else {
            this.name = name;
        }
    }
}
