package CaseStudy_modul2.Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static String FORMAT_DATE = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";
    static String FORMAT_ID_SERVICE ="SV(VL|HO|RO)-\\d{4}";
    static String FORMAT_SEX= "Male|Female|Other";
    static String FORMAT_NAME_SERVICE = "^[A-Z][a-z]+$";
    static String FORMAT_NUMBER = "^[0-9]+.[0-9]+$";
    static String FORMAT_SERVICE = "Massage|Karaoke|Food|Car|Drink";
    static Pattern pattern;
    static Matcher matcher;
    static boolean match;

    public static boolean Check_sex(String string){
        pattern = Pattern.compile(FORMAT_SEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static boolean Check_date(String string){
        pattern = Pattern.compile(FORMAT_DATE);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static boolean Check_Id(String string){
        pattern = Pattern.compile(FORMAT_ID_SERVICE);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

    //Check Name
    public static boolean Check_Name(String string){
        pattern = Pattern.compile(FORMAT_NAME_SERVICE);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

    //Check Number
    public static boolean Check_Number(String string){
        pattern = Pattern.compile(FORMAT_NUMBER);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }


    public static boolean Check_Number_Int(String string){
        pattern = Pattern.compile("^[0-9]+$");
        matcher = pattern.matcher(string);
        return !matcher.matches();
    }
    public static boolean Check_Service(String string){
        pattern = Pattern.compile(FORMAT_SERVICE);
        matcher = pattern.matcher(string);
        return matcher.matches();

    }
}
