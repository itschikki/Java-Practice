import java.util.Objects;
import java.util.Scanner;
class library {
    int select;
    Scanner sc = new Scanner(System.in);
    String[] books = new String[10];

    library() {
        books[0] = "English";
        books[1] = "Hindi";
        books[2] = "Maths";
        books[3] = "Chemistry";
        books[4] = "Biology";
    }
        void available () {
            for (int i = 0; i < 10; i++) {
                if (books[i] != null) {
                    System.out.println(books[i]);
                }
            }
        }
        void issueBooks () {
            String iBook;
            System.out.println("Enter book you want to issue: ");
            iBook = sc.next();
            for (int i = 0; i < books.length ; i++) {
                if (Objects.equals(iBook,books[i])) {
                    books[i] = iBook +" (issued)";
                    System.out.println(iBook + " book is issued");
                    break;

                }
                else if(books[i] == null){
                    System.out.println("Book is not available");
                    break;
                }
            }
        }
    void addBooks () {
        String newBook;
        System.out.println("Enter book you want to add: ");
        newBook = sc.next();
        for (int i = 0; i < books.length; i++) {
            if (Objects.equals(books[i], newBook)) {
                System.out.println("Book is already present");
                return;

            }
            else if (books[i] == null) {
                books[i] = newBook;
                System.out.println(newBook + " book has been added");
                return;

            }
        }
    }
        void returnBooks () {
            String iBook;
            System.out.println("Enter book you want to return:");
            iBook = sc.next();
            String n1 = iBook;
            for (int i = 0; i < books.length; i++) {
                if (Objects.equals(books[i], n1)) {
                    System.out.println("Book is Already present in library");
                    return;
                }
                String n2 = iBook +" (issued)";
                for (int j = 0; j < books.length; j++) {
                    if (Objects.equals(n2, books[j])) {
                        System.out.println(n1+ " book is returned");
                        books[j] = iBook;
                        return;
                    }
                }
            }
        }

    void buttons() {
        System.out.println("\nselect no. to view the following option : \n 1) Available books \n 2) Issue books \n 3) Add books \n 4) Return books");
        select = sc.nextInt();
        switch (select){
            case 1 -> {
                available();
                buttons();
            }

            case 2 -> {
                issueBooks();
                buttons();
            }
            case 3 -> {
                addBooks();
                buttons();
            }
            case 4 -> {
                returnBooks();
                buttons();
            }
            default -> {
                System.out.println("Enter correct no. ");
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Online Library...");
        library obj = new library();
        obj.buttons();
    }

}
