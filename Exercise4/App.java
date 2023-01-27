public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("hi");

        //Person Object
        Person Me = new Person("Jewel", 18);
        // Person Object
        Person Friend = new Person("Elizer", 60);
        Person CM1 = new Person("Maycee", 20);
        Person CM2 = new Person("Dhan", 32);
        Person CM3 = new Person("Okiks", 56);

        Me.addFriend(Friend);
        // Pet Object
        Pet Cat = new Pet("Kiwi", 2, Me);
        Cat.showOwner();

        Me.addClassmate(CM1);
        Me.addClassmate(CM2);
        Me.addClassmate(CM3);

        Car SportsCar = new Car("Convertible", Me);
        SportsCar.showOwner();
    }
}
