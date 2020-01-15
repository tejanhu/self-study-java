public class CompanySystemFactory{

    public Company getInstance(String company){
        if(company.equals("Microsoft"))
            return new Microsoft();
        else if(company.equals("Apple"))
            return new Apple();
        else
            return new Virgin();
    }

}