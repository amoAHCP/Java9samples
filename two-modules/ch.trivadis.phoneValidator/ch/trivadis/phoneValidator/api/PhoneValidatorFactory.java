package ch.trivadis.phoneValidator.api;
import ch.trivadis.phoneValidator.internal.PhoneValidatorImpl;

/**
 * Created by Andy Moncsek on 08/02/16.
 */
public class PhoneValidatorFactory {

  public static PhoneValidator getInstance(){

      return new PhoneValidatorImpl();
  }

}
