public class Truck extends Car{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public double getSalePrice() {
        if (weight > 2000)
        {
            return getRegularPrice() * 0.90;
        }
        else
        {
            return getRegularPrice() * 0.80;
        }
    }
}
