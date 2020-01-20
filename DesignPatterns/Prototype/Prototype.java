public class Prototype {
    public static void main(String [] args) throws CloneNotSupportedException {
        Cinema o2 = new Cinema();
        o2.setCinema("o2");
        o2.loadDB();
        
      
 

        Cinema iMax = o2.clone();
        iMax.setCinema("iMax");
        o2.fetchFilms().remove(10);
        System.out.println(o2);
        System.out.println(iMax);
    }
}