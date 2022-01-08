public class Ford extends Car {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    private int manufacturerDiscount;

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }
    public double getSalePrice() {
        return getRegularPrice() - getManufacturerDiscount();
    }
}
