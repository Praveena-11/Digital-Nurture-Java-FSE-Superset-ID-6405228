package Factory_Pattern;

public class ExcelFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new Excel();
    }
}
