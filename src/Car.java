public class Car extends Transport implements Competing {
    private BodyType bodyType;
    public Car(String make, String model, double engineCapacity,
               BodyType bodyType) {
        super(make, model, engineCapacity);
        this.bodyType= bodyType;
    }

    @Override
    public void refill() {
        System.out.println(" Запрвить автомобиль бензином  на завправке");

    }

    @Override
    public void startMoving() {
        System.out.println("начать движение");

    }

    @Override
    public void finishTheMovement() {
        System.out.println("закончить движение");

    }

    @Override
    public void determineTheTypeOfCar() {
        if (bodyType==null) {
            System.out.println(" Данных по авто не достаточно");
        }else {
            System.out.println(" Тип кузова авто " + bodyType);
        }

    }

    @Override
    public boolean passDiagnostics() {
        return Math.random()> 0.7;
    }

    @Override
    public void repair() {
        System.out.println( " Машина" + getMake() + " "+getModel()+ " починена" );


    }


    @Override
    public String pitStop() {
        System.out.println(" Сделать остановку для легкового автомобиля ");
        return null;
    }

    @Override
    public double bestLapTime() {
        System.out.println(" Лучшее время у легкового автомобиля ");
        return 0;
    }

    @Override
    public float maximumSpeed() {
        System.out.println(" Максимальная скорость легкового автомобиля ");
        return 0;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}

