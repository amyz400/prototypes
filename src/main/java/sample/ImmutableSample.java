package main.java.sample;

import java.util.HashSet;
import java.util.Set;

/**
 * make immutable
 *
 * Declare the class as final so it can’t be extended.
 * Make all fields private so that direct access is not allowed.
 * Don’t provide setter methods for variables
 * Make all mutable fields final so that it’s value can be assigned only once.
 * Initialize all the fields via a constructor performing deep copy.
 * Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
 */
public class ImmutableSample {


   public final static class Person {

      private final Set<String> phoneNumbers;
      private final String firstName;
      private final String lastName;

     public Person(Set<String> phoneNumbers, String firstName, String lastName) {
       System.out.println("Performing Deep Copy for Object initialization");
       this.firstName = firstName;
       this.lastName = lastName;
       this.phoneNumbers = new HashSet<>();
       for(String phone : phoneNumbers) {
         this.phoneNumbers.add(phone);
       }

     }
      public Set<String> getPhoneNumbers() {
        return phoneNumbers;
      }

      public String getFirstName() {
        return firstName;
      }

      public String getLastName() {
        return lastName;
      }
    }
}
