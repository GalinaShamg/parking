package newproject;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//TODO подключить 1 общую парковку, сейчас реализованы 2 отдельные -подумать, не получается у меня реализовать парковку в едином классе с методами приехал, уехал
//TODO подумать, как реализовать 1 объект класса Парковка, его синхронизировать с потоками, чтобы они подключались попеременно (заполняя, опустошая), пока не получилось
        CarsGotoParking thread1 = new CarsGotoParking();
        CarsGoAway thread2 = new CarsGoAway();

        thread1.start(); //пошел поток, заполняющий парковку
        thread2.start(); //пошел поток, опустошающий парковку


    }
}