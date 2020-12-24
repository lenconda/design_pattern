package top.lenconda.design_pattern.task2.task2_4;

public class Lose extends Add {
    public Lose(GeneralBook book) {
        super(book);
        System.out.println("Lose book");
    }

    public void lose() {
        System.out.println("Book has been lost");
    }
}