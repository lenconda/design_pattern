package top.lenconda.design_pattern.task2.task2_4;

public class Freeze extends Add {
    public Freeze(GeneralBook book) {
        super(book);
        System.out.println("Freeze book");
    }

    public void freeze() {
        System.out.println("Book has been frozen");
    }
}
