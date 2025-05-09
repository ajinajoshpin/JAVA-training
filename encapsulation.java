public class encap {
    public static void main(String[] args) {
        // Creating an object of woobe class and initializing values using constructor
        woobe woo = new woobe(5588, "Priyaa", 28, "avadi", "8569854752");

        // Accessing private variable 'age' using getter
        System.out.println("The current age is " + woo.getAge());

        // Modifying private variable 'age' using setter
        woo.setAge(19);

        // Verifying updated age
        System.out.println("The age after setting is " + woo.getAge());
    }
}

// Encapsulated class with private data members
class woobe {
    private int id;
    private String name;
    private int age;
    private String address;
    private String phno;

    // Constructor to initialize values
    woobe(int id, String name, int age, String address, String phno) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phno = phno;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for phone number
    public String getPhno() {
        return phno;
    }
    public void setPhno(String phno) {
        this.phno = phno;
    }
}
