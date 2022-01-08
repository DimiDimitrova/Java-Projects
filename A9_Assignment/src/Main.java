import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book();
        System.out.print("Title: ");
        book1.setTitle(scanner.nextLine());
        for (int i =0; i<3;i++)
        {
            Author author = new Author();
            System.out.print("Author name: ");
            author.setName(scanner.nextLine());
            book1.addAuthor(author);
        }
        books.add(book1);
        Book book2 = new Book();
        System.out.print("Title: ");
        book2.setTitle(scanner.nextLine());
        for (int i =0; i<2;i++)
        {
            Author author = new Author();
            System.out.print("Author name: ");
            author.setName(scanner.nextLine());
            book2.addAuthor(author);
        }
        books.add(book2);
        Book book3 = new Book();
        System.out.print("Title: ");
        book3.setTitle(scanner.nextLine());
        Author author = new Author();
        System.out.print("Author name: ");
        author.setName(scanner.nextLine());
        book3.addAuthor(author);
        books.add(book3);
        for (int i =0;i< books.size();i++)
        {
            System.out.print("Book " + (i+1)+": Title = " + books.get(i).getTitle());
            for (int j=0;j<books.get(i).getAuthorsCount();j++)
            {
                System.out.print(", Author " + (j+1) + " = " + books.get(i).getAuthor(j).getName());
            }
            System.out.println();
        }


    }
}
