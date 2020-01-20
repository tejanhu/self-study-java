public class User implements Observer{

    String username;
    private Repository repo = new Repository();

    User(String username){
        super();
        this.username = username;
    }

    @Override
    public void update() {
        System.out.println("Hi " + username + ", " + repo.title + " repository had changes made");

    }

    @Override
    public void subscribeRepository(Repository repository) {
        repo = repository;

    }



}
