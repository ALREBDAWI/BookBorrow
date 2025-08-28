package View;

import Controller.Book.CreateNewBook;
import Controller.Book.DeleteBook;
import Controller.Book.ModifyBook;
import Controller.BorrowedBook.CreateBorrowedBook;
import Controller.BorrowedBook.DeleteBorrowedBook;
import Controller.Person.CreateNewPerson;
import Controller.Person.DeletePerson;
import Controller.Person.ModifyPerson;
import Model.DummyData.DataSeeder;
import Model.PersonsList;
import Model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void app(){
        DataSeeder.dummyData();
        Scanner sc = new Scanner(System.in);
        boolean on = true;
        while (on) {
            LibraryMenu.showMenu();  //menu to manage CRUD operations

            try {
                int choice =  sc.nextInt();
                switch (choice){
                    case 0:
                        System.out.println("Thank You!");
                        on = false;
                        break;
                    case 1:
                        System.out.println("add new book ");
                        CreateNewBook.createNewBook();
                        break;
                    case 2:
                        System.out.println("add new borrowed book: ");
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
                        System.out.println("list of all books: " + BooksList.getBooksList());
                        break;
                    case 6:
                        System.out.println("list of members: " + PersonsList.getPeopleList());
                        break;
                    case 7:
                        ModifyPerson.modifyPerson();
                        break;
                    case 8:
                        ModifyBook.modifyBook();
                        break;
                    case 9:
                        DeleteBook.removeBook();
                        break;
                    case 10:
                        DeleteBorrowedBook.removeBorrowedBook();
                        break;
                    case 11:
                        DeletePerson.removePerson();
                        break;
                    default:
                        System.out.println("Invalid choice");

                }
            }catch(InputMismatchException e){
                System.out.println(LibraryMenu.YELLOW_BACKGROUND +  "Invalid choice please enter a number" + LibraryMenu.RESET);
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(LibraryMenu.RED_BOLD + e.getMessage() + LibraryMenu.RESET);
            }
        }

    }

}
