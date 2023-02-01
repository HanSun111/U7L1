import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<Dog> dogList = new ArrayList<Dog>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.setDogName("Spot");
        dog2.setDogName("Benny");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.get(0).bark();

    }
}
