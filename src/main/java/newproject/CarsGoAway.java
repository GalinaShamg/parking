package newproject;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class CarsGoAway extends CarsGotoParking {


    public void away() {
        for (int x = 0; x < cars.length; x++)
            try {
                cars = removeTheElement(cars, removeIndex);
                Thread.sleep(6000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        System.out.println("Уехала машина порядковый номер" + removeIndex);
    }

    int removeIndex = (int) (Math.random() * 20); //выбираем в случайном порядке номер элемента в массиве - машины, которая уедет
    public static int[] removeTheElement(int[] cars, int removeIndex) {
               if (cars == null || removeIndex < 0 || removeIndex >= cars.length) {
                return cars;
            }

            List<Integer> arrayList = IntStream.of(cars).boxed().collect(Collectors.toList());
            arrayList.remove(removeIndex);
            return arrayList.stream().mapToInt(Integer::intValue).toArray();
            }

        }







