package top.lenconda.design_pattern.task2.task2_1;

public class Adapter {
    private DogTarget dog;
    private CatTarget cat;

    public Adapter(DogTarget dog, CatTarget cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public void bark() {
        System.out.println("Dog is studying cat:");
        cat.catchMouse();
    }

    public void catchMouse() {
        System.out.println("Cat is studying dog:");
        dog.bark();
    }
}
