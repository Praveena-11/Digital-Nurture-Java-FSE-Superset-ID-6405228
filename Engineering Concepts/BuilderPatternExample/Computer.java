package BuilderPatternExample;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;


        public Builder(String cpu) {
            this.cpu = cpu;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
    public void displayconfig(){
        System.out.println("CPU: "+cpu);
        System.out.println("RAM: "+ram);
        System.out.println("STORAGE: "+storage);
        System.out.println("-----------------");
    }
}
