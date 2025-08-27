package View;

import Controller.Book.CreateNewBook;
import Controller.Book.DeleteBook;
import Controller.Book.ModifyBook;
import Controller.BorrowedBook.CreateBorrowedBook;
import Controller.Person.CreateNewPerson;
import Controller.Person.DeletePerson;
import Controller.Person.ModifyPerson;
import Model.DummyData.DataSeeder;
import Model.PersonsList;
import Model.*;

import java.util.Scanner;

public class App {
    public static void app(){
        DataSeeder.dummyData();
        Scanner sc = new Scanner(System.in);
        boolean on = true;
        while (on) {
            LibraryMenu.showMenu();  //menu to manage CRUD operations

            int choice =  sc.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Thank You!");
                    on = false;
                    break;
                case 1:
                    System.out.println("add new book ");
                    BooksList.setBooksList(CreateNewBook.createNewBook());
                    break;
                case 2:
                    System.out.println("add new borrowed book: ");
                    BorrowedBooksList.addBorrowedBook(CreateBorrowedBook.createNewBorrowedBook());
                    break;
                case 3:
                    System.out.println("add new member: ");
                    CreateNewPerson.createNewMember();
                    break;
                case 4:
                    System.out.println("list of borrowed books: " + BorrowedBooksList.getBorrowedBooks());
                    break;
                case 5:
                    System.out.println("list of all books: " + BooksList.getBooksList());
                    break;
                case 6:
                    System.out.println("list of members: " + PersonsList.getPeopleList());
                    break;
                case 7:
                    DeleteBook.removeBook();
                    break;
                case 8:
                    DeletePerson.removePerson();
                    break;
                case 9:
                    ModifyPerson.modifyPerson();
                    break;
                case 10:
                    ModifyBook.modifyBook();
                    break;
                    default:
                        System.out.println("Invalid choice");

            }

        }

    }

}
