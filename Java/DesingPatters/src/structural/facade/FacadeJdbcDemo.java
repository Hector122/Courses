package structural.facade;

import java.util.List;

public class FacadeJdbcDemo {
    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();
        jdbcFacade.createTable();
        System.out.println("Table Create");

        jdbcFacade.insertIntoTable();

        List<Address> addresses = jdbcFacade.getAddress();
        for(Address address : addresses){
            System.out.println(address.getId() + " " + address.getCity());
        }
    }
}
