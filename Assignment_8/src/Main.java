import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<5; i++)
        {
            System.out.println("Product: " + (i+1));
            Product p = null;
            char c ='t';
            switch(i)
            {
                case 0:
                    c='t';
                    break;
                case 1:
                    c='t';
                    break;
                case 2:
                    c='m';
                    break;
                case 3:
                    c='b';
                    break;
                case 4:
                    c='b';
                    break;
            }
            switch (c)
            {
                case 'm':
                    MP3Player mp3 = new MP3Player();
                   String nameColour = sc.nextLine();
                   Colour colour = new Colour();
                   colour.setName(nameColour);
                   mp3.setColour(colour);
                   p = mp3;
                    break;
                case 't':
                    TV tv = new TV();
                    tv.setSize(sc.nextInt());
                    Manufacturer tvManufacturer = new Manufacturer();
                    String nameManufacturer = sc.nextLine();
                    tvManufacturer.setName(nameManufacturer);
                    tv.setManufacturer(tvManufacturer);
                    p = tv;
                    break;
                case 'b':
                    Book book = new Book();
                    String namePublisher = sc.nextLine();
                    Publisher publisher = new Publisher();
                    publisher.setName(namePublisher);
                    book.setPublisher(publisher);
                    book.setYearPublished(sc.nextInt());
                    p = book;
                    break;
            }


            System.out.print("Price of product: " + (i+1));
            double price = Double.parseDouble(sc.nextLine());
            p.setPrice(price);
            products.add(p);

        }
        double totalDiscount = 0;
        for (int i =0; i< products.size();i++)
        {
            System.out.println("Item "+ (i+1) + ": Type = " + products.get(i).getClass() +", Regular price = "+ products.get(i).getPrice()+ ", Sale price = " + products.get(i).getSalePrice());
            totalDiscount +=products.get(i).getPrice() - products.get(i).getSalePrice();
        }
        System.out.println("Total discount = " + totalDiscount);

    }
}
