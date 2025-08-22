package View;

import Controller.*;
import Model.DummyData.DataSeeder;
import Model.PeopleList;
import Model.*;

import java.util.Scanner;

class Demo {
    public static void demo(){
        DataSeeder.dummyData();
        Scanner sc = new Scanner(System.in);
        boolean on = true;
        while (on) {

            System.out.println("Enter choice: 1 for add new book, 2 add borrowed book, 3 add new member, 4 list of borrowed books,5 list all books, 6 list of all members, 7 delete book, 8 delete member");
            int choice =  sc.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Thank You!");
                    on = false;
                    break;
                case 1:
                    System.out.println("add a new book: ");
                    BooksList.setBooksList(CreateNewBook.createNewBook());
                    break;
                case 2:
                    System.out.println("add a new borrowed book: ");
                    CreateBorrowedBook.createNewBorrowedBook();
                    break;
                case 3:
                    System.out.println("add new member: ");
                    CreateNewPerson.createNewMember();
                    break;
                case 4:
                    System.out.println("list of borrowed books: " + BorrowedBooksList.getBorrowedBooks());
                    break;
                case 5:
                    System.out.println("list of books: " + BooksList.getBooksList());
                    break;
                case 6:
                    System.out.println("list of members: " + PeopleList.getPeopleList());
                    break;
                case 7:
                    DeleteBook.removeBook();
                    break;
                case 8:
                    DeletePerson.removePerson();
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
