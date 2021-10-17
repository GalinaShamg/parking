package newproject;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class CarsGoAway extends CarsGotoParking {
    int cars[];
    int sumfull=0; //предположим на парковке 0 свободных мест для маленьких машин
    int bigCount = 0; // число свободных мест для парковок больших машин, предположим их 10

    public void run() {

           try {
            cars = new int[20]; //надо соединить его с массивом, который въехал, но я не могу понять, как правильно это реализовать
            for (int i = 0; i < cars.length; i++) {
                cars[i] = (int) (Math.random() * 20); //заполняем массив случайными целыми числами c 0 до 20 с промежутками 500 милисекунд (чтобы понять они большие или мелкие)
            }
            for (int x = 0; x < cars.length; x++) {
                int removeIndex = (int) (Math.random() * 20); //выбираем в случайном порядке номер элемента в массиве - машины, которая
            try {
                if (cars[removeIndex] % 2 == 0 | cars[removeIndex] == 0) {
                    sumfull = sumfull+1; //количество свободных мест увеличивается на 1
                     System.out.println("уезжает маленькая машина, свободные места для мелких" +sumfull);

                    //узнаем какая машина уезжает, если число в случайно выбранной ячейки массива четное или 0 - маленькая
                } else {
                    bigCount=bigCount+1;
                    System.out.println("уезжает большая машина, свободные места для больших" +bigCount);//TODO как понять большая машина занимала 1 большое место или 2 маленьких?-подумать
                } //если число нечетное, уезжает большая машина //TODO например, когда машина занимает большое место ей присваивается номер по порядку в спец массиве, потом узнаем,какой номер по порядку и меняем либо bigCount либо sumfull на 2
                cars = removeTheElement(cars, removeIndex); //удаляем из массива определенную машину, сгенерированную случайным образом

            } catch (ArrayIndexOutOfBoundsException ae){
                System.out.println(ae);
            }
                Thread.sleep(5000);
            }} catch(Exception e){
                e.printStackTrace();
            }

        }

        public static int[] removeTheElement ( int[] cars, int removeIndex)
        { //метод удаляет из массива определенный элемент

            if (cars == null || removeIndex < 0 || removeIndex >= cars.length) {
                return cars;
            }

            List<Integer> arrayList = IntStream.of(cars).boxed().collect(Collectors.toList());
            arrayList.remove(removeIndex);
            return arrayList.stream().mapToInt(Integer::intValue).toArray();
        }

    }
