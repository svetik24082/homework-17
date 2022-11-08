public class Sponsor {
    private final String nameSponsor;
    private int sum;

    public String getNameSponsor() {
        return nameSponsor;
    }

    public int getSum() {
        return sum;
    }

    public Sponsor(String nameSponsor, int sum) {
        this.nameSponsor = nameSponsor;
        this.sum = sum;
    }

    public void sponsorTheRace(){// спонсир заезд
        System.out.println( " Спонсор" + nameSponsor + " проспонсировал заезд на" + sum);
    }

    @Override
    public String toString() {
        return " Назавание " + nameSponsor +
                ",сумма поддержки " + sum ;
    }
}

