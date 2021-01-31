package CaseStudy_modul2.Models;

public class Customer {
    private String Name_Customer;
    private int date;
    private String sex;
    private int CMND;
    private String Email;
    private String type;
    private String Address;
    private Services services;

    public Customer(String name_Customer, int date, String sex, int CMND, String email, String type, String address, Services services) {
        Name_Customer = name_Customer;
        this.date = date;
        this.sex = sex;
        this.CMND = CMND;
        Email = email;
        this.type = type;
        Address = address;
        this.services = services;
    }

    public String getName_Customer() {
        return Name_Customer;
    }

    public void setName_Customer(String name_Customer) {
        Name_Customer = name_Customer;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String showInfor(){
        return "NameCustomer: " + this.getName_Customer()+
                "Date: " +this.getDate()+"\n"+
                "Sex: " + this.getSex()+"\n"+
                "CMND: " + this.getCMND()+"\n"+
                "Email: " + this.getEmail()+"\n"+
                "Type: " + this.getType()+"\n"+
                "Address: " + this.getAddress()+"\n"+
                "Services: " + this.getServices()
                ;
    }
}
