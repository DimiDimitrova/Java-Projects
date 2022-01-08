public class Sedan extends Car {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public double getSalePrice()
    {
        if (length >20)
        {
            return getRegularPrice() * 0.95;
        }
        else
        {
            return getRegularPrice() * 0.90;
        }
    }
}
