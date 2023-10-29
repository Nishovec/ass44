public class NewsFactory {
    public NewsSubscriber createSubscriber(String name) {
        return new NewsSubscriber(name);
    }
}
