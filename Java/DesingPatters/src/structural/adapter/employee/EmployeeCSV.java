package structural.adapter.employee;

import java.util.StringTokenizer;

public class EmployeeCSV {
    private int id;
    private String firstname, lastname, emailAddress;

    public EmployeeCSV(String values){
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if(tokenizer.hasMoreElements()){
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if(tokenizer.hasMoreElements()){
            firstname = tokenizer.nextToken();
        }
        if(tokenizer.hasMoreElements()){
            lastname = tokenizer.nextToken();
        }
        if(tokenizer.hasMoreElements()){
            emailAddress = tokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
