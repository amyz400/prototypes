package test.java.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;
import main.java.sample.FailingTest.Person;
import org.junit.jupiter.api.Test;

/**
 * Created by aziring on 10/4/17.
 */
public class FailingTestTest {

  @Test
  public void testAsElement() {

    Set<Person> people = new HashSet<>();

    Person p1 = new Person(1);
    people.add(p1);
    Person p2 = new Person(1);
    people.add(p2);

    // failing because 2 Persons were added to the Set but assertion is expecting only 1
    assertEquals(1, people.size());
    //assertEquals(2, people.size());
  }


}
