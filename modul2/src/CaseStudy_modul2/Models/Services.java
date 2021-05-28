package CaseStudy_modul2.Models;

public abstract class Services {
    private String Name;
    private int Area;
    private double Rent;
    private int Amount;
    private String Rental_Type;
    private String Id;

    public Services(String name, int area, double rent, int amount, String rental_Type, String id) {
        Name = name;
        Area = area;
        Rent = rent;
        Amount = amount;
        Rental_Type = rental_Type;
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int area) {
        Area = area;
    }

    public double getRent() {
        return Rent;
    }

    public void setRent(double rent) {
        Rent = rent;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public String getRental_Type() {
        return Rental_Type;
    }

    public void setRental_Type(String rental_Type) {
        Rental_Type = rental_Type;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public abstract String showInfor();

}
