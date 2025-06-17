package Factory_Pattern;

public class WordFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new Word();
    }
}
