package newproject;

public class Main {

    public static void main(String[] args) throws InterruptedException {


            CarsGotoParking thread1 = new CarsGotoParking(); //
        CarsGoAway thread2 = new CarsGoAway();//
        thread1.start(); //пошел поток, заполняющий парковку
        thread2.start();


    }
}




