import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Class6 {

    public static void main(String... args){
        List<Car> cars = new ArrayList<>(Arrays.asList(
                new Car(2020, "Ford", "Focus"),
                new Car(1990, "Dodge", "Challenger"),
                new Car(2019, "dodge", "1500"),
                new Car(2015, "Subaru", "Outback"),
                new Car(1995, "Audi", "G150")));

        cars.sort(Comparator.comparing(Car::getYear).reversed());

        cars.forEach(car -> System.out.println(car.getModel()));

//        List<MyCar> newCars = cars.stream()
//                .map(car -> new MyCar(car.getMake(), car.getModel(), "foo"))
//                .collect(Collectors.toList());
//        newCars.forEach(newCar -> System.out.println(newCar.getModel()));
//
//        List<String> models = cars.stream().map(Car::getModel).collect(Collectors.toList());
//        System.out.println(models);

//        cars.stream().filter(car -> car.getMake().equalsIgnoreCase("dodge")).forEach(car -> System.out.println(car.getModel()));
//        cars.stream().filter(car -> car.getYear() > 2019 || car.getYear() < 1994).forEach(car -> System.out.println(car.getModel()));

//        List<String> names = new ArrayList<>(Arrays.asList("Foo", "Bar", "Evan", "Kayla", "Egg"));

//        names.forEach(name -> {
//            if(name.length() <= 3 ){
//                System.out.println("Hey, " + name + ". You have a short name");
//            } else {
//                System.out.println("Hello " + name);
//            }
//        });

//        names.stream().filter(name -> name.startsWith("E") && name.length() > 3 || name.contains("a")).forEach(System.out::println);
    }

    private static class MyCar{
        private String make;

        public MyCar(String make, String model, String something) {
            this.make = make;
            this.model = model;
            this.something = something;
        }

        private String model;
        private String something;

        public String getMake() {
            return make;
        }

        public MyCar setMake(String make) {
            this.make = make;
            return this;
        }

        public String getModel() {
            return model;
        }

        public MyCar setModel(String model) {
            this.model = model;
            return this;
        }

        public String getSomething() {
            return something;
        }

        public MyCar setSomething(String something) {
            this.something = something;
            return this;
        }
    }

    private static class Car {
        public Car(int year, String make, String model) {
            this.year = year;
            this.make = make;
            this.model = model;
        }

        private int year;
        private String make;
        private String model;

        public int getYear() {
            return year;
        }

        public Car setYear(int year) {
            this.year = year;
            return this;
        }

        public String getMake() {
            return make;
        }

        public Car setMake(String make) {
            this.make = make;
            return this;
        }

        public String getModel() {
            return model;
        }

        public Car setModel(String model) {
            this.model = model;
            return this;
        }
    }

}
