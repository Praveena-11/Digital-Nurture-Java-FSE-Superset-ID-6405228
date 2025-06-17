package Factory_Pattern;

public class Word implements Document{
    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }
}
