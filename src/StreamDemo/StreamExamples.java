package StreamDemo;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {
        /*
            A few of the data structure conversions I’ll be covering will be:
                List
                Map
                Map grouping
                Set
                Partitioning
                Grouping count elements
                Adding numbers
                Average numbers
                Using Car Class
        */
        StreamExamples.showAllStreams();
    }

    private static void showAllStreams() {

        Car car1 = new Car(1, "Maruti", 2);
        Car car2 = new Car(2, "Fiat", 4);
        Car car3 = new Car(1, "Fiat", 7);
        Car car4 = new Car(2, "Maruti", 7);

        /*List*/

        List<Car> carList = Stream.of(car1, car2)
                                .collect(Collectors.toList());

        System.out.println("Car List Displayed");
        System.out.println(carList);

        System.out.println("\n -------------------------- \n");
        /* Maps */

        Map<Integer, Car> carMap = Stream.of(car1, car2)
                                .collect(Collectors.toMap(car -> car.id, car -> car ));

        System.out.println("Car Map displayed");
        System.out.println(carMap);
        System.out.println("\n -------------------------- \n");

        /*Map Grouping*/

        Map<Integer, List<Car>> carGrouped = Stream.of(car1, car2, car3, car4)
                                        .collect(Collectors.groupingBy(car -> car.id));

        System.out.println("Car Map Grouping by Id displayed");
        System.out.println(carGrouped);
        System.out.println("\n -------------------------- \n");

        Map<String, List<Car>> carGroupedByName= Stream.of(car1, car2, car3, car4)
                                        .collect(Collectors.groupingBy(car -> car.name));

        System.out.println("Car Map Grouping by name displayed");
        System.out.println(carGroupedByName);
        System.out.println("\n -------------------------- \n");

        /*Set*/

        Set<Car> carSet = Stream.of(car1, car2, car3, car4)
                            .collect(Collectors.toSet());

        System.out.println("Car Set displayed");
        System.out.println(carSet);
        System.out.println("\n -------------------------- \n");

        /* Partitioning */

        Map<Boolean, List<Car>> carPartioningByCarSeat = Stream.of(car1, car2, car3, car4)
                                                .collect(Collectors.partitioningBy(car -> car.carSeat > 4));

        System.out.println("Car by partitioning by car Seats displayed");
        System.out.println(carPartioningByCarSeat);
        System.out.println("\n -------------------------- \n");

        /*Count per item map*/

        Map<Integer, Long> carCountPerItem = Stream.of(car1, car2,car3, car4)
                                                .collect(Collectors.groupingBy(car -> car.carSeat, Collectors.counting()));

        System.out.println("Car Count per Item by number of CarSeat displayed");
        System.out.println(carCountPerItem);
        System.out.println("\n -------------------------- \n");

        int totalNumberOfSeats = Stream.of(car1, car2, car3, car4)
                                                .collect(Collectors.summingInt(car -> car.carSeat));

        System.out.println("Car Seat sum displayed");
        System.out.println(totalNumberOfSeats);
        System.out.println("\n -------------------------- \n");

        int carSeatTotalForIdGreaterThan1 =  Stream.of(car1, car2, car3, car4)
                .filter(car -> car.id >1)
                        .collect(Collectors.summingInt(car -> car.carSeat));

        System.out.println("Car seats sum Id greater than 1");
        System.out.println(carSeatTotalForIdGreaterThan1);
        System.out.println("\n -------------------------- \n");

        int carSeatTotalForMaruti = Stream.of(car1, car2, car3, car4)
                                    .filter(car -> car.name == "Maruti")
                                    .collect(Collectors.summingInt(car -> car.carSeat));

        System.out.println("Car seat total for Maruti");
        System.out.println(carSeatTotalForMaruti);
        System.out.println("\n -------------------------- \n");

        Map<Integer, List<Car>> carsGroupedByCarSeat = Stream.of(car1, car2, car3, car4)
//                .collect(Collectors.toMap(car -> car.name, car -> car));
                .collect(Collectors.groupingBy(car -> car.carSeat));
        System.out.println("Car grouped by name displayed");
        System.out.println(carsGroupedByCarSeat);
        System.out.println("\n -------------------------- \n");

        Double averageNumberOfCarSeats = Stream.of(car1, car2, car3, car4)
                .collect(Collectors.averagingLong(car -> car.carSeat));
        System.out.println("Average Number Of car Seats displayed");
        System.out.println(averageNumberOfCarSeats);
        System.out.println("\n -------------------------- \n");



    }
}
