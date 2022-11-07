public class Cargo extends Transport implements Competing {
    private TypeOfLoadCapacity typeOfLoadCapacity;
    public Cargo(String make, String model, double engineCapacity,
                 TypeOfLoadCapacity typeOfLoadCapacity) {
        super(make, model, engineCapacity);
        this.typeOfLoadCapacity=typeOfLoadCapacity;
    }

    @Override
    public void refill() {
        System.out.println(" Запрвить грузовик дизелем  на завправке");

    }

    @Override
    public void startMoving() {
        System.out.println("начать движение грузовика");

    }

    @Override
    public void finishTheMovement() {
        System.out.println("закончить движение грузовика");

    }

    @Override
    public void determineTheTypeOfCar() {
        if (typeOfLoadCapacity==null) {
            System.out.println(" Данных по авто не достаточно");
        }else {
            String from = typeOfLoadCapacity.getFrom() ==null? "" : " от " + typeOfLoadCapacity.getFrom() + "";
            String to = typeOfLoadCapacity.getTo() ==null? "" : " до " + typeOfLoadCapacity.getTo();
            System.out.println(" Грузоподъемность авто " + from+ to);
        }

    }

    @Override
    public boolean passDiagnostics() {
        return Math.random()> 0.75;
    }


    @Override
    public String pitStop() {
        System.out.println(" Сделать остановку для грузового автомобиля ");
        return null;
    }

    @Override
    public double bestLapTime() {
        System.out.println(" Лучшее время у грузового автомобиля ");
        return 0;
    }

    @Override
    public float maximumSpeed() {
        System.out.println(" Максимальная скорость у грузового автомобиля ");
        return 0;
    }

    public TypeOfLoadCapacity getTypeOfLoadCapacity() {
        return typeOfLoadCapacity;
    }

    public void setTypeOfLoadCapacity(TypeOfLoadCapacity typeOfLoadCapacity) {
        this.typeOfLoadCapacity = typeOfLoadCapacity;
    }
}
