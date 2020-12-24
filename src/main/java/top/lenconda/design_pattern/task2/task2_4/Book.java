package top.lenconda.design_pattern.task2.task2_4;

public class Book extends GeneralBook{
    @Override
    public void borrowBook() {
        System.out.println("Borrowing book");
    }

    @Override
    public void returnBook() {
        System.out.println("Returning book");
    }
}
