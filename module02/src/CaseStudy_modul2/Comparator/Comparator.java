package CaseStudy_modul2.Comparator;

import CaseStudy_modul2.Models.Customer;

public class Comparator implements java.util.Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        String date_1;
        String date_2;
        date_1 =o1.getDate_ofbirth();
        date_2=o2.getDate_ofbirth();
        String[] getYear1;
        String[] getYear2;
        int getYear_1 = 0;
        int getYear_2 = 0;
        if (date_1.contains("/")){
            getYear1= date_1.split("/");
            getYear_1 = Integer.parseInt(getYear1[2]);
            getYear2=date_2.split("/");
            getYear_2=Integer.parseInt(getYear2[2]);
        }
        if (date_1.contains("-")){
            getYear1= date_1.split("/");
            getYear_1 = Integer.parseInt(getYear1[2]);
            getYear2=date_2.split("/");
            getYear_2=Integer.parseInt(getYear2[2]);
        }
        if (date_1.contains(".")){
            getYear1= date_1.split("/");
            getYear_1 = Integer.parseInt(getYear1[2]);
            getYear2=date_2.split("/");
            getYear_2=Integer.parseInt(getYear2[2]);
        }
        System.out.println(getYear_1);
        System.out.println(getYear_2);
        if (o1.getName_Customer().equals(o2.getName_Customer())){
            return getYear_1-getYear_2;
        }
        return o1.getName_Customer().compareTo(o2.getName_Customer());
    }
}
