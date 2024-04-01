import java.util.*;
import java.io.*;

public class BookDA {

    private HashMap<String, Book> bookMap;
    public HashMap<String, Book> getBookMap;

    public BookDA(String isbn){
        HashMap <String, Book> bookMap = new HashMap<>();

        try {
            Scanner bookFile = new Scanner(new FileReader("/workspaces/HashMapActivity/Book.csv"));
            
            bookMap = new HashMap<>();

            while (bookFile.hasNext()) {
                String bookLineData = new String();
                bookLineData = bookFile.nextLine();

                String[] bookLineDataSpecific = new String [3];
                bookLineDataSpecific = bookLineData.split(",");

                if(isbn.equals(bookLineDataSpecific[0].trim())){

                    Book book = new Book();
                    book.setTitle(bookLineDataSpecific[1].trim());
                    book.setName(bookLineDataSpecific[2].trim());
                }
            }

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public BookDA() {
        //TODO Auto-generated constructor stub
    }
}