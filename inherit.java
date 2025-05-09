public class inherit {
    public static void main(String[] args) {

        Driver driver = new Driver();
        driver.phno="1234567890";
        driver.welcome();
        driver.parentWelcome();

        
    }
    
}

class wooberUser{
    int id;
    String name;
    int age;
    String address;
    String phno;

    public void welcome(){
        System.out.println("Welcme woober user");
    }
}

class User extends wooberUser{
    //int id;
    //String name;
    //int age;
   // String address;
   // String phno;
    String perName;
}

class Driver extends wooberUser {
    //int id;
    //String name;
    //int age;
    //String address;
   // String phno;

    String vehicleName;
    String vehilceNumber;

    public void welcome(){
        System.out.println("Welcme woober Driver");
    }

    public void parentWelcome()
    {
        super.welcome();
    }

}
