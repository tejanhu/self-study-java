public class Amazon{

    public static void main(String [] args){
        Laptop machine = new LaptopBuilder().setProductName("Macbook Air").setScreenSize(13.2).setOS("iOS").getLaptop();
        System.out.println(machine);
    }


}