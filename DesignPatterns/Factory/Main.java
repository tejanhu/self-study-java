public class Main{

    public static void main(String[] args) {
    
        Company companyA = new CompanySystemFactory().getInstance("Microsoft");
        Company companyB = new CompanySystemFactory().getInstance("Apple");
        Company companyC = new CompanySystemFactory().getInstance("Virgin");



        System.out.println("Microsoft Hiring Status: ");
        companyA.employ();
        System.out.println("Microsoft Rejection Message: ");
        companyA.reject();
        System.out.println("Microsoft Firing Message: ");
        companyA.fire();

        System.out.println("");

        

        System.out.println("Apple Hiring Status: ");
        companyB.employ();
        System.out.println("Apple Rejection Message: ");
        companyB.reject();
        System.out.println("Apple Firing Message: ");
        companyB.fire();

        System.out.println("");


        System.out.println("Virgin Hiring Status: ");
        companyC.employ();
        System.out.println("Virgin Rejection Message: ");
        companyC.reject();
        System.out.println("Virgin Firing Message: ");
        companyC.fire();


    }

}

