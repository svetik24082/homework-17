import java.util.Objects;

public class Bus extends Transport implements Competing {


    private TypeOfCapacity typeOfCapacity;


    public Bus(String make, String model, double engineCapacity, TypeOfCapacity typeOfCapacity) {
        super(make, model, engineCapacity);
        this.typeOfCapacity = typeOfCapacity;

    }

    @Override
    public void refill() {
        System.out.println(" Запрвить автомобиль дизелем  на завправке");

    }

    @Override
    public void startMoving() {
        System.out.println("начать движение автобуса");

    }

    @Override
    public void finishTheMovement() {
        System.out.println("закончить движение автобуса");

    }

    @Override
    public void determineTheTypeOfCar() {
        if (typeOfCapacity == null) {
            System.out.println(" Данных по авто не достаточно");
        } else {

            System.out.println(" Вместимость автобуса " + typeOfCapacity.getFrom() + " до " +
                    typeOfCapacity.getTo());

        }
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println(" Автобус" + getMake() + " " + getModel() + " диагностика не требуется ");
        return true;
    }

    @Override
    public void repair() {
        System.out.println(" Автобус" + getMake() + " " + getModel() + " починена");


    }

    @Override
    public boolean service() {
        return Math.random() > 0.9;
    }


    @Override
    public String pitStop() {
        System.out.println(" Сделать остановку для автобуса ");
        return null;

    }

    @Override
    public double bestLapTime() {
        System.out.println(" Лучшее время на гонке у автобуса");
        return 0;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return typeOfCapacity == bus.typeOfCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfCapacity);
    }

    @Override
    public float maximumSpeed() {

        System.out.println(" Максимальная скорость автобуса ");
        return 0;
    }

    public TypeOfCapacity getTypeOfCapacity() {
        return typeOfCapacity;
    }

    public void setTypeOfCapacity(TypeOfCapacity typeOfCapacity) {
        this.typeOfCapacity = typeOfCapacity;
    }

}

