import java.util.List;

public interface NewsSubject {
    void registerObserver(NewsObserver observer);
    void removeObserver(NewsObserver observer);
    void notifyObservers(String news);
}

