public class Laptop{

    private String productName;
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int modelYear;

    public Laptop(String productName, String os, int ram, String processor, double screenSize, int modelYear){
        super();
        this.productName = productName;
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.modelYear = modelYear;
    }

    @Override
    public String toString(){
        return "Laptop [productName:" + productName + " , os:"+ os + " , ram:" + ram + " , processor:" + processor + " , screenSize:" + screenSize + " , modelYear: " + modelYear + "]";
    }

}