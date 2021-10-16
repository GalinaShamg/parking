package newproject;

import java.io.IOException;

public class CarsGotoParking extends Thread {
    //формируем поток машин
   int[] cars;
    int sum = 10; //предположим на парковке 10 мест для маленьких машин

    public void run() {
        int bigCount = 10; // число свободных мест для парковок больших машин, предположим их 10

        try {
            cars = new int[20];           // поток будет вмещать 20 машин
            for (int i = 0; i < cars.length; i++) {
                cars[i] = (int) (Math.random() * 20); //заполняем массив случайными целыми числами c 0 до 20 с промежутками 500 милисекунд
            }
            for (int i = 0; i < cars.length; i++) {
                System.out.print(cars[i] + " ");
                if (cars[i] % 2 == 0 | cars[i] == 0) {  //если машине досталось число четное или 0 - считаем, что она маленькая
                    CheckSmallParking();
                }
                   else {  //если машине досталось число нечетное - машина большая
                    bigCount--; //число свободных мест для больших уменьшается на 1
                    if (bigCount > 0) { //пока места есть, пишем, сколько их осталось
                        System.out.println("Машина большая,место есть, осталось мест" + bigCount);
                    }
                    else{
                       System.out.println("Больших мест нет, Посмотрим место у маленьких машин");
                           if (sum > 2 | sum==2) {
                               sum=sum-2;
                               System.out.println("Вы заняли 2 маленьких места, осталось мест" + sum);
                        } else {
                            System.out.println("Мест для больших нет");
                        }
                    }
                }
                }

            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }


}

    public void CheckSmallParking() {

        sum--;//число свободных мест уменьшается на 1
        if (sum > 0) { //пока места есть, пишем, сколько их осталось
            System.out.println("Машина маленькая,место есть, осталось мест" + sum);
        } else {
            System.out.println("Маленьких мест нет");
        }
    }

}



