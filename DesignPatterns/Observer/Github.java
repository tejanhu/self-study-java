public class Github{
    public static void main(String [] args) {
        Repository javaSelfStudy = new Repository();

        User user1 = new User("John Smith");
        User user2 = new User("Carly Doe");
        User user3 = new User("Mark Johnson");
        User user4 = new User("Michael Levesque");
        User user5 = new User("Shaun Freeman");
        User user6 = new User("James Goodman");

        javaSelfStudy.subscribe(user1);
        javaSelfStudy.subscribe(user2);
        javaSelfStudy.subscribe(user3);
        javaSelfStudy.subscribe(user4);
        javaSelfStudy.subscribe(user5);
        javaSelfStudy.subscribe(user6);

        user1.subscribeRepository(javaSelfStudy);
        user2.subscribeRepository(javaSelfStudy);
        user3.subscribeRepository(javaSelfStudy);
        user4.subscribeRepository(javaSelfStudy);
        user5.subscribeRepository(javaSelfStudy);
        user6.subscribeRepository(javaSelfStudy);

        
        javaSelfStudy.unSubscribe(user1);

        javaSelfStudy.unSubscribe(user3);

    
        javaSelfStudy.push("JavaSelfStudy");


    }
}