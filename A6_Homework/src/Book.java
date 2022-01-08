public class Book {
    String title;
    Author[] authors;
    int nextindex;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public int getNextindex() {
        return nextindex;
    }

    public void setNextindex(int nextindex) {
        this.nextindex = nextindex;
    }

    Book(int authorsCount)
    {
        authors = new Author[authorsCount];
        nextindex = 0;
    }

    public void addAuthor(Author author)
    {
        authors[nextindex] = author;
        nextindex++;
    }

    public Author getAuthor(int index)
    {
        return authors[index];
    }

    public int getAuthorsCount()
    {
        return authors.length;
    }
}
