package com.pluralsight;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Emma", "Johnson", 28));
        people.add(new Person("Emma", "Smith", 34));
        people.add(new Person("Olivia", "Brown", 22));
        people.add(new Person("Noah", "Williams", 41));
        people.add(new Person("Ava", "Jones", 25));
        people.add(new Person("Elijah", "Garcia", 30));
        people.add(new Person("Sophia", "Miller", 27));
        people.add(new Person("James", "Davis", 36));
        people.add(new Person("Isabella", "Wilson", 31));
        people.add(new Person("Benjamin", "Taylor", 29));

        boolean running = true;

        while (running) {
            try {
                System.out.println("Search by: \n1) First Name\n2) Last Name\n3) Average Age\n4) Exit");
                System.out.println("Enter choice: ");
                int choice = read.nextInt();
                read.nextLine();

                switch (choice) {
                    case 1 -> searchByFirstName(people);
                    case 2 -> searchByLastName(people);
                    case 3 -> averageAge(people);
                    case 4 -> {
                        System.out.println("\nExiting. See you next time!");
                        running = false;
                    }
                    default -> System.out.println("Invalid option.");
                }

            } catch (InputMismatchException e) {
                System.out.println("\n❌ Invalid input. Please enter a valid number.\n");
                read.nextLine();
            } catch (Exception e) {
                System.out.println("❌ Unexpected Error: " + e.getMessage());
            }
        }

    }

    public static void searchByFirstName(List<Person> people) {
        System.out.println("Enter first name to search: ");
        String firstName = read.nextLine();

        List<Person> matchingName = people.stream()
                .filter(p -> p.getFirstName().toLowerCase().contains(firstName))
                .collect(Collectors.toList());

        if (matchingName.isEmpty()) {
            System.out.println("No matches found for first name: " + firstName);
        } else {
            System.out.println("Matching first Name: ");
            matchingName.forEach(System.out::println);
            System.out.println();
        }
    }

    public static void searchByLastName(List<Person> people) {
        System.out.println("Enter last name to search: ");
        String lastName = read.nextLine();

        List<Person> matchingName = people.stream()
                .filter(p -> p.getLastName().toLowerCase().contains(lastName))
                .collect(Collectors.toList());

        if (matchingName.isEmpty()) {
            System.out.println("No matches found for last name: " + lastName);
        } else {
            System.out.println("Matching last name: ");
            matchingName.forEach(System.out::println);
            System.out.println();
        }

    }

    public static double averageAge(List<Person> people) {
        double sum = people.stream()
                .map(Person::getAge)
                .reduce(0,Integer::sum);
        double averageAge = sum / people.size();

        List<Person> sortingAge = people.stream()
                .sorted(Comparator.comparingDouble(Person::getAge))
                .collect(Collectors.toList());

        Person youngestPerson = sortingAge.get(0);
        Person oldestPerson = sortingAge.get(sortingAge.size() - 1);

        System.out.printf("Average Age: %.2f", averageAge);
        System.out.println();
        System.out.println("Oldest person: " + oldestPerson);
        System.out.println("Youngest person: " + youngestPerson);
        return averageAge;
    }


}