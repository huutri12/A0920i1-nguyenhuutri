package CaseStudy_modul2.Exception_Cus;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BirthDay_Exception extends Exception {
    final String REGEX_BIRTHDAY = "^(?:(?:31(\\/|-|\\.)(?:" +
            "0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(" +
            "?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{" +
            "2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?" +
            ":0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]" +
            "|[3579][26])00))))$|^(?:0?[1-9]|1\\d|" +
            "2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(" +
            "?:1[6-9]|[2-9]\\d)?\\d{2})$ ";

    public BirthDay_Exception(String s){
        System.out.println(s);
    }
    public BirthDay_Exception(){
    }

    public boolean birthday_ex(String birthday) throws BirthDay_Exception{
        Pattern pattern = Pattern.compile(REGEX_BIRTHDAY);
        Matcher matcher = pattern.matcher(birthday);
        boolean match = matcher.matches();

        Calendar Cal = Calendar.getInstance();
        int Day = Cal.get(Calendar.DAY_OF_MONTH);
        int Month = Cal.get(Calendar.MONTH)+1;
        int Year = Cal.get(Calendar.YEAR);
        String[] parts;
        int Day_Birth = 0;
        int Month_Birth = 0;
        int Year_Birth = 0;

        if (!match){
            if (birthday.contains("/")){
                parts = birthday.split("/");
                Day_Birth = Integer.parseInt(parts[0]);
                Month_Birth = Integer.parseInt(parts[1]);
                Year_Birth = Integer.parseInt(parts[2]);
            }
            if (birthday.contains("-")){
                parts = birthday.split("-");
                Day_Birth = Integer.parseInt(parts[0]);
                Month_Birth = Integer.parseInt(parts[1]);
                Year_Birth = Integer.parseInt(parts[2]);
            }
            if (birthday.contains(".")){
                parts = birthday.split(".");
                Day_Birth = Integer.parseInt(parts[0]);
                Month_Birth = Integer.parseInt(parts[1]);
                Year_Birth = Integer.parseInt(parts[2]);
            }
        }
        LocalDate Start = LocalDate.of(Year_Birth, Month_Birth,Day_Birth);
        LocalDate End = LocalDate.of(Year, Month, Day);
        long Years = ChronoUnit.YEARS.between(Start, End);

        if (!(Years > 18)){
            throw new BirthDay_Exception("The year of birth must be> 1900 and \" +\n" +
                    "                    \"18 years less than the current year,\" +\n" +
                    "                    \" in the correct format dd / mm / yyyy\"");
        }else {
            return true;
        }
    }
}
