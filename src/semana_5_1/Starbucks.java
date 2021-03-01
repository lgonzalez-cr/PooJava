package semana_5_1;

public class Starbucks {
    private String size;
    private String drink;
    private double price;

    public Starbucks() {
    }

    public Starbucks(String size, String drink, double price) {
        this.size = size;
        this.drink = drink;
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getSize() {
        return size;
    }

    public String getDrink() {
        return drink;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Starbucks{" +
                "size='" + size + '\'' +
                ", drink='" + drink + '\'' +
                ", price=" + price +
                '}';
    }
}
