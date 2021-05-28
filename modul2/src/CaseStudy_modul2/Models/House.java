package CaseStudy_modul2.Models;

public class House extends Services {
    private String Standard_Room;
    private String Description;
    private int floors;

    public House(String name, int area, double rent, int amount, String rental_Type, String id, String standard_Room, String description, int floors) {
        super(name, area, rent, amount, rental_Type, id);
        Standard_Room = standard_Room;
        Description = description;
        this.floors = floors;
    }

    public String getStandard_Room() {
        return Standard_Room;
    }

    public void setStandard_Room(String standard_Room) {
        Standard_Room = standard_Room;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return this.getName()+","+ this.getArea()+","+this.getRent()+","+this.getAmount()+","+ this.getRental_Type()+","+
        this.getStandard_Room()+","+this.getDescription()+","+this.getFloors();
    }

    @Override
    public String  showInfor() {
        return "Name: " + super.getName()+"\n"
                +"Area: " + super.getArea()+"\n"
                +"Rent: " + super.getRent()+"\n"
                +"Amount: "+super.getAmount()+"\n"
                +"Rental_Type: "+super.getRental_Type()+"\n"
                +"Id: " + super.getId()+"\n"
                +"Standard_Room: " + this.getStandard_Room()+"\n"
                +"Description: " + this.getDescription()+"\n"
                +"Floors: " + this.getFloors();
    }
}
