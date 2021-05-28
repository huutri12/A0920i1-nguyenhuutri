package CaseStudy_modul2.Exception_Cus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ID_Exception extends Exception {
    final String REGEX_ID_CARD = "[0-9][0-9][0-9][ ][0-9][0-9][0-9][ ][0-9][0-9][0-9][ ]";

    public ID_Exception(String s){
        super(s);
    }

    public ID_Exception(){
    }

    public boolean Id_Exception(String id) throws ID_Exception{
        Pattern pattern = Pattern.compile(REGEX_ID_CARD);
        Matcher matcher = pattern.matcher(id);
        boolean match = matcher.matches();
        if (!match){
            throw new ID_Exception("\"ID Card must be correct format XXX XXX XXX");
        }
        else {
            return true;
        }
    }
}
