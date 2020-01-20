public interface Subject{
    void subscribe(User u);
    void unSubscribe(User u);
    void notifySubscribers();
    void push(String repoName);
}