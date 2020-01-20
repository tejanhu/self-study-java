class CompositeTest {
    public static void main(String [] args) {
        Composite pencilCase = new Composite("pencil case");
        Composite schoolBag = new Composite("school bag");

        Component pen = new Leaf("pen", 100);
        Component pencil = new Leaf("pencil", 100);
        Component ruler = new Leaf("ruler", 100);
        Component exerciseBook = new Leaf("exercise book", 100);
        Component textBook = new Leaf("text book", 100);
        Component rubber = new Leaf("rubber", 50);

        schoolBag.addComponent(pencilCase);
        pencilCase.addComponent(pen);
        pencilCase.addComponent(pencil);
        pencilCase.addComponent(ruler);
        pencilCase.addComponent(exerciseBook);
        pencilCase.addComponent(textBook);
        pencilCase.addComponent(rubber);

        schoolBag.returnTotalCost();

    }
}