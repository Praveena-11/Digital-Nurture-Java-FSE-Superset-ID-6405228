package Factory_Pattern;

public class PdfFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new Pdf();
    }
}
