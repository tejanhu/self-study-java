public class Lamp{

   private Bulb bulb;

   public Bulb getBulb(){
       return bulb;
   }

   public void setBulb(Bulb bulb){
        this.bulb = bulb;
   }

   public void switchOn(String flag){

        bulb.illuminate(flag);

   }

}