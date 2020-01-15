public class BulbAdaptor implements Bulb{

    ScrewBulb screwBulb = new ScrewBulb();

    @Override
    public void illuminate(String flag) {
        screwBulb.aLight(flag);
    }

}