package structural.adapter.employee;

//Legacy code that witch can not change.
public class EmployeeLdap {
    private String cn, surname, givenName, mail;

    public EmployeeLdap(String cn, String surname, String givenName, String email){
        this.cn = cn;
        this.surname = surname;
        this. givenName = givenName;
        this.mail = email;
    }

    public String getCn() {
        return cn;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }
}
