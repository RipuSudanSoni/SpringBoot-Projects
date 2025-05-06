package ObserverDesignePattern;

class ConcreteObserverB implements Observer {
    private ConcreteSubject subject;

    public ConcreteObserverB(ConcreteSubject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ConcreteObserverB: Updated state is " + subject.getState());
    }
}