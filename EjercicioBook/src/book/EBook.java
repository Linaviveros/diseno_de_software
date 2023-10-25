package book;


public class EBook {
    public static class Author {
        private String name;
        private String email;
        private char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public char getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
        }
    }

    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public EBook() {

    }

    public EBook(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public EBook(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "EBook[name=" + name + ", Author[" + author + "], price=" + price + ", qty=" + qty + "]";
    }

    public static void main(String[] args) {
        Author author = new Author("John Doe", "john@example.com", 'M');
        EBook book = new EBook("Sample Book", author, 29.99, 100);

        System.out.println(book);
    }
}
