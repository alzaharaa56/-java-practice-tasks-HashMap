import java.util.HashMap;

public class BookAuthorDemos {
    public static void main(String[] args) {

        HashMap<String, String> bookAuthors = new HashMap<>();

        bookAuthors.put("The Great Gatsby", "F. Scott Fitzgerald");
        bookAuthors.put("1984", "George Orwell");
        bookAuthors.put("To Kill a Mockingbird", "Harper Lee");
        bookAuthors.put("The Hobbit", "J.R.R. Tolkien");
        bookAuthors.put("Hamlet", "William Shakespeare");

        System.out.println("Initial Book Records: " + bookAuthors);

        System.out.println("Author of '1984': " + bookAuthors.get("1984"));

        System.out.println("Is 'The Hobbit' in the collection? " + bookAuthors.containsKey("The Hobbit"));
        bookAuthors.put("1984", "Orwell (Updated)");
        System.out.println("Updated Records: " + bookAuthors);

        bookAuthors.remove("Hamlet");
        System.out.println("After removing Hamlet: " + bookAuthors);

        System.out.println("Total books in collection: " + bookAuthors.size());
    }
}
