public class Car {
    Person owner;
    String name;

    Car(String carName, Person ownerName){
        this.name = carName;
        this.owner = ownerName;
    }
    void showOwner(){
        System.out.println("This " + this.name + " is owned by " + owner.name);
    }
}
