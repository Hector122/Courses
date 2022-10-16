package behavioral.observer.subject;

public class SimpleObserver implements Observer {
    private Subject simpleSubject;
    private int value;

    public SimpleObserver(Subject subject){
        this.simpleSubject = subject;
        simpleSubject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    public void display(){
        System.out.println("Value: " + value );
    }
}
