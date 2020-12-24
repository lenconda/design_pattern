package top.lenconda.design_pattern.task2.task2_4;

public class Main {
    public static void main(String args[]){
        GeneralBook book1;
        book1 = new Book();
        book1.borrowBook();
        book1.returnBook();
        System.out.println();

        Freeze book2 = new Freeze(book1);
        book2.borrowBook();
        book2.returnBook();
        book2.freeze();
        System.out.println();

        GeneralBook book3;
        book3 = new Book();
        book3.borrowBook();
        book3.returnBook();
        System.out.println();

        Lose book4 = new Lose(book3);
        book4.borrowBook();
        book4.returnBook();
        book4.lose();
    }
}
