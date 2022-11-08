import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport implements Competing {
    private final String make;
    private final String model;
    private final double engineCapacity;
    private List<Driver<?>>drivers= new ArrayList<>();
    private List<Mechanic<?>>mechanics= new ArrayList<>();
    private List<Sponsor>sponsors= new ArrayList<>();


    public Transport(String make, String model,
                     double engineCapacity) {
        this.make = validOrDefault(make, " Информация не указана ");
        this.model = validOrDefault(model, " Информация не указана ");
        this.engineCapacity = engineCapacity > 0.0f ? engineCapacity : 1.5f;
        //transports = new ArrayList<>();




    }

    public String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    @Override
    public String toString() {
        return
                "Марка = " + make +
                        ", модель = " + model + " , объем двигателя =  " + engineCapacity + " литров . ";

    }
    public void addDriver(Driver<?>...drivers){
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>...mechanics){
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors){
        this.sponsors.addAll(Arrays.asList(sponsors));
    }


    public abstract void refill();


    public abstract void startMoving();


    public abstract void finishTheMovement();

    public abstract void determineTheTypeOfCar();

    public abstract boolean passDiagnostics();
    public abstract void repair();

   // private ArrayList<Transport> transports;

}
