import java.util.*;

class Composite implements Component {

        String name;
        List<Component> components = new ArrayList<>();

        public Composite(String name){
            super();
            this.name = name;
        }

        public void addComponents(Component comp){
            components.add(comp);
        }

        @Override
        public void showPrice() {
            System.out.println(name);
            for (Component component : components) {
                component.showPrice();
            }
        }
}