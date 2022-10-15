package structural.facade;

import creational.singleton.DbSingleton;

import javax.print.DocFlavor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {
    DbSingleton instance = null;

    public JdbcFacade() {
        this.instance = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement statement = conn.createStatement();
            count = statement.executeUpdate("CREATE TABLE Address (ID, StreetName, City)");
            statement.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement statement = conn.createStatement();
            count = statement.executeUpdate(
                    "INSERT INTO TABLE Address (ID, StreetName, city) VALUES(1, 123 Same street., Layton)");
            statement.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddress() {
        List<Address> addresses = new ArrayList<>();
        try {
            Connection conn =  instance.getConnection();
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");

            while (resultSet.next()){
                System.out.println(resultSet.getString(1) + " " +
                        resultSet.getString(2) + " "+
                        resultSet.getString(3) + " " );
                Address address = new Address();
                address.setId(resultSet.getString(1));
                address.setStreetName(resultSet.getString(2));
                address.setCity(resultSet.getString(3));

            }

            resultSet.close();
            statement.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return addresses;
    }
}

class Address {
    private String Id, StreetName, City;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
