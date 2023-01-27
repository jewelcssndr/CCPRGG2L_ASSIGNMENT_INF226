public class Person {
    int age;
    String name;

    Person(String personName, int personAge) {
        this.name = personName;
        this.age = personAge;
    }
    

    void addFriend(Person friend) {
        System.out.println(name + " is friends with " + friend.name);
    }

    void addClassmate(Person CM1) {
        System.out.println("I am classmates with " + CM1.name);

    }
    }