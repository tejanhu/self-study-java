public class CompositeTest{
    
    public static void main(String [] args) {
        
        Component window = new Leaf("window", 2000);  
        Component tv = new Leaf("tv", 5000);
        Component bed = new Leaf("bed", 1000);
        Component furniture = new Leaf("furniture", 6000);
        Component toiletSeat = new Leaf("toilet seat", 3000);
        Component kettle = new Leaf("kettle", 1000);
        Component oven = new Leaf("oven", 400);
        Component soap = new Leaf("soap", 150);
        Component xbox = new Leaf("xbox", 360);
        Component ps3 = new Leaf("ps3", 1600);
        Component ps4 = new Leaf("ps4", 2500);
    
        Composite house = new Composite("House");
        Composite bathroom = new Composite("Bathroom");
        Composite livingRoom = new Composite("Living room");
        Composite kitchen = new Composite("Kitchen");
        Composite bedroom = new Composite("Bedroom");
        Composite conservatory = new Composite("Conservatory");

        
        house.addComponents(bathroom);
        house.addComponents(kitchen);
        house.addComponents(bathroom);
        house.addComponents(livingRoom);
        house.addComponents(conservatory);
        
        bathroom.addComponents(toiletSeat);
        bathroom.addComponents(soap);

        kitchen.addComponents(kettle);
        kitchen.addComponents(oven);

        bedroom.addComponents(bed);
        bedroom.addComponents(bed);

        livingRoom.addComponents(tv);
        livingRoom.addComponents(window);
        livingRoom.addComponents(furniture);

        conservatory.addComponents(tv);
        conservatory.addComponents(xbox);
        conservatory.addComponents(ps3);
        conservatory.addComponents(ps4);

       house.showPrice();

    }

}