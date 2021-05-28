package CaseStudy_modul2.Exception_Cus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Exception extends Exception {
    final String REGEX_EMAIL ="^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";

    public Email_Exception(String s){
        System.out.println(s);
    }
    public Email_Exception(){
    };

    public boolean Email_Exception(String email) throws Email_Exception{
        boolean match;
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(email);
        match = matcher.matches();
        if (!match){
            throw new Email_Exception("Email must be in the correct format abc@abc.abc");
        }else {
            return true;
        }
    }
}
