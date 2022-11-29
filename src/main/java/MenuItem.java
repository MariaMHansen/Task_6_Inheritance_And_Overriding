import java.util.Arrays;
import java.util.Random;

public class MenuItem {
    private int number;
    private double price;
    private String type;

    public MenuItem( String type, double price) {
        Random r = new Random();
        number= r.nextInt(100) + 1;
        this.number = number;
        this.type = type;
        this.price = price;
    }


    public String toString() {
        return " number: " +getNumber()+ " type: " + getType() +" price: "+ getPrice();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
