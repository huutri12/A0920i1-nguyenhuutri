package CaseStudy_modul2.Exception_Cus;

public class Gender_Exception {

    public boolean Gender_Exception(String gender){
        String Format_Gender = gender.toLowerCase();
        String Female = "Female";
        String Male = "Male";
        String Other = "Other";
        return (Format_Gender.equals(Female)) ||
                (Format_Gender.equals(Male)) ||
                (Format_Gender.equals(Other));
    }
}
