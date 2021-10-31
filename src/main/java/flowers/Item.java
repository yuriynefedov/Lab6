package flowers;

public abstract class Item {
    public abstract double price();
    public String description() {
        return "Default item description";
    }
}
