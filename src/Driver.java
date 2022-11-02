public class Driver <T extends Transport> {
    private String fullName;
    private String driverSLicense;
    private int experience;


    public Driver(String fullName, String driverSLicense, int experience) {
        this.fullName = validOrDefault(fullName, " Информация не указана");
        this.driverSLicense = validOrDefault(driverSLicense, " Информация не указана ");
        this.experience = experience > 0.0 ? experience : 10;
    }

    public void driveCar(T transport) {
        System.out.println("водитель " + getFullName() + " управляет автомобилем " + transport.getMake() + " и будет участвовать в заезде.");

    }

    public void setFullName(String fullName) {
        this.fullName = validOrDefault(fullName, " Информация не указана");
    }

    public String getFullName() {
        return fullName;
    }

    public String getDriverSLicense() {
        return driverSLicense;
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


    public String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;


        }
    }
}
