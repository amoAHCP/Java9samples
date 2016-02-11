package ch.trivadis.phoneValidator.internal;
import ch.trivadis.phoneValidator.api.PhoneValidator;

/**
 * Created by Andy Moncsek on 08/02/16.
 */
public class PhoneValidatorImpl implements PhoneValidator {


    public boolean checkPhone(String phoneNumber){
      return phoneNumber.contains("+41")?true:false;
    }

}
