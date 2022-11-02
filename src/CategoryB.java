public class CategoryB extends Driver<Car> {
    public CategoryB(String fullName, String driverSLicense, int experience) {
        super(fullName, driverSLicense, experience);
    }


    @Override
    public void driveCar(Car Transport) {
        System.out.println("Водитель" + getFullName() + Transport.getMake());

    }

}
