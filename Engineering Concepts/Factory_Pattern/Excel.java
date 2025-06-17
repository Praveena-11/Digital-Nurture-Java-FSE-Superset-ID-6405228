package Factory_Pattern;

public class Excel implements Document{
    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}
