import jdk.jfr.Category;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Mechanic<Car> ivan = new Mechanic<>("Иван", "Грозный", "Раша");
        Mechanic<Transport> petr = new Mechanic<>("Петр", "Зимний", "Раша");
        Sponsor rosnefty = new Sponsor("Роснефть", 3_500_000);
        Sponsor nokian = new Sponsor("нокиан", 2_500_000);
        Car car = new Car("Лада", "Гранта", 0, BodyType.SEDAN);

        car.addDriver(new DriverB(" А", 10, car));
        car.addMechanic(ivan);
        car.addSponsor(rosnefty, nokian);
        Car car1 = new Car(" Audi ", " A8 50 L TDI quattro ",
                3.0, BodyType.CROSSOVER);

        Car car2 = new Car(" BMW ", " Z8 ", 3.0, BodyType.SEDAN);
        Car car3 = new Car(" Kia ", " Sportage 4-го поколения",
                2.4, BodyType.SEDAN);

        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println();
        car.startMoving();
        car.finishTheMovement();
        car.pitStop();
        car.bestLapTime();
        car.maximumSpeed();
        car.refill();

        System.out.println();


        Bus bus = new Bus(" Икарус", "250", 0, TypeOfCapacity.LARGE);
        bus.addDriver(new DriverD("A", 5, bus));
        bus.addMechanic(petr);
        bus.addSponsor(nokian);
        Bus bus1 = new Bus(" ПАЗ", "32053", 16, TypeOfCapacity.SMALL);
        Bus bus2 = new Bus(" Вольво", null, 17, TypeOfCapacity.MEDIUM);
        Bus bus3 = new Bus(" Ман", "Lion's Citi", 15, TypeOfCapacity.ESPECIALLY_BIG);
        System.out.println(bus);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println();
        bus.startMoving();
        bus.finishTheMovement();
        bus.pitStop();
        bus.bestLapTime();
        bus.maximumSpeed();
        bus.refill();
        System.out.println();

        Cargo cargo = new Cargo(" Камаз", "4310", 20, TypeOfLoadCapacity.N1);
        cargo.addDriver(new DriverC("A", 5, cargo));
        cargo.addMechanic(petr);
        cargo.addSponsor(nokian);
        Cargo cargo1 = new Cargo(" Урал", "4320", 30, TypeOfLoadCapacity.N2);
        Cargo cargo2 = new Cargo(" Валдай", "Next", 25, TypeOfLoadCapacity.N3);
        Cargo cargo3 = new Cargo(" Маз", "4570", 0, TypeOfLoadCapacity.N1);

        System.out.println(cargo);
        System.out.println(cargo1);
        System.out.println(cargo2);
        System.out.println(cargo3);
        System.out.println();
        cargo.startMoving();
        cargo.finishTheMovement();
        cargo.pitStop();
        cargo.bestLapTime();
        cargo.maximumSpeed();
        System.out.println();
        passDiagnostics(car, car1, car2, car3,
                cargo, cargo1, cargo2, cargo3,
                bus, bus1, bus2, bus3);
        System.out.println();

        Driver driverB = new DriverB("А", 5, car1);
        Driver driverC = new DriverC("A", 5, cargo1);
        Driver driverD = new DriverD("A", 5, bus1);

        List<Transport> transports = List.of(car,
                cargo,
                bus);


            ServiceStation serviceStation = new ServiceStation();
            serviceStation.addCar(car);
            serviceStation.addCargo(cargo);
            serviceStation.service();
            serviceStation.service();

        for (Transport transport:transports){
            printInfo(transport);
        }
    }
    private static void printInfo(Transport transport){
        System.out.println(" Информация по автомобилю " +
                transport.getMake()+" "+ transport.getModel());
        System.out.println(" Водитель " + transport.getDrivers());


        System.out.println(" Спонсор " + transport.getSponsors()  );

        System.out.println(" Механик " + transport.getMechanics() );

        System.out.println();


        //System.out.println(driverB);
        //System.out.println(driverC);
        //System.out.println(driverD);

        //car.determineTheTypeOfCar();
        //cargo.determineTheTypeOfCar();
        //bus.determineTheTypeOfCar();
    }
    private static void passDiagnostics(Transport...transports){
        for (Transport transport:transports){

                serviceTransport(transport);
            }

                }




private static void serviceTransport(Transport transport) {
    try {
        if (!transport.passDiagnostics()) {
            throw new RuntimeException(" Автомобиль" + transport.getMake() +
                    " " + transport.getModel() + " не прошел диагностику");
        }
    } catch (RuntimeException c) {
        System.out.println(c.getMessage());
    }
}
//private static ArrayList<Driver>drivers;

}


