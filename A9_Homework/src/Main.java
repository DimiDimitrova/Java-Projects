import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
      /*  Създайте колекция (ArrayList) от книги и добавете в колекцията 3 книги с по 2 автора
        към всяка книга
        За всяка книга въведете от клавиатурата в посочената последователност:
• Заглавие на книгата
• Име на първия автор
• Държава на първия автор
• Име на втория автор
• Държава на втория автор
        Принтирайте на екрана следния резултат:
    Book 1: Title = ?, Author 1: [Name = ?, Country = ?], Author 2: [Name = ?, Country = ?]*/

        ArrayList<Book> books = new ArrayList<>();
        for (int i =0; i<3;i++)
        {
            Book book = new Book();
            System.out.print("Title: ");
            book.setTitle(scanner.nextLine());
            for (int j = 0;j<2;j++)
            {
                Author author = new Author();
                System.out.print("Author "+ (j+1) + " name: ");
                author.setName(scanner.nextLine());
                book.addAuthor(author);

                Country country = new Country();
                System.out.print("Country name: ");
                country.setName(scanner.nextLine());
                author.setCountry(country);


            }
            books.add(book);


        }
        for (int i =0; i< books.size();i++)
        {
            System.out.print("Book " + (i+1) + ": Title = " + books.get(i).getTitle());
            for (int j =0; j< books.get(i).getAuthorsCount();j++)
            {
                System.out.print(", Author "+ (j+1)
                        + ": [Name = " + books.get(i).getAuthor(j).getName()
                        + ", Country = " + books.get(i).getAuthor(j).getCountry().getName() + "]");
            }
            System.out.println();
        }


    }
}
