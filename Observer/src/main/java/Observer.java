import interfaces.DateSubject;
import observers.LongTextDateObserver;
import observers.MidTextDateObserver;
import observers.ShortTextDateObserver;


import java.time.LocalDateTime;

public class Observer {
    public static void main(String... args) {
        DateSubject subject = new DateSubject();

        LongTextDateObserver longTextDateObserver = new LongTextDateObserver(subject);
        ShortTextDateObserver shortTextDateObserver = new ShortTextDateObserver(subject);
        MidTextDateObserver midTextDateObserver = new MidTextDateObserver(subject);

        subject.attach(longTextDateObserver);
        subject.attach(shortTextDateObserver);
        subject.attach(midTextDateObserver);
        while(true) {
            try {
                System.out.println("-------------------------------------");
                LocalDateTime localDateTime = LocalDateTime.now();
                localDateTime = localDateTime.plusDays(2);
                subject.setState(localDateTime);
                Thread.sleep(2000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
