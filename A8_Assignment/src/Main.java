import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            Car c=null;
            if (i == 0 || i ==1)
            {
                Truck truck = new Truck();

                int weight = Integer.parseInt(scanner.nextLine());
                truck.setWeight(weight);

                int speed = Integer.parseInt(scanner.nextLine());
                truck.setSpeed(speed);

                c = truck;

            }
            else if (i ==2)
            {
                Ford ford = new Ford();

                int year = Integer.parseInt(scanner.nextLine());
                ford.setYear(year);

                int manDiscount = Integer.parseInt(scanner.nextLine());
                ford.setManufacturerDiscount(manDiscount);

                int sppedFord = Integer.parseInt(scanner.nextLine());
                ford.setSpeed(sppedFord);

                c=ford;
            }
            else
            {
                Sedan sedan = new Sedan();

                int length = Integer.parseInt(scanner.nextLine());
                sedan.setLength(length);

                int spSedan = Integer.parseInt(scanner.nextLine());
                sedan.setSpeed(spSedan);

                c = sedan;
            }
            double regularPrice = Double.parseDouble(scanner.nextLine());
            c.setRegularPrice(regularPrice);
            cars.add(c);
        }
        /*Car 1: Type = Truck, Speed = ?, Regular price = ?, Sale price = ?*/
        double totalDiscount =0;
        for (int i =0; i < cars.size(); i++)
        {
            System.out.println("Car " + (i+1) + ": Type = " + cars.get(i).getClass().getSimpleName()
                    + ", Speed = " + cars.get(i).getSpeed()
                    + ", Regular price = " + cars.get(i).getRegularPrice()
                    + ", Sale price = " + cars.get(i).getSalePrice());
            totalDiscount += cars.get(i).getRegularPrice() - cars.get(i).getSalePrice();
        }
        System.out.println("Total discount = " + totalDiscount);
    }
}
