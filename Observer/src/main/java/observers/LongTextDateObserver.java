package observers;

import interfaces.DateObserver;
import interfaces.DateSubject;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;

public class LongTextDateObserver extends DateObserver {
    public LongTextDateObserver(DateSubject subject) {
        super(subject);
    }

    @Override
    public void update() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(formatter.format(this.subject.getState()) + " " + this.subject.getState().toLocalTime());
    }
}
