//search algorithms:
//linear search:Linear search is a straightforward algorithm that checks each element in a list one-by-one until it finds the target element or reaches the end of the list. It's simple to implement but can be inefficient for large lists.
//binary Search:Binary search is a more efficient algorithm but requires the list to be sorted. It works by repeatedly dividing the list in half and comparing the middle element with the target element. If the middle element is the target, the search is complete. If not, the algorithm continues searching in the appropriate half (left or right) based on the comparison.
import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + "]";
    }
}

class Library {
    public static Book linearSearchByTitle(List<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearchByTitle(List<Book> books, String title) {
        
        Collections.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
        
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books.get(mid);
            int cmp = midBook.getTitle().compareToIgnoreCase(title);

            if (cmp == 0) {
                return midBook;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "A", "Ruskin bond"));
        books.add(new Book(2, "B", "Shakesphere"));
        books.add(new Book(3, "C", "Chetan Bhagat"));
        books.add(new Book(4, "D", "Jk Rowling"));

        String searchTitle = "1984";

        Book foundBookLinear = Library.linearSearchByTitle(books, searchTitle);
        System.out.println("Linear Search Result: " + foundBookLinear);

        Book foundBookBinary = Library.binarySearchByTitle(books, searchTitle);
        System.out.println("Binary Search Result: " + foundBookBinary);
    }
}

///Time Complexity:Linear Search: O(n),Binary Search: O(log n)
//when to use each algorithm:
//Linear Search:Use when the list is small.Use when the list is unsorted and you do not wish to sort it.
//Suitable for simple searches where performance is not critical.
//binary search:Use when the list is large and sorted.Requires an additional step to sort the list if it is not already sorted, but offers much better performance for large datasets.
