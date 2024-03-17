package interfaces;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DateSubject {
    protected final List<DateObserver> observers;
    protected LocalDateTime localDateTime;

    public DateSubject() {
        observers = new ArrayList<>();
    }

    public void attach(DateObserver observer) {
        observers.add(observer);
    }

    public void dettach(DateObserver observer) {
        observers.remove(observer);
    }


    public void setState(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
        notifyAllObservers();
    }

    public LocalDateTime getState() {
        return localDateTime;
    }

    private void notifyAllObservers() {
        observers.forEach(DateObserver::update);
    }


}
