package interfaces;

public abstract class DateObserver {

    protected DateSubject subject;

    public DateObserver(DateSubject subject) {
        this.subject = subject;
    }

    public abstract void update();
}
