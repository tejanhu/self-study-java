import java.util.*;

class Composite implements Component {

    String itemName;
    List<Component> compo = new ArrayList<>();

    
    Composite(String itemName){
        super();
        this.itemName = itemName;
    }

    public void addComponent(Component component){
        compo.add(component);
    }

    public void removeComponent(Component component){
        compo.remove(component);
    }
    
    public void emptyComponents(){
        for (Component component : compo) {
            compo.remove(component);
        }
    }

    @Override
    public void returnTotalCost() {
        System.out.println(itemName);
       for (Component component : compo) {
           component.returnTotalCost();
       }
        
    }
}