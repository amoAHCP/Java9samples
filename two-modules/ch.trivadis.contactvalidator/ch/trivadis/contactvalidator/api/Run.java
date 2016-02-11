package ch.trivadis.contactvalidator.api;
import ch.trivadis.contactvalidator.internal.ContactValidatorImpl;

/**
 * Created by Andy Moncsek on 08/02/16.
 * java9-basic-test amo$ javac -modulepath . -d ch.trivadis.contactvalidator $(find ch.trivadis.contactvalidator -name "*.java")
 * java -modulepath . -m ch.trivadis.contactvalidator/ch.trivadis.contactvalidator.api.Run +46
 */
public class Run {

  public static void main(String[] args) {

     String value = args.length > 0  ? args[0] : "";
     boolean isSwissNumer = new ContactValidatorImpl().checkContact(value);
     if(isSwissNumer){
         System.out.println(value + " is a valid swiss number");
     } else {
         System.out.println(value + " is not a valid swiss number");
     }
 }

}
