public class Book {
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    Author[] authors;
    int nextIndex;

    public Book(int authorsCount)
    {
        authors = new Author[authorsCount];
        nextIndex = 0;
    }

    public void addAuthor(Author author)
    {
        authors[nextIndex] = author;
        nextIndex ++;
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
