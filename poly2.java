public class poly2 {
    public static void main(String [] args){
        Anil anil=new Anil();
        anil.makeSound();
    }
}
class Animal{
    public void makeSound(){
        System.out.println("animal");

    }
}
class Anil extends Animal{
    @Override
    public void makeSound(){
        System.out.println("bow bow");
    }
}
