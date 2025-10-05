import java.util.Comparator;

public class Car_Data  implements Comparable<Car_Data>{
    String carName;
    int TopSpeed;
    Double Milege;
    long Price;
    Double SafetyRating;
//Speed → 30%
//Mileage → 20%
//Price → 20%
//Safety → 30%
    Double formula ;

    public Car_Data(String carName, int topSpeed, Double milege, long price, Double safetyRating) {
        this.carName = carName;
        TopSpeed = topSpeed;
        Milege = milege;
        Price = price;
        SafetyRating = safetyRating;
        formula =  (TopSpeed*0.3) + (Milege*0.2) + (SafetyRating*0.3) - (Price * 0.2);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // reference same hai
        if (!(o instanceof Car_Data)) return false; // wrong type

        Car_Data e = (Car_Data) o;

        return this.carName.equals(e.carName) &&
                this.Milege.equals(e.Milege) &&
                this.Price == e.Price &&
                this.SafetyRating.equals(e.SafetyRating)&&
                this.TopSpeed == e.TopSpeed;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("CarName : ");
        s.append(carName);
        s.append("\n");
        s.append("Topspeed : ");
        s.append(TopSpeed);
        s.append("\n");
        s.append("Milege : ");
        s.append(Milege);
        s.append("\n");
        s.append("Price : ");
        s.append(Price);
        s.append("\n");
        s.append("Safety : ");
        s.append(SafetyRating);
        s.append("\n");
        s.append("AuctionRating : ");
        s.append(String.format("%.1f",formula));
        s.append("\n");
        return s.toString();
    }

//    @Override
//    public int compareTo(Car_Data o) {
//        return this.formula.compareTo(o.formula);
//    }

//class Car_DataComparator implements Comparator<Car_Data> {
//    @Override
//    public int compare(Car_Data o1, Car_Data o2) {
//        int result = Long.compare(o2.Price, o1.Price);
//        if(result == 0){
//            return Double.compare(o2.Milege, o1.Milege);
//        }
//        return result;
//    }
    public int compareTo(Car_Data o) {
        return this.formula.compareTo(o.formula);
    }}
