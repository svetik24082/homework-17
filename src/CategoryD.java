public class CategoryD extends Driver<Bus> {
    public CategoryD(String fullName, String driverSLicense, int experience) {
        super(fullName, driverSLicense, experience);
    }

    @Override
    public void driveCar(Bus Transport) {
        System.out.println(getFullName() + getDriverSLicense());
    }
}
