public class CompanySystemFactory{

    public Company getInstance(String company){
        if(company.equals("Microsoft"))
            return new Microsoft();
        else if(company.equals("Apple"))
            return new Apple();
        else
            return new Virgin();
    }

    public void getCompanyStatus(Company aCompany){

        if(aCompany instanceof Microsoft){
            System.out.println("Microsoft Hiring Status: ");
            new Microsoft().employ();
            System.out.println("Microsoft Rejection Message: ");
            new Microsoft().reject();
            System.out.println("Microsoft Firing Message: ");
            new Microsoft().fire();
            System.out.println("");
        }
        else if(aCompany instanceof Apple){
            System.out.println("Apple Hiring Status: ");
            new Apple().employ();
            System.out.println("Apple Rejection Message: ");
            new Apple().reject();
            System.out.println("Apple Firing Message: ");
            new Apple().fire();
            System.out.println("");
        }
        else{
                System.out.println("Virgin Hiring Status: ");
                new Virgin().employ();
                System.out.println("Virgin Rejection Message: ");
                new Virgin().reject();
                System.out.println("Virgin Firing Message: ");
                new Virgin().fire();
                System.out.println("");
            
        }

    }

}