package StreamDemo;

public class Car {

    int id;
    String name;
    int carSeat;

    public Car(int count, String name, int carSeat) {
        this.id = count;
        this.name = name;
        this.carSeat = carSeat;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", carSeat='" + carSeat + '\'' +
                '}';
    }
}
