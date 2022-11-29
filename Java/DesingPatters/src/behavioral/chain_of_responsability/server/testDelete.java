package behavioral.chain_of_responsability.server;

import java.util.ArrayList;
import java.util.List;

public class testDelete {



    Subject.java

    public interface Subject {
        public void registerObserver(Observer observer);
        public void unregisterObserver(Observer observer);
        public void notifyObservers();
    }




    Channel.java

    public class Channel implements Subject {
        List<Observer> observers = new ArrayList<>();
        String channelName;
        String status;

        public Channel(String channelName, String status){
            this.channelName = channelName;
            this.status = status;
        }

        @Override
        public void registerObserver(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void unregisterObserver(Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObservers() {
            for(Observer observer : observers){
                observer.update(status);
            }
        }

        public void setStatus(String status) {
            this.status = status;
            notifyObservers();
        }
    }





    Observer.java

    public interface Observer {

        public void update(String status);
    }





    Follower.java

    public class Follower implements Observer {
        String followerName;
        String status;

        @Override
        public void update(String status) {
            this.status = status;
            play();
        }

        public void play(){
            System.out.println("play");
        }
    }

}
