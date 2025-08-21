package View;

import Controller.CreateBorrowedBook;
import Controller.CreateNewBook;
import Model.PeopleList;
import Model.*;

import java.time.LocalDate;
import java.util.Scanner;

class Demo {
    public static void demo(){

        //adding members
        Person person1 = new Person("Ahmad", "youssef", "ahmad.youssef@gmail.com", LocalDate.of(2023, 9, 20) );
        Person person2 = new Person("Adam", "Zidane", "lina.hassan@yahoo.com", LocalDate.of(2024, 2, 1));
        Person person3 = new Person("Omar", "Sherif", "omar.ali@hotmail.com", LocalDate.of(2022, 11, 20));
        PeopleList.setPeopleList(person1);
        PeopleList.setPeopleList(person2);
        PeopleList.setPeopleList(person3);

        //adding books
        Book b1 = new Book("Clean Code", "Robert C. Martin", 3, 9780132350884L);
        Book b2 = new Book("Effective Java", "Joshua Bloch", 5, 9780134685991L);
        Book b3 = new Book("Design Patterns", "Erich Gamma", 1, 9780201633610L);
        BooksList.setBooksList(b1);
        BooksList.setBooksList(b2);
        BooksList.setBooksList(b3);


        //adding borrowed books
        /*BorrowedBook borrowedBook1 = new BorrowedBook(person1, b2, LocalDate.of(2024, 9, 9));
        BorrowedBook borrowedBook2 = new BorrowedBook(person2, b3, LocalDate.of(2020, 3, 11));
        BorrowedBook borrowedBook3 = new BorrowedBook(person3, b3, LocalDate.of(2008, 5, 30));
        BorrowedBooksList.addBorrowedBook(borrowedBook1);
        BorrowedBooksList.addBorrowedBook(borrowedBook2);
        BorrowedBooksList.addBorrowedBook(borrowedBook3);*/


        Scanner sc = new Scanner(System.in);
        boolean on = true;
        while (on) {

            System.out.println("Enter choice: 1 for list of borrowed books, 2 for all books, 3 for members, 4 add new book,5 add borrowed book");
            int choice =  sc.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Thank You!");
                    on = false;
                    break;
                case 1:
                    System.out.println("list of borrowed books: " + BorrowedBooksList.getBorrowedBooks());
                    break;
                case 2:
                    System.out.println("list of books: " + BooksList.getBooksList());
                    break;
                case 3:
                    System.out.println("list of members: " + PeopleList.getPeopleList());
                    break;
                case 4:
                    BooksList.setBooksList(CreateNewBook.createNewBook());
                case 5:
                    CreateBorrowedBook.createNewBorrowedBook();
                    break;
                    default:
                        System.out.println("Invalid choice");

            }

        }

    }

    public static void main(String[] args) {
        demo();
    }
}
