public class Abs {
    public static void main(String[] args) {
        car carr = new car();
        carr.complainReg(); // Calls the concrete method implemented in car
        carr.speedCheck(); // Calls the concrete method implemented in car
        carr.concreteMethod(); // Calls the concrete method from Vehicle class

        serviceManager manager = new serviceManager();
        manager.cleanLocation(); // Executes method from location interface
        manager.hourlyMessage(); // Executes method from location interface
        manager.showId(); // Executes method from defaultUser interface
    }
}

// Abstract class Vehicle: Represents a vehicle and its general attributes and behaviors.
abstract class Vehicle {
    int vehId;
    String name;

    // Abstract methods; these must be implemented by subclasses.
    public abstract void complainReg();
    public abstract void speedCheck();

    // Concrete method that can be used as is by subclasses.
    public void concreteMethod() {
        System.out.println("This is a concrete method");
    }
}

// Concrete class 'car' inherits from abstract Vehicle class and implements the abstract methods.
class car extends Vehicle {

    @Override
    public void complainReg() {
        System.out.println("Checked for compliance");
    }

    @Override
    public void speedCheck() {
        System.out.println("Check for speed");
    }
}

// Abstract class 'car1' inherits from Vehicle but doesn't implement the 'speedCheck' method.
abstract class car1 extends Vehicle {

    @Override
    public void complainReg() {
        System.out.println("Checked for compliance");
    }

    // Note: 'speedCheck' is not implemented in car1, leaving it for concrete subclasses.
}

// Interface location with abstract methods.
interface location {

    void cleanLocation(); // Method to clean location
    void hourlyMessage(); // Method for hourly updates
}

// Interface defaultUser with an abstract method.
interface defaultUser {
    void showId(); // Method to show user ID
}

// serviceManager class implements both location and defaultUser interfaces.
class serviceManager implements location, defaultUser {

    @Override
    public void cleanLocation() {
        System.out.println("Location cleaned");
    }

    @Override
    public void hourlyMessage() {
        System.out.println("Hourly message displayed");
    }

    @Override
    public void showId() {
        System.out.println("User ID: 12345");
    }
}
