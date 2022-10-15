package creational.singleton;

import java.sql.Connection;

/**
 * Singleton class.
 * Lazy lading.
 * Thread save.
 */
public class DbSingleton{
    private  static DbSingleton instance = null;

    private DbSingleton(){
    }

    public static DbSingleton getInstance(){
        if(instance == null){
            synchronized (DbSingleton.class){ // Thread save and only run one time.
                if(instance == null)
                    instance = new DbSingleton();
            }
        }

        return instance;
    }

    //testing not working.
    public Connection getConnection(){
        return null;
    }
}
