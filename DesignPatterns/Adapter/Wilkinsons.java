public class Wilkinsons{
    public static void main(String [] args) {
        Lamp bedLamp = new Lamp();
        Bulb aScrewBulb = new BulbAdaptor();
        bedLamp.setBulb(aScrewBulb);
        bedLamp.switchOn("LIGHT SWITCHED ON");
        
    }
}