package za.ac.cput.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;
import za.ac.cput.domain.City;
import za.ac.cput.domain.Country;
import za.ac.cput.domain.Name;
import za.ac.cput.domain.Address;

public class Helper {

    public static boolean stringIsNull(String string){
        return string == null || string.isEmpty() || string.equals(" "); //returns true
    }

    public static boolean nameIsNull(Name name){
        return name == null;
    }

    public static boolean addressIsNull(Address address)
    {
        return address == null;
    }

    public static boolean emailValid(String email){
        EmailValidator valid = EmailValidator.getInstance();
        return valid.isValid(email);
    }
    public static boolean isEmptyOrNull(String string ){
        return StringUtils.isEmpty(string);}

    public static String setEmptyIfNull(String string) {
        if (isEmptyOrNull(string)) return StringUtils.EMPTY;
        return string;
    }
    public static void checkStringParam(String paramName, String paramValue ){
        if (isEmptyOrNull(paramValue))
            throw new IllegalArgumentException(String.format("The value is Invalid for param:%s", paramName));
    }

    public static boolean countryIsNull(Country country){
        return country == null;
    }

}

