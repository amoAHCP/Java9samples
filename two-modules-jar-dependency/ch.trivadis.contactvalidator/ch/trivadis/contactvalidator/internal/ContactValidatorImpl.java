package ch.trivadis.contactvalidator.internal;
import ch.trivadis.contactvalidator.api.ContactValidator;
import ch.trivadis.phoneValidator.api.PhoneValidatorFactory;

/**
 * Created by Andy Moncsek on 08/02/16.
 */
public class ContactValidatorImpl implements ContactValidator{

    public boolean checkContact(String phoneNumber){
      return PhoneValidatorFactory.getInstance().checkPhone(phoneNumber);
    }

}
