public abstract class Transport implements Competing {
    private final String make;
    private final String model;
    private final double engineCapacity;


    public Transport(String make, String model, double engineCapacity) {
        this.make = validOrDefault(make, " Информация не указана ");
        this.model = validOrDefault(model, " Информация не указана ");
        this.engineCapacity = engineCapacity > 0.0f ? engineCapacity : 1.5f;

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

    @Override
    public String toString() {
        return
                "Марка = " + make +
                        ", модель = " + model + " , объем двигателя =  " + engineCapacity + " литров . ";

    }

    public abstract void refill();


    public abstract void startMoving();


    public abstract void finishTheMovement();
    public abstract void   determineTheTypeOfCar();

}
