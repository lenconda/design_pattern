package top.lenconda.design_pattern.task2.task2_4;

public abstract class Add {
    private final GeneralBook book;

    public Add(GeneralBook book) {
        this.book = book;
    }

    public void borrowBook() {
        book.borrowBook();
    }

    public void returnBook() {
        book.returnBook();
    }
}
