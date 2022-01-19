public class Car {
//    Car() {
//        color = "Pink";
//    }
    {
        color = "blue";
    }
    String color = "red";
    String type = "Sedan";

    {
        color = "Blue 2";
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.toString());
    }
}
