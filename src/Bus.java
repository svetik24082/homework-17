public class Bus extends Transport implements Competing {


        private TypeOfCapacity typeOfCapacity;





    public Bus(String make, String model, double engineCapacity, TypeOfCapacity typeOfCapacity) {
        super(make, model, engineCapacity);
        this.typeOfCapacity=typeOfCapacity;

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
            //String from = typeOfCapacity.getFrom() ==null? "" : " от " + typeOfCapacity.getFrom() + "";
            //String to = typeOfCapacity.getTo() ==null? "" : " до " + typeOfCapacity.getTo();
            System.out.println(" Вместимость автобуса " + typeOfCapacity.getFrom() + " до " +
                    typeOfCapacity.getTo());

        }
    }


        @Override
        public String pitStop () {
            System.out.println(" Сделать остановку для автобуса ");
            return null;

        }

        @Override
        public double bestLapTime () {
            System.out.println(" Лучшее время на гонке у автобуса");
            return 0;

        }

        @Override
        public float maximumSpeed () {

            System.out.println(" Максимальная скорость автобуса ");
            return 0;
        }
        public TypeOfCapacity getTypeOfCapacity () {
            return typeOfCapacity;
        }

        public void setTypeOfCapacity (TypeOfCapacity typeOfCapacity){
            this.typeOfCapacity = typeOfCapacity;
        }

    }

