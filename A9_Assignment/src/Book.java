import java.util.ArrayList;

public class Book {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    ArrayList<Author> authors;

    public Book() {
        authors = new ArrayList<>();
    }
    public void addAuthor(Author author)
    {
        authors.add(author);
    }
    public Author getAuthor(int index)
    {
        return authors.get(index);
    }
    public int getAuthorsCount()
    {
        return  authors.size();
    }
}
