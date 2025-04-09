// Entry Class
public class Entry {
    // Attributes
    String nameEvent;
    double price;

    // Constructor
    public Entry(String nameEvent, double price){
        this.nameEvent = nameEvent;
        this.price = price;
    }

    // Show Information
    public void ShowInfo() {

        System.out.println("Event: " + nameEvent + " | Price: $" + price);
    }
}