package View;

public class LibraryMenu {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[91m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[96m";
    public static final String YELL = "\u001B[93m";
    public static final String BACKGROUND = "\u001B[100m";

    public static void showMenu() {
        System.out.println(
                CYAN + "=== Library Management Menu ===" + RESET + "\n" +
                        GREEN + "Create:" + RESET + "\n" + BACKGROUND +
                        " 1. Add new book\n" +
                        " 2. Add borrowed book\n" +
                        " 3. Add new member\n\n" + RESET +

                        BLUE + "Read:" + RESET + "\n" + BACKGROUND  +
                        " 4. List of borrowed books\n" +
                        " 5. List of all books\n" +
                        " 6. List of members\n\n" + RESET +

                        YELLOW + "Update:" + RESET + "\n" + BACKGROUND +
                        " 9. Modify member\n" +
                        "10. Modify book\n\n" + RESET +

                        RED + "Delete:" + RESET + "\n" + BACKGROUND +
                        " 7. Delete book\n" +
                        " 8. Delete member\n" + RESET +

                YELL + "\n choose an operation by typing its number " + RESET
        );
    }

    public static void main(String[] args) {
        showMenu();
    }
}
