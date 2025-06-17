package Factory_Pattern;

public class Main{
    public static void main(String [] args){
        DocumentFactory WordFactory = new WordFactory();
        Document wordoc= WordFactory.createDocument();
        wordoc.open();

        DocumentFactory PdfFactory =  new PdfFactory();
        Document pdfdoc= PdfFactory.createDocument();
        pdfdoc.open();

        DocumentFactory ExcelFactory = new ExcelFactory();
        Document exceldoc= ExcelFactory.createDocument();
        exceldoc.open();
    }
}
