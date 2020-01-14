public class Main{

    public static void main(String[] args) {
    
        Company microsoft = new Microsoft();
        Company apple = new Apple();
        Company virgin = new Virgin();


        System.out.println("Microsoft Hiring Status: ");
        microsoft.employ();
        System.out.println("Microsoft Rejection Message: ");
        microsoft.reject();
        System.out.println("Microsoft Firing Message: ");
        microsoft.fire();

        System.out.println("");

        System.out.println("Apple Hiring Status: ");
        apple.employ();
        System.out.println("Apple Rejection Message: ");
        apple.reject();
        System.out.println("Apple Firing Message: ");
        apple.fire();

        System.out.println("");


        System.out.println("Virgin Hiring Status: ");
        virgin.employ();
        System.out.println("Virgin Rejection Message: ");
        virgin.reject();
        System.out.println("Virgin Firing Message: ");
        virgin.fire();


    }

}

