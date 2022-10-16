package behavioral.observer.subject;

public class MainSubjectObservable {

    public static void main(String [] args){
        SimpleSubject simpleSubject = new SimpleSubject();

        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

        simpleSubject.setValue(80);
    }
}
