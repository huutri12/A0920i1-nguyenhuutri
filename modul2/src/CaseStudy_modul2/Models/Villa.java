package CaseStudy_modul2.Models;

public class Villa extends Services {
    private String Standard_Room;
    private String Description;
    private double AreaPool;
    private int Floors;

    public Villa(String name, int area, double rent, int amount, String rental_Type, String id,
                 String standard_Room, String description, double areaPool, int floors) {
        super(name, area, rent, amount, rental_Type, id);
        Standard_Room = standard_Room;
        Description = description;
        AreaPool = areaPool;
        Floors = floors;
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

    public double getAreaPool() {
        return AreaPool;
    }

    public void setAreaPool(double areaPool) {
        AreaPool = areaPool;
    }

    public int getFloors() {
        return Floors;
    }

    public void setFloors(int floors) {
        Floors = floors;
    }

    @Override
    public String toString() {
        return this.getName() +","+ this.getArea() +","+ this.getRent() +","+ this.getAmount() +","+ this.getRental_Type()
                +","+ this.getId() +","+ this.getStandard_Room() +","+this.getDescription() +","+ this.getAreaPool() +","+this.getFloors();
    }

    @Override
    public String showInfor() {
        return "Name: " + super.getName()+"\n"
                +"Area: " + super.getArea()+"\n"
                +"Rent: " + super.getRent()+"\n"
                +"Amount: "+super.getAmount()+"\n"
                +"Rental_Type: "+super.getRental_Type()+"\n"
                +"Id: " + super.getId()+"\n"
                +"Standard_Room: " + this.getStandard_Room()+"\n"
                +"Description: " + this.getDescription()+"\n"
                +"AreaPool: " + this.getAreaPool()+"\n"
                +"Floors: " + this.getFloors();
    }
}
