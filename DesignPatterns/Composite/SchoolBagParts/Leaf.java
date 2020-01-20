class Leaf implements Component {
    String itemName;
    int cost;

    Leaf(String itemName, int cost){
        super();
        this.itemName = itemName;
        this.cost = cost;
    }

    @Override
    public void returnTotalCost() {
       System.out.println(itemName + " costs: " + cost );

    }
}