import java.util.Objects;

public class Driver <T extends Transport> {
    private  final  String fullName;
    private String driverSLicense;
    private int experience;
    private  T car;


    public Driver(String fullName, String driverSLicense, int experience, T car) {
        this.fullName = validOrDefault(fullName, " Информация не указана");
        this.driverSLicense = validOrDefault(driverSLicense, " Информация не указана ");
        this.experience = experience > 0.0 ? experience : 10;
        //this.car=car;
        setCar(car);
    }

    public String toString() {
        return "Водитель " +
                fullName +
                ", управляет автомобилем " + car.getMake() + " " + car.getModel() +
                " , будет учавствовать в заезде. "+
          fullName+ driverSLicense+experience;

    }



    public String getFullName() {
        return fullName;
    }

    public String getDriverSLicense() {
        return driverSLicense;
    }

    public void setCar(T car) {
        if (car==null){
            throw new IllegalArgumentException( " Необходимо указать тип прав ");
        }
        this.car = car;
    }

    public T getCar() {
        return car;
    }

    public void setDriverSLicense(String driverSLicense) {
        this.driverSLicense = validOrDefault(driverSLicense, " Информация не указана ");
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience > 0.0 ? experience : 10;
    }

    public void refill() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience && Objects.equals(fullName, driver.fullName) && Objects.equals(driverSLicense, driver.driverSLicense) && Objects.equals(car, driver.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverSLicense, experience, car);
    }

    public String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;


        }
    }
}
