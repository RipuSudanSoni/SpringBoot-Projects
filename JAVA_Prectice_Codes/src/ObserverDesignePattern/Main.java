package ObserverDesignePattern;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserverA observerA = new ConcreteObserverA(subject);
        ConcreteObserverB observerB = new ConcreteObserverB(subject);

        subject.setState(5);
        subject.setState(10);

        subject.detach(observerA);

        subject.setState(15);
    }
}