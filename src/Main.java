public class Main {


    public static void main(String[] args) {
        Car car = new Car("Лада", null, 0, BodyType.SEDAN);
        //car.refill();
        Car car1 = new Car(" Audi ", " A8 50 L TDI quattro ",
                3.0, BodyType.CROSSOVER);

        Car car2 = new Car(" BMW ", " Z8 ", 3.0, BodyType.SEDAN);
        Car car3 = new Car(" Kia ", " Sportage 4-го поколения",
                2.4, BodyType.SEDAN);

        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        car.startMoving();
        car.finishTheMovement();
        car.pitStop();
        car.bestLapTime();
        car.maximumSpeed();
        car.refill();

        System.out.println();


        Bus bus = new Bus(" Икарус", "250", 0, TypeOfCapacity.LARGE);
        Bus bus1 = new Bus(" ПАЗ", "32053", 16, TypeOfCapacity.SMALL);
        Bus bus2 = new Bus(" Вольво", null, 17, TypeOfCapacity.MEDIUM);
        Bus bus3 = new Bus(" Ман", "Lion's Citi", 15, TypeOfCapacity.ESPECIALLY_BIG);
        System.out.println(bus);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        bus.startMoving();
        bus.finishTheMovement();
        bus.pitStop();
        bus.bestLapTime();
        bus.maximumSpeed();
        bus.refill();
        System.out.println();

        Cargo cargo = new Cargo(" Камаз", "4310", 20, TypeOfLoadCapacity.N1);
        Cargo cargo1 = new Cargo(" Урал", "4320", 30, TypeOfLoadCapacity.N2);
        Cargo cargo2 = new Cargo(" Валдай", "Next", 25, TypeOfLoadCapacity.N3);
        Cargo cargo3 = new Cargo(" Маз", "4570", 0, TypeOfLoadCapacity.N1);

        System.out.println(cargo);
        System.out.println(cargo1);
        System.out.println(cargo2);
        System.out.println(cargo3);
        cargo.startMoving();
        cargo.finishTheMovement();
        cargo.pitStop();
        cargo.bestLapTime();
        cargo.maximumSpeed();

        Driver<Car> driver = new Driver<>("А", "В", 15);
        Driver<Cargo> driver1 = new Driver<>("A", "C", 20);
        Driver<Bus> driver2 = new Driver<>("A", "Д", 20);


        driver.driveCar(car);
        driver1.driveCar(cargo);
        driver2.driveCar(bus);

        
        car.determineTheTypeOfCar();
        cargo.determineTheTypeOfCar();
        bus.determineTheTypeOfCar();


    }}

