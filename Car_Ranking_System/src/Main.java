import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Car_Data c2 =  new Car_Data("tesla" , 280,2.3,20,8.0);
        Car_Data c1 =  new Car_Data("civic" , 180,21.3,90,8.5);
        Car_Data c3 =  new Car_Data("ford" , 320,8.2,80,7.5);
        Car_Data c4 =  new Car_Data("ford" , 320,8.2,80,7.5);
        Car_Data c5 =  new Car_Data("ford" , 320,8.2,80,7.5);
        Data_List finall = new Data_List(2);
        finall.addCar(c1);
        finall.addCar(c3);
        finall.addCar(c2);
        finall.addCar(c4);
        finall.addCar(c5);
        System.out.println(finall.capacity);
finall.sortCars();







//        System.out.println(finall.search(c2));
        System.out.println(finall);
//        System.out.println(c3.equals(c4));
//        System.out.println(c2.compareTo(c3));
//        Arrays.sort(finall.arr,new Car_DataComparator());
//        System.out.println(finall);




    }
}