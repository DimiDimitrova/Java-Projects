public class TV extends Electronics {
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getSalePrice()
    {
        return getPrice() * 0.85;
    }
}
