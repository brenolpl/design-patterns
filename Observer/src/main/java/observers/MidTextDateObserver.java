package observers;

import interfaces.DateObserver;
import interfaces.DateSubject;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MidTextDateObserver extends DateObserver {
    public MidTextDateObserver(DateSubject subject) {
        super(subject);
    }

    @Override
    public void update() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(formatter.format(this.subject.getState()) + " " + this.subject.getState().toLocalTime().toString());
    }
}
