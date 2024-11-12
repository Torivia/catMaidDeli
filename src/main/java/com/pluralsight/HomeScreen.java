package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class HomeScreen {
    public void displayHomeScreen() {
        System.out.println("Welcome, user, to the Maid Cat Cafe! How can I help?\n" +
                "1) New Order\n" +
                "0) Exit");
    }
//    List<Person> classPhoenix = new ArrayList<>();
//    Scanner scanner = new Scanner(System.in);
//    Person p1 = new Person ("Toori", "varg");
//    Person.add(new Person("torivia", "vargas");
//    for(person _person: classPhoenix)
//        if(_person.getAge <25) {
//            selectedPerople.add(_person);
//    }
//
//    // Step 3: Calculate and display the average age double averageAge = people.stream().mapToInt(Person::getAge).average().orElse(0); System.out.println("\nAverage age of all people: " + averageAge); // Find and display the age of the oldest person int maxAge = people.stream().mapToInt(Person::getAge).max().orElse(0); System.out.println("Age of the oldest person: " + maxAge); // Find and display the age of the youngest person int minAge = people.stream().mapToInt(Person::getAge).min().orElse(0); System.out.println("Age of the youngest person: " + minAge);
//    List<Person> classPhoenix = new ArrayList<>();
//    Person p1 = new Person("Brian","Garcia",30);
//    classPhoenix.add(new Person("John", "Doe", 25));
//    classPhoenix.add(new Person("Mike", "Johnson", 22));
//    classPhoenix.add(p1);classPhoenix.add(new Person("Jane", "Smith", 32));
//
//    List<Person> selectedPeople = new ArrayList<>();
//
//    // loop through all Persons
//    for (Person _person : classPhoenix)
//            if (_person.getAge() < 30) {
//        // Pseudocode: How can I add that person to the list?
//        selectedPeople.add(_person);
//    }
//    // WHen you want to filter data first call the name of the list then stream()
//    List<Person> matchingStudents = classPhoenix.stream()
//            .filter(p -> p.getAge() < 30)
//            .collect(Collectors.toList());
//}
//    public HomeScreen() {
//        init();
//    }
//    private void init() {
//        DealershipFileManager fileManager = new DealershipFileManager("src/inventory.csv");
//        dealership = fileManager.getDealership();
//    }
    public HomeScreen() {

    }
    public void display() {
        System.out.println("Welcome to the Akali maid cafe >_o!~ \n" +
                "Let's start you off with an order :3\n" +
                "1) New Order! omnomnomnom ^7^\n" +
                "0) Exit\n");
    }
}
