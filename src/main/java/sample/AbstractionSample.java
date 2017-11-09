package main.java.sample;

/**
 TODO refactor the Car to use dependency injection of the engine
 TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
 TODO make sure we have no-op implementations of the gas engine and electric engine

public class AbstractionSample {

  public static class Car {

    private GasEngine engine = new GasEngine();

    public Car() {
    }

    public void moveForward() {
      engine.spinWheels();
    }
  }

  public static class GasEngine {
    public void spinWheels() {
      // no-op for now
    }
  }
} */


public class AbstractionSample {

  public static class Car {


    //@Inject if Engine was created in a container
    //@Autowired if container is spring framework
    private Engine engine;

    public Car() {
    }

    public void moveForward() {
      engine.spinWheels();
    }
  }

  public interface Engine {
    void spinWheels();
  }

  public static class GasEngine implements Engine {
    public void spinWheels() {
      // no-op for now
    }
  }

  public static class ElectricEngine implements Engine {
    public void spinWheels() {
      // no-op for now
    }
  }
}