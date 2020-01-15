public class Main{

    public static void main(String[] args) {
    
        Company companyA = new CompanySystemFactory().getInstance("Microsoft");
        Company companyB = new CompanySystemFactory().getInstance("Apple");
        Company companyC = new CompanySystemFactory().getInstance("Virgin");

        CompanySystemFactory csf = new CompanySystemFactory();
        System.out.println("Company A: ");
        csf.getCompanyStatus(companyA);
        System.out.println("Company B: ");
        csf.getCompanyStatus(companyB);
        System.out.println("Company C: ");
        csf.getCompanyStatus(companyC);



    }

}

