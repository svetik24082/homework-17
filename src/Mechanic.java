import java.util.Objects;

public class Mechanic<T extends Transport> {
    private final String name;
    private final String surName;
    private final String companyName;

    public Mechanic(String name, String surName, String companyName) {
        this.name = name;
        this.surName = surName;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public boolean service(T t) {//провести техобсл

        return t.passDiagnostics();
    }

    public void repair(T t) {

    }

    @Override
    public String toString() {
        return "Имя " + name +
                ",фамилия " + surName +
                ", название компании " + companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(surName, mechanic.surName) && Objects.equals(companyName, mechanic.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, companyName);
    }
}
