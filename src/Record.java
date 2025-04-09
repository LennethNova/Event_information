// Record
public record Record(String nameEvent, double price) {

    public void ShowInfo() {
        System.out.println("Evento: " + nameEvent + " | Precio: $" + price);
    }

    // Use Record
    public static void main(String[] args) {
        Record ExtraEntry = new Record("Festival de Jazz", 800.0);
        ExtraEntry.ShowInfo();
    }
}