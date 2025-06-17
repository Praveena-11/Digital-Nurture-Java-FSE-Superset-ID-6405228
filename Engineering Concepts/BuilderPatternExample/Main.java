package BuilderPatternExample;

public class Main {
    public static void main(String[] args) {
        Computer basicComputer=new Computer.Builder("Intel i3").setRam("4GB").build();
        Computer gamingComputer=new Computer.Builder("Intel i9").setRam("32GB").setStorage("1TB SSD").build();
        System.out.println("Basic Computer:");
        basicComputer.displayconfig();
        System.out.println("Gaming Computer:");
        gamingComputer.displayconfig();
    }
}
