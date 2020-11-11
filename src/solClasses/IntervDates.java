package src.solClasses;

public class IntervDates {
    private int interv;
    private int day;
    private int time;
    private int team;

    public IntervDates(int interv, int day, int time, int team) {
        super();
        this.interv = interv;
        this.day = day;
        this.time = time;
        this.team = team;
    }

    @Override
    public String toString() {
        return "IntervDates{" +
                "interv=" + interv +
                ", day=" + day +
                ", time=" + time +
                ", team=" + team +
                '}';
    }

    public int getInterv() {
        return this.interv;
    }

    public void setInterv(int interv) {
        this.interv = interv;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTeam() {
        return this.team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

}