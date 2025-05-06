package ObserverDesignePattern;

class ConcreteObserverA implements Observer {
    private ConcreteSubject subject;

    public ConcreteObserverA(ConcreteSubject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ConcreteObserverA: Updated state is " + subject.getState());
    }
}