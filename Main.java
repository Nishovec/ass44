public class Main {
    public static void main(String[] args) {
        NewsFactory factory = new NewsFactory();
        NewsPublisher publisher = new NewsPublisher();

        NewsSubscriber subscriber1 = factory.createSubscriber("Subscriber 1");
        NewsSubscriber subscriber2 = factory.createSubscriber("Subscriber 2");
        NewsSubscriber subscriber3 = factory.createSubscriber("Subscriber 3");

        publisher.registerObserver(subscriber1);
        publisher.registerObserver(subscriber2);
        publisher.registerObserver(subscriber3);

        publisher.publishNews("Breaking news: Earthquake reported!");

        publisher.removeObserver(subscriber2);

        publisher.publishNews("Weather update: Sunny day ahead!");
    }
}
