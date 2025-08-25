package View;

public class LibraryMenu {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";

    public static void showMenu() {
        System.out.println(
                CYAN + "=== Library Management Menu ===" + RESET + "\n" +
                        GREEN + "Create:" + RESET + "\n" +
                        " 1. Add new book\n" +
                        " 2. Add borrowed book\n" +
                        " 3. Add new member\n\n" +

                        BLUE + "Read:" + RESET + "\n" +
                        " 4. List of borrowed books\n" +
                        " 5. List of all books\n" +
                        " 6. List of members\n\n" +

                        YELLOW + "Update:" + RESET + "\n" +
                        " 9. Modify member\n" +
                        "10. Modify book\n\n" +

                        RED + "Delete:" + RESET + "\n" +
                        " 7. Delete book\n" +
                        " 8. Delete member"
        );
    }
}
