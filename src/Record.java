// Record
public record Record(String nameEvent, double price) {

    public void ShowInfo() {
        System.out.println("Event: " + nameEvent + " | Price: $" + price);
    }

    // Use Record
    public static void main(String[] args) {
        Record ExtraEntry = new Record("Jazz Festival", 800.0);
        ExtraEntry.ShowInfo();
    }
}