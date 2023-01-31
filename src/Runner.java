import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat c1 = new Cat();
        c1.setCatName("Tails");
        cats.add(c1);
        Cat c2 = new Cat();
        c2.setCatName("Tail");
        cats.add(c2);
        Cat c3 = new Cat();
        c3.setCatName("Tai");
        cats.add(c3);
        Cat c4 = new Cat();
        c4.setCatName("Ta");
        cats.add(c4);

        Cat newCat = new Cat();
        newCat.setCatName("Ginger");
        cats.set(2, newCat);

        cats

        System.out.println(cats);
    }
}
