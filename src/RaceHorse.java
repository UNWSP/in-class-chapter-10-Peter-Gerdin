import java.util.Date;

public class RaceHorse extends Horse {
    int races;

    public RaceHorse(String name, String color, int birthYear, int races) {
        super(name, color, birthYear);
        this.races = races;
    }

    public void setRaces(int races) {
        this.races = races;
    }

    public int getRaces() {
        return races;
    }
}
