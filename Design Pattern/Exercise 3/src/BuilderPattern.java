class Computer {
    private String CPU;
    private String RAM;

    private String storage;
    private String graphicsCard;

    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                 '}';
    }

    public static class ComputerBuilder {
        private String CPU;
        private String RAM;

        private String storage;
        private String graphicsCard;
    

        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

      

        public Computer build() {
            return new Computer(this);
        }
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        Computer computer1 = new Computer.ComputerBuilder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA GTX 3080")
                .build();

        Computer computer2 = new Computer.ComputerBuilder("AMD Ryzen 5", "8GB")
                .setStorage("512GB SSD")
                .build();

        System.out.println(computer1);
        System.out.println(computer2);
    }
}

