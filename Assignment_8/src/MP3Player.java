public class MP3Player extends Electronics {
    private Colour colour;

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
    public double getSalePrice()
    {
        return getPrice() * 0.95;
    }
}
