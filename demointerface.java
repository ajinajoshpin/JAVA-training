public class demoInterface {
    public static void main(String[] args) {

        //dummyAbs da = new dummyAbs();  cannot create an object for the interface 

        HybridCar innova = new HybridCar();
        innova.callThis();

        
        
        
        
    }
    
}
/*abstract class dummyAbs{ // abstract class
    public abstract void callThis(); // asbstract method

    public abstract void callThat();
    // insted of this we can use interface
    //no need to use abstract key word again and again
}*/

interface ElectricCar{ 
    public  void callThis();

    public void callThat();
}
interface PetrolCar{ 
    public  void dummyCaller1();

    public void dummyCaller2();
}

// class that inherits both of the above property

class HybridCar implements ElectricCar, PetrolCar{

    @Override
    public void dummyCaller1() {
        System.out.println("This is Dummy caller 1");
    }

    @Override
    public void dummyCaller2() {
        System.out.println("This is Dummy caller 2");
        
    }

    @Override
    public void callThis() {
        System.out.println("Calling this function");
        
    }

   @Override
    public void callThat() {
        System.out.println("Calling that function");
       
    }

}
