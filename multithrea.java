public class multithread extends Thread {
    public static void main(String[] args) {

        multithread multi = new multithread();
        multi.start(); // use start for multithread

        multithread multi1 = new multithread();
        multi1.start();

        multithread multi2 = new multithread();
        multi2.start();
        
    }

    @Override
    public void run(){
        for(int i =0;i< 20;i++)
        {
            System.out.println(i);
        }
    }
    
}
