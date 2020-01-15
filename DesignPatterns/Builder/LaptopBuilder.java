public class LaptopBuilder{

    private String productName;
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int modelYear;

    public LaptopBuilder setProductName(String productName){
        this.productName = productName;
        return this;
    }
    public LaptopBuilder setOS(String os){
        this.os = os;
        return this;
    }
    public LaptopBuilder setRam(int ram){
        this.ram = ram;
        return this;
    }
    public LaptopBuilder setProcessor(String processor){
        this.processor = processor;
        return this;
    }
    public LaptopBuilder setScreenSize(double screenSize){
        this.screenSize = screenSize;
        return this;
    }
    public LaptopBuilder setModelYear(int modelYear){
        this.modelYear = modelYear;
        return this;
    }

    public Laptop getLaptop(){
        return new Laptop(productName, os, ram, processor, screenSize, modelYear);
    }
}