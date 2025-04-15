package question2;

class Book {
    private String title, author, publisher, copyrightDate;

    public Book(String title, String author, String publisher, String copyrightDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }
    public String getCopyrightDate() { return copyrightDate; }
    
    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher + "\nCopyright: " + copyrightDate;
    }
}