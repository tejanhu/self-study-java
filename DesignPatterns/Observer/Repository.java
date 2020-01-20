import java.util.*;

public class Repository implements Subject {

    private List<User> subscribers = new ArrayList<>();
    String title;

    @Override
    public void subscribe(User user) {
       subscribers.add(user);
    }

    @Override
    public void unSubscribe(User user) {
        subscribers.remove(user);

    }

    @Override
    public void notifySubscribers() {
        for (User user : subscribers) {
            user.update();
        }

    }

    @Override
    public void push(String title) {
        this.title = title;
        notifySubscribers();
    }
    



}
