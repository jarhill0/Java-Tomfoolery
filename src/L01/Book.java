package L01;

public class Book {
    String title = "";
    String author = "";
    Integer totalPages;
    Integer currentPage = 0;

    Book(String title, String author, Integer totalPages) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
    }

    public void goToPage(Integer pageNumber) {
        this.currentPage = pageNumber;
    }

    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public void turnPage() {
        this.currentPage++;
    }

    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 243);
        System.out.println(harryPotter.title);
        System.out.println(harryPotter.author);
        System.out.println(harryPotter.totalPages);
        harryPotter.goToPage(34);
        harryPotter.turnPage();
        harryPotter.turnPage();
        System.out.println(harryPotter.getCurrentPage());

    }

}
