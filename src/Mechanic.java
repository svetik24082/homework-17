public class Mechanic  <T extends Transport>{
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
    public boolean   service (T t){//провести техобсл

        return t.passDiagnostics();
    }
    public void repair(T t){

    }

    @Override
    public String toString() {
        return "Имя " + name +
                ",фамилия " + surName +
                ", название компании " + companyName ;
    }
}
