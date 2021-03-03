package CaseStudy_modul2.Models;

public class Customer {
    private String Name_Customer;
    private String date_ofbirth;
    private String sex;
    private int CMND;
    private String Email;
    private String type;
    private String Address;
    private Services services;

    public Customer(String name_Customer, String date_ofbirth, String sex, int CMND, String email, String type, String address, Services services) {
        Name_Customer = name_Customer;
        this.date_ofbirth = date_ofbirth;
        this.sex = sex;
        this.CMND = CMND;
        Email = email;
        this.type = type;
        Address = address;
        this.services = services;
    }

    public Customer(String name, String date, String gender, int phone_number, String email, String type_customer, String address) {
    }

    public String getName_Customer() {
        return Name_Customer;
    }

    public void setName_Customer(String name_Customer) {
        Name_Customer = name_Customer;
    }

    public String getDate_ofbirth() {
        return date_ofbirth;
    }

    public void setDate_ofbirth(String date_ofbirth) {
        this.date_ofbirth = date_ofbirth;
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
    public String showInfor(int index){
        return "NameCustomer: " + this.getName_Customer()+
                "Date: " +this.getDate_ofbirth()+"\n"+
                "Sex: " + this.getSex()+"\n"+
                "CMND: " + this.getCMND()+"\n"+
                "Email: " + this.getEmail()+"\n"+
                "Type: " + this.getType()+"\n"+
                "Address: " + this.getAddress()+"\n"+
                "Services: " + this.getServices()
                ;
    }
}
