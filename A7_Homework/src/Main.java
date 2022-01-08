import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int authorsCount = Integer.parseInt(scanner.nextLine());
        Book book = new Book(authorsCount);

        String title = scanner.nextLine();
        book.setTitle(title);
        for (int i =0; i< book.getAuthorsCount();i++)
        {
            Author author = new Author();
            author.setName(scanner.nextLine());
            String nameCountry = scanner.nextLine();
            Country country = new Country();
            country.setName(nameCountry);
            author.setCountry(country);
            book.addAuthor(author);

        }
        System.out.println("Book: " + book.getTitle());
        for (int i = 0; i< book.getAuthorsCount();i++)
        {
            System.out.println("Author " + (i+1) + ": Name = " + book.getAuthor(i).getName() + ", Country = " + book.getAuthor(i).getCountry().getName());
        }

    }

}
