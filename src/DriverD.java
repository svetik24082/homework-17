public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, int experience, Bus car) {
        super(fullName, " D ", experience, car);
    }

    @Override
    public String toString() {
        return "D";
    }
}
