import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements NewsSubject {
    private List<NewsObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(NewsObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NewsObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        for (NewsObserver observer : observers) {
            observer.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println("Publishing news: " + news);
        notifyObservers(news);
    }
}
