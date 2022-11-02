public  class CategoryC extends Driver<Cargo> {
    public CategoryC(String fullName, String driverSLicense, int experience) {
        super(fullName, driverSLicense, experience);
    }


    @Override
    public void driveCar(Cargo Transport) {
        System.out.println("Водитель" + getFullName() + Transport.getMake());

    }
}
