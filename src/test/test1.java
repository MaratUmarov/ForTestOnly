package test;

public class test1 {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        Book b1 = new Book("Java. Полное руководство", "Шилдт Герберт", "2018");
        Book b2 = new Book("Java. Библиотека для профессионала", "Кей С. Хорстманн", "2014");
        library.addBook(b1);
        library.addBook(b2);
        library.show();
        library.save();
        library.recover();

    }
}
