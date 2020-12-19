package top.lenconda.design_pattern.task2.task2_1;

public class Main {
    public static void main(String args[]) {
        DogTarget dog = new ConcreteDog();
        CatTarget cat = new ConcreteCat();
        dog.bark();
        cat.catchMouse();
        Adapter adapter = new Adapter(dog, cat);
        adapter.catchMouse();
        adapter.bark();
    }
}
