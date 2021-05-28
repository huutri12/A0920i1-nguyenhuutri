package CaseStudy_modul2.Exception_Cus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name_Exception extends Exception {
    final String REGEX_NAME = "([A-Z]+[a-z]+ )";

    public Name_Exception(String s){
        super(s);
    }

    public Name_Exception(){
    }

    public boolean name_Ex(String name) throws Name_Exception{
        boolean match;
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(name);
        match = matcher.matches();
        if (!match){
            throw new Name_Exception("The first character of the name must be capitalized0");
        }
        else {
            return true;
        }
    }
}
