import java.util.Arrays;

public class Data_List  {
int capacity ;
int size = 0;
Car_Data[] arr ;
Car_Data[] temporaryarr;
Data_List(){
    capacity = 10;
    arr= new Car_Data[capacity];
}
Data_List(int capacity){
    this.capacity = capacity;
    arr = new Car_Data[this.capacity];

}
Data_List(int capacity , Car_Data[] newarray){
    this.capacity = capacity;
    this.arr = newarray;
}


    public  void addCar(Car_Data newcar){
    if(size==capacity){
extandcapacity(capacity*2);
        arr[size++] = newcar;
    }else{
        arr[size++] = newcar;

    }
    }

    public void remove(Car_Data oldcar){
    int index = search(oldcar.carName);
    if(index != -1) {
arr[index] = null;
        for (int i = index; i < size - 1; i++) {
            Car_Data temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    else{
        System.out.println("not foundddddddddd");
    }
    }
    public void extandcapacity(int capacity){
    this.capacity = capacity;
temporaryarr = new Car_Data[capacity];
for(int i = 0 ; i <arr.length ;i++){
    temporaryarr[i] = arr[i];
}
arr=temporaryarr;
    }
    @Override
    public String toString() {
       StringBuilder s = new StringBuilder();
       for(int i = 0 ; i < arr.length ; i++){
           s.append(arr[i]);
           s.append("\n");
       }
       return  s.toString();
    }


    //searching method by name
    public int search(String name){
        for(int i = 0 ; i < arr.length;i++){
            if(name.equals(arr[i].carName)){
                return i;
            }
        }
        return -1;
    }

    //searching method by  obj
    public int search(Car_Data e){
        for(int i = 0 ; i < arr.length ; i++){
            if(e.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }
    public void sortCars() {
        Car_Data[] temp = new Car_Data[size];  // sirf filled part ka array
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp); // normal sort
        arr = temp; // wapas same reference me save kar diya
    }
    //sorting





}
