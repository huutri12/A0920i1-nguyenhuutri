package CaseStudy_modul2.Models;

public class Room extends Services {
    private String ServicesFree;

    public Room(String name, int area, double rent, int amount, String rental_Type, String id, String servicesFree) {
        super(name, area, rent, amount, rental_Type, id);
        ServicesFree = servicesFree;
    }

    public String getServicesFree() {
        return ServicesFree;
    }

    public void setServicesFree(String servicesFree) {
        ServicesFree = servicesFree;
    }

    @Override
    public String toString() {
        return this.getName() +","+ this.getArea() +","+ this.getRent() +","+ this.getAmount() +","+ this.getRental_Type()
                +","+ this.getId() +","+ this.getServicesFree();
    }

    @Override
    public String showInfor() {
        return  "Name: " + super.getName()+"\n"
                +"Area: " + super.getArea()+"\n"
                +"Rent: " + super.getRent()+"\n"
                +"Amount: "+super.getAmount()+"\n"
                +"Rental_Type: "+super.getRental_Type()+"\n"
                +"Id: " + super.getId()+"\n"
                +"ServicesFree: " + this.getServicesFree();
    }
}
