package ch.trivadis.phoneValidator.internal;
import ch.trivadis.phoneValidator.api.PhoneValidator;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Andy Moncsek on 08/02/16.
 */
public class PhoneValidatorImpl implements PhoneValidator {


    public boolean checkPhone(String phoneNumber){
      return StringUtils.contains(phoneNumber,"+41")?true:false;
    }

}
