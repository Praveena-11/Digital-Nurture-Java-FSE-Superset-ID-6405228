package Factory_Pattern;

public class Pdf implements Document {
    @Override
    public void open() {
        System.out.println("Opening Pdf Document...");
    }
}
