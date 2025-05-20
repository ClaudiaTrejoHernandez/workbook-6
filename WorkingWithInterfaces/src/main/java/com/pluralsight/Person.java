package com.pluralsight;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        int lastNameCompare = this.lastName.compareTo(other.lastName);
        if (lastNameCompare != 0) return lastNameCompare;

        int firstNameCompare = this.firstName.compareTo(other.firstName);
        if (firstNameCompare != 0) return firstNameCompare;

        return Integer.compare(this.age, other.age);
        }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }
}
